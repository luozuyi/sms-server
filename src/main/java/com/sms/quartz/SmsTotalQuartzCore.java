package com.sms.quartz;

import com.sms.entity.SendMemberSmsBatchTotal;
import com.sms.entity.SendMemberSmsTotal;
import com.sms.mapper.SendMemberSmsBatchTotalMapper;
import com.sms.mapper.SendMemberSmsMemberTotalMapper;
import com.sms.mapper.SendMemberSmsTotalMapper;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * @author luo
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class SmsTotalQuartzCore extends QuartzJobBean {
    @Autowired
    private SendMemberSmsTotalMapper sendMemberSmsTotalMapper;
    @Autowired
    private SendMemberSmsBatchTotalMapper sendMemberSmsBatchTotalMapper;
    @Autowired
    private SendMemberSmsMemberTotalMapper sendMemberSmsMemberTotalMapper;
    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        Long sumTotalSendCount = sendMemberSmsBatchTotalMapper.selectSumTotalSendCount();
        Long sumSuccessCount = sendMemberSmsBatchTotalMapper.selectSumSuccessCount();
        Long sumFailedCount = sendMemberSmsBatchTotalMapper.selectSumFailedCount();
        Long sumOneDayCount = sendMemberSmsBatchTotalMapper.selectSumOneDayCount();
        Long sumOneWeekCount = sendMemberSmsBatchTotalMapper.selectSumOneWeekCount();
        Long sumFifteenthCount = sendMemberSmsBatchTotalMapper.selectSumFifteenthCount();
        Long memberCount = sendMemberSmsMemberTotalMapper.selectMemberCount();

        SendMemberSmsTotal sendMemberSmsTotal = new SendMemberSmsTotal();
        sendMemberSmsTotal.setCreateTime(new Date());
        sendMemberSmsTotal.setTotalSendCount(sumTotalSendCount);
        sendMemberSmsTotal.setSuccessCount(sumSuccessCount);
        sendMemberSmsTotal.setFailedCount(sumFailedCount);
        Long sumLoginCount = sumOneDayCount+sumOneWeekCount+sumFifteenthCount;
        sendMemberSmsTotal.setLoginMemberCount(sumLoginCount);
        sendMemberSmsTotal.setTotalMemberCount(memberCount);
        sendMemberSmsTotalMapper.insertSelective(sendMemberSmsTotal);
    }
}
