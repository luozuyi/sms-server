package com.sms.service;


import com.sms.utils.Result;

/**
 * @author luo
 */
public interface TestService {
    /**
     * 测试
     * @param telephone 电话
     * @return
     */
    Result getTelephone(String telephone);
}
