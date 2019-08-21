package com.sms.quartz;

import com.sms.entity.CoreUser;
import com.sms.entity.SalesMember;
import com.sms.entity.SendMemberSmsMemberTotal;
import com.sms.mapper.CoreUserMapper;
import com.sms.mapper.SalesMemberMapper;
import com.sms.mapper.SendMemberSmsMemberTotalMapper;
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
public class SmsLoginTimeQuartzCore extends QuartzJobBean {
    @Autowired
    private SendMemberSmsMemberTotalMapper sendMemberSmsMemberTotalMapper;
    @Autowired
    private SalesMemberMapper salesMemberMapper;
    @Autowired
    private CoreUserMapper coreUserMapper;
    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        List<SendMemberSmsMemberTotal> sendMemberSmsMemberTotalList = sendMemberSmsMemberTotalMapper.selectAll();
        for (SendMemberSmsMemberTotal sendMemberSmsMemberTotal:sendMemberSmsMemberTotalList) {
            String mobile = sendMemberSmsMemberTotal.getMobile();
            List<SalesMember> salesMembers = salesMemberMapper.selectByMobile(mobile);
            if(!salesMembers.isEmpty()){
                SalesMember salesMember = salesMembers.get(0);
                String memberName = salesMember.getMemberName();
                List<CoreUser> coreUserList = coreUserMapper.selectByUsername(memberName);
                if(!coreUserList.isEmpty()){
                    CoreUser coreUser = coreUserList.get(0);
                    Date currentLoginTime = coreUser.getCurrentLoginTime();
                    sendMemberSmsMemberTotal.setLastLoginTime(currentLoginTime);
                    sendMemberSmsMemberTotalMapper.updateByPrimaryKeySelective(sendMemberSmsMemberTotal);
                }
            }
        }
    }
}
