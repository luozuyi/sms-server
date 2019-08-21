package com.sms.quartz;

import com.sms.entity.SendMemberSmsBatchTotal;
import com.sms.mapper.SendMemberSmsBatchTotalMapper;
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
public class SmsBatchQuartzCore extends QuartzJobBean {
    @Autowired
    private SendMemberSmsBatchTotalMapper sendMemberSmsBatchTotalMapper;
    @Autowired
    private SendMemberSmsMapper sendMemberSmsMapper;
    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        List<SendMemberSmsBatchTotal> sendMemberSmsBatchTotalList = sendMemberSmsBatchTotalMapper.selectAll();
        for (SendMemberSmsBatchTotal sendMemberSmsBatchTotal:sendMemberSmsBatchTotalList) {
            String batchId = sendMemberSmsBatchTotal.getBatchId();
            Date createTime = sendMemberSmsBatchTotal.getCreateTime();
            Date nowTime = new Date();
            long day = (createTime.getTime()-nowTime.getTime())/(24 * 60 * 60 * 1000);
            if(day >= 16){
                continue;
            }else{
                Long oneDayCount = sendMemberSmsMapper.selectOneDayCountByBatchId(batchId);
                Long oneWeekCount = sendMemberSmsMapper.selectOneWeekCountByBatchId(batchId);
                Long fifteenthTimeCount = sendMemberSmsMapper.selectFifteenthTimeCountByBatchId(batchId);
                sendMemberSmsBatchTotal.setOneDayCount(oneDayCount);
                sendMemberSmsBatchTotal.setOneWeekCount(oneWeekCount);
                sendMemberSmsBatchTotal.setFifteenthCount(fifteenthTimeCount);
                sendMemberSmsBatchTotalMapper.updateByPrimaryKeySelective(sendMemberSmsBatchTotal);
            }
        }
    }
}
