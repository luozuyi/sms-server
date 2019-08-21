package com.sms.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author luo
 */
public class ShopMember implements Serializable{
    private static final long serialVersionUID = 1L;
    /**
     * 会员id
     */
    private Long memberId;
    /**
     * 组id
     */
    private Long groupId;
    /**
     * 站点ID
     */
    private Long websiteId;
    /**
     * 行业ID
     */
    private Long businessId;
    /**
     * 字典表身份ID
     */
    private Long userdegreeId;
    /**
     * 字典表家庭成员
     */
    private Long familymembersId;
    /**
     * 字典表个人收入情况
     */
    private Long incomedescId;
    /**
     * 字典表工作年限
     */
    private Long workseniorityId;
    /**
     * 字典表教育程度
     */
    private Long degreeId;
    /**
     * 真实姓名
     */
    private String realname;
    /**
     * 性别
     */
    private Boolean gender;
    /**
     * 生日日期
     */
    private Date birthday;
    /**
     * 手机
     */
    private String mobile;
    /**
     * 电话
     */
    private String tel;
    /**
     * 积分
     */
    private Integer score;
    /**
     * 冻结的积分
     */
    private Integer freezescore;
    /**
     * 账户金额
     */
    private Double money;
    /**
     * 公司
     */
    private String company;
    /**
     * 会员头像
     */
    private String avatar;
    /**
     * 婚姻状况(空,保密;1,已婚;0,未婚)
     */
    private Boolean marriage;
    /**
     * 是否有车(0:无 1：有)
     */
    private Boolean isCar;
    /**
     * 职位
     */
    private String position;
    /**
     * 毕业学校
     */
    private String schooltag;
    /**
     * 毕业时间
     */
    private Date schooltagdate;
    /**
     * 最喜爱的品牌
     */
    private String favoritebrand;
    /**
     * 最喜爱的明星
     */
    private String favoritestar;
    /**
     * 最喜爱的电影
     */
    private String favoritemovie;
    /**
     * 最喜爱的人物
     */
    private String favoritepersonage;
    /**
     * 地址
     */
    private String address;
    /**
     * 冻结资金
     */
    private Double freezeMoney;
    /**
     * 押金
     */
    private Double deposit;
    /**
     * 违约金
     */
    private Double amercement;

    private String img1;

    private String img2;

    private String img3;

    private String img4;

    private String img5;

    private String img6;

    private Integer isImg1;

    private Integer isImg2;

    private Integer isImg3;

    private Integer isImg4;

    private Integer isImg5;

    private Integer isImg6;
    /**
     * 淘宝看店卡数量
     */
    private Integer tbcheckcount;
    /**
     * 点击查看次数
     */
    private Integer checkcount;
    /**
     * 分享时间
     */
    private Date sharetime;
    /**
     * 分享次数
     */
    private Integer sharecount;
    /**
     * 淘宝分享查看次数
     */
    private Integer tbsharecheckcount;
    /**
     * 天猫分享查看次数
     */
    private Integer tmsharecheckcount;
    /**
     * 查看总次数
     */
    private Integer count;
    /**
     * 店铺数量
     */
    private Integer productcount;
    /**
     * 代金券
     */
    private Integer voucher;
    /**
     * 会员待回复提问数
     */
    private Integer answerno;
    /**
     * 会员分类等级0：未选择 1：A 2:B 3：C 4：D
     */
    private Integer sort;
    /**
     * 会员备注信息
     */
    private String remark;

    private Integer emark;

    private Integer etbcard;

    private Integer etmcard;

    private Integer etbused;

    private Integer etmused;
    /**
     * 合作伙伴ID
     */
    private Integer partnerid;
    /**
     * 来源: 1:百度搜索 2:360搜索 3:搜狗搜索 4:亲友推荐 5:电话拜访  other(其它渠道)
     */
    private String originType;
    /**
     * 所属销售员
     */
    private String besalman;

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public Long getWebsiteId() {
        return websiteId;
    }

    public void setWebsiteId(Long websiteId) {
        this.websiteId = websiteId;
    }

    public Long getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Long businessId) {
        this.businessId = businessId;
    }

    public Long getUserdegreeId() {
        return userdegreeId;
    }

    public void setUserdegreeId(Long userdegreeId) {
        this.userdegreeId = userdegreeId;
    }

    public Long getFamilymembersId() {
        return familymembersId;
    }

    public void setFamilymembersId(Long familymembersId) {
        this.familymembersId = familymembersId;
    }

    public Long getIncomedescId() {
        return incomedescId;
    }

    public void setIncomedescId(Long incomedescId) {
        this.incomedescId = incomedescId;
    }

    public Long getWorkseniorityId() {
        return workseniorityId;
    }

    public void setWorkseniorityId(Long workseniorityId) {
        this.workseniorityId = workseniorityId;
    }

    public Long getDegreeId() {
        return degreeId;
    }

    public void setDegreeId(Long degreeId) {
        this.degreeId = degreeId;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getFreezescore() {
        return freezescore;
    }

    public void setFreezescore(Integer freezescore) {
        this.freezescore = freezescore;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    public Boolean getMarriage() {
        return marriage;
    }

    public void setMarriage(Boolean marriage) {
        this.marriage = marriage;
    }

    public Boolean getIsCar() {
        return isCar;
    }

    public void setIsCar(Boolean isCar) {
        this.isCar = isCar;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getSchooltag() {
        return schooltag;
    }

    public void setSchooltag(String schooltag) {
        this.schooltag = schooltag == null ? null : schooltag.trim();
    }

    public Date getSchooltagdate() {
        return schooltagdate;
    }

    public void setSchooltagdate(Date schooltagdate) {
        this.schooltagdate = schooltagdate;
    }

    public String getFavoritebrand() {
        return favoritebrand;
    }

    public void setFavoritebrand(String favoritebrand) {
        this.favoritebrand = favoritebrand == null ? null : favoritebrand.trim();
    }

    public String getFavoritestar() {
        return favoritestar;
    }

    public void setFavoritestar(String favoritestar) {
        this.favoritestar = favoritestar == null ? null : favoritestar.trim();
    }

    public String getFavoritemovie() {
        return favoritemovie;
    }

    public void setFavoritemovie(String favoritemovie) {
        this.favoritemovie = favoritemovie == null ? null : favoritemovie.trim();
    }

    public String getFavoritepersonage() {
        return favoritepersonage;
    }

    public void setFavoritepersonage(String favoritepersonage) {
        this.favoritepersonage = favoritepersonage == null ? null : favoritepersonage.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Double getFreezeMoney() {
        return freezeMoney;
    }

    public void setFreezeMoney(Double freezeMoney) {
        this.freezeMoney = freezeMoney;
    }

    public Double getDeposit() {
        return deposit;
    }

    public void setDeposit(Double deposit) {
        this.deposit = deposit;
    }

    public Double getAmercement() {
        return amercement;
    }

    public void setAmercement(Double amercement) {
        this.amercement = amercement;
    }

    public String getImg1() {
        return img1;
    }

    public void setImg1(String img1) {
        this.img1 = img1 == null ? null : img1.trim();
    }

    public String getImg2() {
        return img2;
    }

    public void setImg2(String img2) {
        this.img2 = img2 == null ? null : img2.trim();
    }

    public String getImg3() {
        return img3;
    }

    public void setImg3(String img3) {
        this.img3 = img3 == null ? null : img3.trim();
    }

    public String getImg4() {
        return img4;
    }

    public void setImg4(String img4) {
        this.img4 = img4 == null ? null : img4.trim();
    }

    public String getImg5() {
        return img5;
    }

    public void setImg5(String img5) {
        this.img5 = img5 == null ? null : img5.trim();
    }

    public String getImg6() {
        return img6;
    }

    public void setImg6(String img6) {
        this.img6 = img6 == null ? null : img6.trim();
    }

    public Integer getIsImg1() {
        return isImg1;
    }

    public void setIsImg1(Integer isImg1) {
        this.isImg1 = isImg1;
    }

    public Integer getIsImg2() {
        return isImg2;
    }

    public void setIsImg2(Integer isImg2) {
        this.isImg2 = isImg2;
    }

    public Integer getIsImg3() {
        return isImg3;
    }

    public void setIsImg3(Integer isImg3) {
        this.isImg3 = isImg3;
    }

    public Integer getIsImg4() {
        return isImg4;
    }

    public void setIsImg4(Integer isImg4) {
        this.isImg4 = isImg4;
    }

    public Integer getIsImg5() {
        return isImg5;
    }

    public void setIsImg5(Integer isImg5) {
        this.isImg5 = isImg5;
    }

    public Integer getIsImg6() {
        return isImg6;
    }

    public void setIsImg6(Integer isImg6) {
        this.isImg6 = isImg6;
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

    public Date getSharetime() {
        return sharetime;
    }

    public void setSharetime(Date sharetime) {
        this.sharetime = sharetime;
    }

    public Integer getSharecount() {
        return sharecount;
    }

    public void setSharecount(Integer sharecount) {
        this.sharecount = sharecount;
    }

    public Integer getTbsharecheckcount() {
        return tbsharecheckcount;
    }

    public void setTbsharecheckcount(Integer tbsharecheckcount) {
        this.tbsharecheckcount = tbsharecheckcount;
    }

    public Integer getTmsharecheckcount() {
        return tmsharecheckcount;
    }

    public void setTmsharecheckcount(Integer tmsharecheckcount) {
        this.tmsharecheckcount = tmsharecheckcount;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getProductcount() {
        return productcount;
    }

    public void setProductcount(Integer productcount) {
        this.productcount = productcount;
    }

    public Integer getVoucher() {
        return voucher;
    }

    public void setVoucher(Integer voucher) {
        this.voucher = voucher;
    }

    public Integer getAnswerno() {
        return answerno;
    }

    public void setAnswerno(Integer answerno) {
        this.answerno = answerno;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getEmark() {
        return emark;
    }

    public void setEmark(Integer emark) {
        this.emark = emark;
    }

    public Integer getEtbcard() {
        return etbcard;
    }

    public void setEtbcard(Integer etbcard) {
        this.etbcard = etbcard;
    }

    public Integer getEtmcard() {
        return etmcard;
    }

    public void setEtmcard(Integer etmcard) {
        this.etmcard = etmcard;
    }

    public Integer getEtbused() {
        return etbused;
    }

    public void setEtbused(Integer etbused) {
        this.etbused = etbused;
    }

    public Integer getEtmused() {
        return etmused;
    }

    public void setEtmused(Integer etmused) {
        this.etmused = etmused;
    }

    public Integer getPartnerid() {
        return partnerid;
    }

    public void setPartnerid(Integer partnerid) {
        this.partnerid = partnerid;
    }

    public String getOriginType() {
        return originType;
    }

    public void setOriginType(String originType) {
        this.originType = originType == null ? null : originType.trim();
    }

    public String getBesalman() {
        return besalman;
    }

    public void setBesalman(String besalman) {
        this.besalman = besalman == null ? null : besalman.trim();
    }
}