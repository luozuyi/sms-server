package com.sms.serviceimpl;

import com.sms.service.TestService;
import com.sms.utils.Constants;
import com.sms.utils.Result;
import com.sms.utils.SmsSendUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;


/**
 * @author luo
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class TestServiceImpl implements TestService{
    @Override
    public Result getTelephone(String telephone) {
        Result result = new Result();
        String msg = "初始化";
        String code = Constants.FAIL;
        try {
            SmsSendUtil.send(telephone, "123456", "30");
            result.setData("123456");
        } catch (Exception e) {
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            msg = "系统繁忙";
            code = Constants.ERROR;
        }
        result.setMsg(msg);
        result.setCode(code);
        return result;
    }
}
