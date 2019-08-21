package com.sms.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author luo
 */
public class CoreUser implements Serializable{
    private static final long serialVersionUID = 1L;
    /**
     * 用户id
     */
    private Long userId;
    /**
     * 用户名
     */
    private String username;
    /**
     * 邮件
     */
    private String email;
    /**
     * 密码
     */
    private String password;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 登录次数
     */
    private Long loginCount;
    /**
     * 注册ip
     */
    private String registerIp;
    /**
     * 最后登录时间
     */
    private Date lastLoginTime;
    /**
     * 最后登录ip
     */
    private String lastLoginIp;
    /**
     * 当前登录时间
     */
    private Date currentLoginTime;
    /**
     * 当前登录ip
     */
    private String currentLoginIp;

    private String resetKey;

    private String resetPwd;

    private Date errtime;

    private Integer errcount;

    private String referee;

    private String phoneCode;

    private Integer phoneActive;

    private String emailCode;

    private Integer emailActive;

    private String findPwdCode;

    private String payPwdCode;

    private Integer loginStatus;

    private Integer elogincount;

    private Integer emark;

    private Integer prostatus;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getLoginCount() {
        return loginCount;
    }

    public void setLoginCount(Long loginCount) {
        this.loginCount = loginCount;
    }

    public String getRegisterIp() {
        return registerIp;
    }

    public void setRegisterIp(String registerIp) {
        this.registerIp = registerIp == null ? null : registerIp.trim();
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp == null ? null : lastLoginIp.trim();
    }

    public Date getCurrentLoginTime() {
        return currentLoginTime;
    }

    public void setCurrentLoginTime(Date currentLoginTime) {
        this.currentLoginTime = currentLoginTime;
    }

    public String getCurrentLoginIp() {
        return currentLoginIp;
    }

    public void setCurrentLoginIp(String currentLoginIp) {
        this.currentLoginIp = currentLoginIp == null ? null : currentLoginIp.trim();
    }

    public String getResetKey() {
        return resetKey;
    }

    public void setResetKey(String resetKey) {
        this.resetKey = resetKey == null ? null : resetKey.trim();
    }

    public String getResetPwd() {
        return resetPwd;
    }

    public void setResetPwd(String resetPwd) {
        this.resetPwd = resetPwd == null ? null : resetPwd.trim();
    }

    public Date getErrtime() {
        return errtime;
    }

    public void setErrtime(Date errtime) {
        this.errtime = errtime;
    }

    public Integer getErrcount() {
        return errcount;
    }

    public void setErrcount(Integer errcount) {
        this.errcount = errcount;
    }

    public String getReferee() {
        return referee;
    }

    public void setReferee(String referee) {
        this.referee = referee == null ? null : referee.trim();
    }

    public String getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode == null ? null : phoneCode.trim();
    }

    public Integer getPhoneActive() {
        return phoneActive;
    }

    public void setPhoneActive(Integer phoneActive) {
        this.phoneActive = phoneActive;
    }

    public String getEmailCode() {
        return emailCode;
    }

    public void setEmailCode(String emailCode) {
        this.emailCode = emailCode == null ? null : emailCode.trim();
    }

    public Integer getEmailActive() {
        return emailActive;
    }

    public void setEmailActive(Integer emailActive) {
        this.emailActive = emailActive;
    }

    public String getFindPwdCode() {
        return findPwdCode;
    }

    public void setFindPwdCode(String findPwdCode) {
        this.findPwdCode = findPwdCode == null ? null : findPwdCode.trim();
    }

    public String getPayPwdCode() {
        return payPwdCode;
    }

    public void setPayPwdCode(String payPwdCode) {
        this.payPwdCode = payPwdCode == null ? null : payPwdCode.trim();
    }

    public Integer getLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(Integer loginStatus) {
        this.loginStatus = loginStatus;
    }

    public Integer getElogincount() {
        return elogincount;
    }

    public void setElogincount(Integer elogincount) {
        this.elogincount = elogincount;
    }

    public Integer getEmark() {
        return emark;
    }

    public void setEmark(Integer emark) {
        this.emark = emark;
    }

    public Integer getProstatus() {
        return prostatus;
    }

    public void setProstatus(Integer prostatus) {
        this.prostatus = prostatus;
    }
}