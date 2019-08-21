package com.sms.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author luo
 */
public class SendMemberSmsMemberTotal implements Serializable{
    private static final long serialVersionUID = 1L;
    /**
     * 主键id
     */
    private Long id;
    /**
     * 会员id
     */
    private Long memberId;
    /**
     * 会员电话
     */
    private String mobile;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 发送次数
     */
    private Long sendCount;
    /**
     * 最后发送时间
     */
    private Date lastSendTime;
    /**
     * 最后登录时间
     */
    private Date lastLoginTime;
    /**
     * 会员类型 -1-默认；0-既是买家也是卖家；1-买家；2-卖家
     */
    private Integer memberType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getSendCount() {
        return sendCount;
    }

    public void setSendCount(Long sendCount) {
        this.sendCount = sendCount;
    }

    public Date getLastSendTime() {
        return lastSendTime;
    }

    public void setLastSendTime(Date lastSendTime) {
        this.lastSendTime = lastSendTime;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Integer getMemberType() {
        return memberType;
    }

    public void setMemberType(Integer memberType) {
        this.memberType = memberType;
    }
}