package com.sms.quartz;

import com.sms.entity.CoreUser;
import com.sms.entity.SalesMember;
import com.sms.entity.SendMemberSms;
import com.sms.mapper.CoreUserMapper;
import com.sms.mapper.SalesMemberMapper;
import com.sms.mapper.SendMemberSmsMapper;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * @author luo
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class SmsQuartzCore extends QuartzJobBean{
    @Autowired
    private SendMemberSmsMapper sendMemberSmsMapper;
    @Autowired
    private SalesMemberMapper salesMemberMapper;
    @Autowired
    private CoreUserMapper coreUserMapper;
    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        List<SendMemberSms> sendMemberSmsList = sendMemberSmsMapper.selectByIsNeedDo("0");
        for (SendMemberSms sendMemberSms:sendMemberSmsList) {
            String mobile = sendMemberSms.getMobile();
            Date msgSendTime = sendMemberSms.getMsgSendTime();
            List<SalesMember> salesMembers = salesMemberMapper.selectByMobile(mobile);
            if(!salesMembers.isEmpty()){
                SalesMember salesMember = salesMembers.get(0);
                String memberName = salesMember.getMemberName();
                List<CoreUser> coreUserList = coreUserMapper.selectByUsername(memberName);
                if(!coreUserList.isEmpty()){
                    CoreUser coreUser = coreUserList.get(0);
                    Date currentLoginTime = coreUser.getCurrentLoginTime();
                    long stateTimeLong = msgSendTime.getTime();
                    long endTimeLong = currentLoginTime.getTime();
                    // 结束时间-开始时间 = 天数
                    long day = (endTimeLong-stateTimeLong)/(24 * 60 * 60 * 1000);
                    if(day < 0){

                    }else if(day >=0 & day < 2){
                        sendMemberSms.setOneDayTime(currentLoginTime);
                        sendMemberSms.setIsNeedDo("1");
                        sendMemberSmsMapper.updateByPrimaryKeySelective(sendMemberSms);
                    }else if(day < 8){
                        sendMemberSms.setOneWeekTime(currentLoginTime);
                        sendMemberSms.setIsNeedDo("1");
                        sendMemberSmsMapper.updateByPrimaryKeySelective(sendMemberSms);
                    }else if(day < 16){
                        sendMemberSms.setFifteenthTime(currentLoginTime);
                        sendMemberSms.setIsNeedDo("1");
                        sendMemberSmsMapper.updateByPrimaryKeySelective(sendMemberSms);
                    }else  if(day >= 16){
                        sendMemberSms.setIsNeedDo("1");
                        sendMemberSmsMapper.updateByPrimaryKeySelective(sendMemberSms);
                    }
                }
            }
        }
    }
}
