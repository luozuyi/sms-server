package com.sms.serviceimpl;

import com.sms.mapper.SendMemberSmsMapper;
import com.sms.service.SendMemberSmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author luo
 */
@Transactional(rollbackFor = Exception.class)
@Service
public class SendMemberSmsServiceImpl implements SendMemberSmsService{
    @Autowired
    private SendMemberSmsMapper sendMemberSmsMapper;
}
