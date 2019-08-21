package com.sms.serviceimpl;

import com.github.pagehelper.PageInfo;
import com.sms.entity.SalesMember;
import com.sms.entity.SendMemberSms;
import com.sms.entity.SendMemberSmsBatchTotal;
import com.sms.entity.SendMemberSmsMemberTotal;
import com.sms.mapper.*;
import com.sms.service.SalesMemberService;
import com.sms.utils.Constants;
import com.sms.utils.PageHelperNew;
import com.sms.utils.Result;
import com.sms.utils.SmsSendUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import java.util.*;

/**
 * @author luo
 */
@Transactional(rollbackFor = Exception.class)
@Service
public class SalesMemberServiceImpl implements SalesMemberService{
    @Autowired
    private SalesMemberMapper salesMemberMapper;
    @Autowired
    private SendMemberSmsMapper sendMemberSmsMapper;
    @Autowired
    private ShopMemberMapper shopMemberMapper;
    @Autowired
    private SendMemberSmsBatchTotalMapper sendMemberSmsBatchTotalMapper;
    @Autowired
    private SendMemberSmsMemberTotalMapper sendMemberSmsMemberTotalMapper;
    @Override
    public Result selectSalesMemberMobileList(Date startTime, Date endTime) {
        Result result = new Result();
        String code = Constants.FAIL;
        String msg = "初始化";
        try {
            Map<String,Object> params = new HashMap<>(16);
            params.put("startTime",startTime);
            params.put("endTime",endTime);
            List<SalesMember> salesMembers = salesMemberMapper.selectByCurrentLoginTime(params);
            code = Constants.SUCCESS;
            msg = "查询成功";
            result.setData(salesMembers);
        }catch (Exception e){
            e.printStackTrace();
            code = Constants.ERROR;
            msg = "系统繁忙";
        }
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

    @Override
    public Result selectSalesMemberMobilePage(Integer pageNum, Integer pageSize, Date startTime, Date endTime) {
        Result result = new Result();
        String code = Constants.FAIL;
        String msg = "初始化";
        try {
            Map<String,Object> params = new HashMap<>(16);
            params.put("startTime",startTime);
            params.put("endTime",endTime);
            PageHelperNew.startPage(pageNum,pageSize);
            List<SalesMember> salesMembers = salesMemberMapper.selectByCurrentLoginTime(params);
            PageInfo<SalesMember> page = new PageInfo<>(salesMembers);
            code = Constants.SUCCESS;
            msg = "查询成功";
            result.setData(page);
        }catch (Exception e){
            e.printStackTrace();
            code = Constants.ERROR;
            msg = "系统繁忙";
        }
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

    @Override
    public Result selectSalesMemberMobileListAndSendSms(Date startTime, Date endTime) {
        Result result = new Result();
        String code = Constants.FAIL;
        String msg = "初始化";
        try {
            if(startTime == null){
                code = "-1";
                msg = "开始时间段必填";
                result.setMsg(msg);
                result.setCode(code);
                return result;
            }
            if(endTime == null){
                code = "-2";
                msg = "结束时间段必填";
                result.setMsg(msg);
                result.setCode(code);
                return result;
            }
            Map<String,Object> params = new HashMap<>(16);
            params.put("startTime",startTime);
            params.put("endTime",endTime);
            //List<SalesMember> salesMembers = salesMemberMapper.selectByCurrentLoginTime(params);
            List<SalesMember> salesMembers = new ArrayList<>();
            SalesMember salesMemberluo = salesMemberMapper.selectByPrimaryKey(55033L);
            salesMembers.add(salesMemberluo);
            if(salesMembers.isEmpty()){
                code = "-3";
                msg = "无数据";
                result.setMsg(msg);
                result.setCode(code);
                return result;
            }
            //批次id
            String batchId = UUID.randomUUID().toString().replace("-","");

            //初始化批次表
            SendMemberSmsBatchTotal sendMemberSmsBatchTotal = new SendMemberSmsBatchTotal();
            sendMemberSmsBatchTotal.setBatchId(batchId);
            sendMemberSmsBatchTotal.setCreateTime(new Date());
            Long totalSendCount = Long.parseLong(salesMembers.size()+"");
            sendMemberSmsBatchTotal.setTotalSendCount(totalSendCount);
            sendMemberSmsBatchTotal.setSuccessCount(0L);
            sendMemberSmsBatchTotal.setFailedCount(0L);
            sendMemberSmsBatchTotal.setOneDayCount(0L);
            sendMemberSmsBatchTotal.setOneWeekCount(0L);
            sendMemberSmsBatchTotal.setFifteenthCount(0L);
            for (SalesMember salesMember:salesMembers) {
                String mobile = salesMember.getMobile();
                Integer status = salesMember.getStatus();
                if(mobile != null){
                    String response = SmsSendUtil.sendSmsApi(mobile);
                    if("success".equals(response)){
                        /*表示短信发送成功后要执行的业务逻辑*/

                        /*批次成功次数加一*/
                        Long successCount =sendMemberSmsBatchTotal.getSuccessCount();
                        successCount ++;
                        sendMemberSmsBatchTotal.setSuccessCount(successCount);

                        List<Long> memberIds = shopMemberMapper.selectMemberIdByMobile(mobile);

                        List<SendMemberSmsMemberTotal> sendMemberSmsMemberTotals = sendMemberSmsMemberTotalMapper.selectByMobile(mobile);
                        if(sendMemberSmsMemberTotals.isEmpty()){
                            if(!memberIds.isEmpty()){
                                SendMemberSmsMemberTotal sendMemberSmsMemberTotal = new SendMemberSmsMemberTotal();
                                sendMemberSmsMemberTotal.setCreateTime(new Date());
                                sendMemberSmsMemberTotal.setLastSendTime(new Date());
                                sendMemberSmsMemberTotal.setMemberId(memberIds.get(0));
                                sendMemberSmsMemberTotal.setMemberType(status);
                                sendMemberSmsMemberTotal.setSendCount(1L);
                                sendMemberSmsMemberTotal.setMobile(mobile);
                                sendMemberSmsMemberTotalMapper.insertSelective(sendMemberSmsMemberTotal);
                            }
                        }else{
                            SendMemberSmsMemberTotal sendMemberSmsMemberTotal = sendMemberSmsMemberTotals.get(0);
                            Long sendCount = sendMemberSmsMemberTotal.getSendCount();
                            sendCount ++;
                            sendMemberSmsMemberTotal.setSendCount(sendCount);
                            sendMemberSmsMemberTotalMapper.updateByPrimaryKeySelective(sendMemberSmsMemberTotal);
                        }
                        /*添加发送的会员到表*/
                        SendMemberSms sendMemberSms = new SendMemberSms();
                        sendMemberSms.setBatchId(batchId);
                        sendMemberSms.setIsNeedDo("0");
                        sendMemberSms.setMemberType(status);
                        sendMemberSms.setMsgSendTime(new Date());
                        sendMemberSms.setMobile(mobile);
                        if(!memberIds.isEmpty()){
                            sendMemberSms.setMemberId(memberIds.get(0));
                        }else{
                            continue;
                        }
                        sendMemberSmsMapper.insertSelective(sendMemberSms);

                    }else{
                        Long failedCount =sendMemberSmsBatchTotal.getFailedCount();
                        failedCount ++;
                        sendMemberSmsBatchTotal.setFailedCount(failedCount);
                    }
                }else{
                    /*批次失败次数加一*/
                    Long failedCount =sendMemberSmsBatchTotal.getFailedCount();
                    failedCount ++;
                    sendMemberSmsBatchTotal.setFailedCount(failedCount);
                }
                Thread.sleep(100);
            }
            sendMemberSmsBatchTotalMapper.insertSelective(sendMemberSmsBatchTotal);
            code = Constants.SUCCESS;
            msg = "全部执行成功";
        }catch (Exception e){
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            e.printStackTrace();
            code = Constants.ERROR;
            msg = "系统繁忙";
        }
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
