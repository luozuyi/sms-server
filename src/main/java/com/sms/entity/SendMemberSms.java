package com.sms.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author luo
 */
public class SendMemberSms implements Serializable {
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
     * 会员id
     */
    private Long memberId;
    /**
     * 电话
     */
    private String mobile;
    /**
     * 发送时间
     */
    private Date msgSendTime;
    /**
     * 隔天登陆时间
     */
    private Date oneDayTime;
    /**
     * 隔周登录时间
     */
    private Date oneWeekTime;
    /**
     * 隔半月登录时间
     */
    private Date fifteenthTime;
    /**
     * 会员类型
     */
    private Integer memberType;
    /**
     * 是否还需要处理该数据0：需要1：不需要
     */
    private String isNeedDo;

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

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Date getMsgSendTime() {
        return msgSendTime;
    }

    public void setMsgSendTime(Date msgSendTime) {
        this.msgSendTime = msgSendTime;
    }

    public Date getOneDayTime() {
        return oneDayTime;
    }

    public void setOneDayTime(Date oneDayTime) {
        this.oneDayTime = oneDayTime;
    }

    public Date getOneWeekTime() {
        return oneWeekTime;
    }

    public void setOneWeekTime(Date oneWeekTime) {
        this.oneWeekTime = oneWeekTime;
    }

    public Date getFifteenthTime() {
        return fifteenthTime;
    }

    public void setFifteenthTime(Date fifteenthTime) {
        this.fifteenthTime = fifteenthTime;
    }

    public Integer getMemberType() {
        return memberType;
    }

    public void setMemberType(Integer memberType) {
        this.memberType = memberType;
    }

    public String getIsNeedDo() {
        return isNeedDo;
    }

    public void setIsNeedDo(String isNeedDo) {
        this.isNeedDo = isNeedDo == null ? null : isNeedDo.trim();
    }
}