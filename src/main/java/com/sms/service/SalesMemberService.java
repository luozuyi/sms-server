package com.sms.service;

import com.sms.utils.Result;

import java.util.Date;

/**
 * @author luo
 */
public interface SalesMemberService {
    /**
     * 根据时间段查询销售的电话
     * @return
     */
    Result selectSalesMemberMobileList(Date startTime,Date endTime);

    /**
     * 分页查询客户列表
     * @param pageNum 当前页
     * @param pageSize 一页显示多少条
     * @param startTime 开始时间
     * @param endTime 结束时间
     * @return
     */
    Result selectSalesMemberMobilePage(Integer pageNum,Integer pageSize,Date startTime,Date endTime);

    /**
     * 根据时间段查询销售的电话并且发送短信
     * @return
     */
    Result selectSalesMemberMobileListAndSendSms(Date startTime,Date endTime);
}
