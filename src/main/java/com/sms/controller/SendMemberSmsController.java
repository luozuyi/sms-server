package com.sms.controller;

import com.sms.service.SendMemberSmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author luo
 */
@RestController
public class SendMemberSmsController {
    @Autowired
    private SendMemberSmsService sendMemberSmsService;
}
