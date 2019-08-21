package com.sms.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author luo
 */
public class SalesMember implements Serializable{
    /**
     * 主键id
     */
    private Long id;
    /**
     * 会员名称
     */
    private String memberName;
    /**
     * 会员的手机号码
     */
    private String mobile;
    /**
     * 客户的QQ号
     */
    private String qq;
    /**
     * 会员的地址
     */
    private String memberAddress;
    /**
     * 会员对店铺的需求
     */
    private String memberDemand;
    /**
     * 当前所属销售员
     */
    private String belongSalesman;
    /**
     * 登录次数
     */
    private Integer loginCount;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 当前登录时间
     */
    private Date currentLoginTime;
    /**
     * 拥有店铺数量
     */
    private Integer shopCount;
    /**
     * -1-默认；0-既是买家也是卖家；1-买家；2-卖家
     */
    private Integer status;
    /**
     * 客户等级分类：0-A，1-B,2-C,3-D
     */
    private Integer sort;
    /**
     * 0：未过期 1：还剩一天过期
     */
    private Integer isovertime;
    /**
     * 淘宝卡数量
     */
    private Integer tbcheckcount;
    /**
     * 天猫卡
     */
    private Integer checkcount;
    /**
     * 代金券
     */
    private Integer voucher;
    /**
     * 冻结资金
     */
    private Double freezeMoney;
    /**
     * 资金
     */
    private Double money;
    /**
     * needsales
     */
    private Integer needsales;
    /**
     * 组长ID
     */
    private Integer leader;
    /**
     * 快速备注
     */
    private Integer quicknote;
    /**
     * 最近一次进入电话池的时间
     */
    private Date lastJoinPoolTime;
    /**
     * 店铺id
     */
    private String productId;
    /**
     * 注册页面
     */
    private String regOrigin;
    /**
     * 注册分类
     */
    private String regClassify;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName == null ? null : memberName.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getMemberAddress() {
        return memberAddress;
    }

    public void setMemberAddress(String memberAddress) {
        this.memberAddress = memberAddress == null ? null : memberAddress.trim();
    }

    public String getMemberDemand() {
        return memberDemand;
    }

    public void setMemberDemand(String memberDemand) {
        this.memberDemand = memberDemand == null ? null : memberDemand.trim();
    }

    public String getBelongSalesman() {
        return belongSalesman;
    }

    public void setBelongSalesman(String belongSalesman) {
        this.belongSalesman = belongSalesman == null ? null : belongSalesman.trim();
    }

    public Integer getLoginCount() {
        return loginCount;
    }

    public void setLoginCount(Integer loginCount) {
        this.loginCount = loginCount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getCurrentLoginTime() {
        return currentLoginTime;
    }

    public void setCurrentLoginTime(Date currentLoginTime) {
        this.currentLoginTime = currentLoginTime;
    }

    public Integer getShopCount() {
        return shopCount;
    }

    public void setShopCount(Integer shopCount) {
        this.shopCount = shopCount;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getIsovertime() {
        return isovertime;
    }

    public void setIsovertime(Integer isovertime) {
        this.isovertime = isovertime;
    }

    public Integer getTbcheckcount() {
        return tbcheckcount;
    }

    public void setTbcheckcount(Integer tbcheckcount) {
        this.tbcheckcount = tbcheckcount;
    }

    public Integer getCheckcount() {
        return checkcount;
    }

    public void setCheckcount(Integer checkcount) {
        this.checkcount = checkcount;
    }

    public Integer getVoucher() {
        return voucher;
    }

    public void setVoucher(Integer voucher) {
        this.voucher = voucher;
    }

    public Double getFreezeMoney() {
        return freezeMoney;
    }

    public void setFreezeMoney(Double freezeMoney) {
        this.freezeMoney = freezeMoney;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Integer getNeedsales() {
        return needsales;
    }

    public void setNeedsales(Integer needsales) {
        this.needsales = needsales;
    }

    public Integer getLeader() {
        return leader;
    }

    public void setLeader(Integer leader) {
        this.leader = leader;
    }

    public Integer getQuicknote() {
        return quicknote;
    }

    public void setQuicknote(Integer quicknote) {
        this.quicknote = quicknote;
    }

    public Date getLastJoinPoolTime() {
        return lastJoinPoolTime;
    }

    public void setLastJoinPoolTime(Date lastJoinPoolTime) {
        this.lastJoinPoolTime = lastJoinPoolTime;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public String getRegOrigin() {
        return regOrigin;
    }

    public void setRegOrigin(String regOrigin) {
        this.regOrigin = regOrigin == null ? null : regOrigin.trim();
    }

    public String getRegClassify() {
        return regClassify;
    }

    public void setRegClassify(String regClassify) {
        this.regClassify = regClassify == null ? null : regClassify.trim();
    }
}