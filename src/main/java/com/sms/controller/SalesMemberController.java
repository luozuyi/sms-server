package com.sms.controller;

import com.sms.service.SalesMemberService;
import com.sms.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author luo
 */
@RestController
public class SalesMemberController {
    @Autowired
    private SalesMemberService salesMemberService;

    /**
     * 发送时间区间的短信
     * @param startTime 起始时间
     * @param endTime 结束时间
     * @return
     */
    @PostMapping(value = "v1/sales-member/sms")
    public Result selectSalesMemberMobileListAndSendSms(Date startTime, Date endTime) {
        return salesMemberService.selectSalesMemberMobileListAndSendSms(startTime,endTime);
    }
}
