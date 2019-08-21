package com.sms.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author luo
 */
public class SendMemberSmsBatchTotal implements Serializable{
    private static final long serialVersionUID = 1L;
    /**
     * 主键id
     */
    private Long id;
    /**
     * 批次id
     */
    private String batchId;
    /**
     * 发送总数量
     */
    private Long totalSendCount;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 发送成功次数
     */
    private Long successCount;
    /**
     * 发送失败次数
     */
    private Long failedCount;
    /**
     * 隔天登录总数
     */
    private Long oneDayCount;
    /**
     * 隔周登录总数
     */
    private Long oneWeekCount;
    /**
     * 隔半个月登录总数
     */
    private Long fifteenthCount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId == null ? null : batchId.trim();
    }

    public Long getTotalSendCount() {
        return totalSendCount;
    }

    public void setTotalSendCount(Long totalSendCount) {
        this.totalSendCount = totalSendCount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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

    public Long getOneDayCount() {
        return oneDayCount;
    }

    public void setOneDayCount(Long oneDayCount) {
        this.oneDayCount = oneDayCount;
    }

    public Long getOneWeekCount() {
        return oneWeekCount;
    }

    public void setOneWeekCount(Long oneWeekCount) {
        this.oneWeekCount = oneWeekCount;
    }

    public Long getFifteenthCount() {
        return fifteenthCount;
    }

    public void setFifteenthCount(Long fifteenthCount) {
        this.fifteenthCount = fifteenthCount;
    }
}