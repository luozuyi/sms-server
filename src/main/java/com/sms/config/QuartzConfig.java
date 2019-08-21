package com.sms.config;

import com.sms.quartz.SmsBatchQuartzCore;
import com.sms.quartz.SmsLoginTimeQuartzCore;
import com.sms.quartz.SmsQuartzCore;
import com.sms.quartz.SmsTotalQuartzCore;
import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author luo
 */
@Configuration
public class QuartzConfig {
    @Bean
    public JobDetail smsQuartzCoreDetail(){
        return JobBuilder.newJob(SmsQuartzCore.class).withIdentity("smsQuartzCore").storeDurably().build();
    }

    @Bean
    public Trigger smsQuartzCoreTrigger(){
        //CronScheduleBuilder cronScheduleBuilder = CronScheduleBuilder.cronSchedule("0 10 1 * * ?");
        CronScheduleBuilder cronScheduleBuilder = CronScheduleBuilder.cronSchedule("* */2 * * * ?");
        return TriggerBuilder.newTrigger().forJob(smsQuartzCoreDetail())
                .withIdentity("smsQuartzCore")
                .withSchedule(cronScheduleBuilder)
                .build();
    }

    @Bean
    public JobDetail smsBatchQuartzCoreDetail(){
        return JobBuilder.newJob(SmsBatchQuartzCore.class).withIdentity("smsBatchQuartzCore").storeDurably().build();
    }

    @Bean
    public Trigger smsBatchQuartzCoreTrigger(){
        CronScheduleBuilder cronScheduleBuilder = CronScheduleBuilder.cronSchedule("0 10 2 * * ?");
        return TriggerBuilder.newTrigger().forJob(smsBatchQuartzCoreDetail())
                .withIdentity("smsBatchQuartzCore")
                .withSchedule(cronScheduleBuilder)
                .build();
    }

    @Bean
    public JobDetail smsLoginTimeQuartzCoreDetail(){
        return JobBuilder.newJob(SmsLoginTimeQuartzCore.class).withIdentity("smsLoginTimeQuartzCore").storeDurably().build();
    }

    @Bean
    public Trigger smsLoginTimeQuartzCoreTrigger(){
        CronScheduleBuilder cronScheduleBuilder = CronScheduleBuilder.cronSchedule("0 10 3 * * ?");
        return TriggerBuilder.newTrigger().forJob(smsLoginTimeQuartzCoreDetail())
                .withIdentity("smsLoginTimeQuartzCore")
                .withSchedule(cronScheduleBuilder)
                .build();
    }

    @Bean
    public JobDetail smsTotalQuartzCoreDetail(){
        return JobBuilder.newJob(SmsTotalQuartzCore.class).withIdentity("smsTotalQuartzCore").storeDurably().build();
    }

    @Bean
    public Trigger smsTotalQuartzCoreTrigger(){
        CronScheduleBuilder cronScheduleBuilder = CronScheduleBuilder.cronSchedule("0 10 4 * * ?");
        return TriggerBuilder.newTrigger().forJob(smsTotalQuartzCoreDetail())
                .withIdentity("smsTotalQuartzCore")
                .withSchedule(cronScheduleBuilder)
                .build();
    }
}
