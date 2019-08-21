package com.sms.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author luo
 */
public class SendMemberSmsTotal implements Serializable{
    private static final long serialVersionUID = 1L;
    /**
     * 主键id
     */
    private Long id;
    /**
     * 发送短信总数
     */
    private Long totalSendCount;
    /**
     * 成功总数
     */
    private Long successCount;
    /**
     * 失败总数
     */
    private Long failedCount;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 发送会员总数
     */
    private Long totalMemberCount;
    /**
     * 登录会员总数
     */
    private Long loginMemberCount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTotalSendCount() {
        return totalSendCount;
    }

    public void setTotalSendCount(Long totalSendCount) {
        this.totalSendCount = totalSendCount;
    }

    public Long getSuccessCount() {
        return successCount;
    }

    public void setSuccessCount(Long successCount) {
        this.successCount = successCount;
    }

    public Long getFailedCount() {
        return failedCount;
    }

    public void setFailedCount(Long failedCount) {
        this.failedCount = failedCount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getTotalMemberCount() {
        return totalMemberCount;
    }

    public void setTotalMemberCount(Long totalMemberCount) {
        this.totalMemberCount = totalMemberCount;
    }

    public Long getLoginMemberCount() {
        return loginMemberCount;
    }

    public void setLoginMemberCount(Long loginMemberCount) {
        this.loginMemberCount = loginMemberCount;
    }
}