package com.sdkwork.app.model;

public class VipInfoVO {
    private String createdAt;
    private String updatedAt;
    private Integer vipLevel;
    private String vipLevelName;
    private String vipStatus;
    private String effectiveTime;
    private String expireTime;
    private Integer remainingDays;
    private Integer totalDays;
    private Integer totalSpent;
    private Integer vipPoints;
    private Integer growthValue;
    private Integer upgradeGrowthValue;
    private CustomerServiceInfo customerService;
    private List<VipBenefitVO> benefits;
    private List<VipCouponVO> coupons;

    public String getCreatedAt() {
        return this.createdAt;
    }
    
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return this.updatedAt;
    }
    
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getVipLevel() {
        return this.vipLevel;
    }
    
    public void setVipLevel(Integer vipLevel) {
        this.vipLevel = vipLevel;
    }

    public String getVipLevelName() {
        return this.vipLevelName;
    }
    
    public void setVipLevelName(String vipLevelName) {
        this.vipLevelName = vipLevelName;
    }

    public String getVipStatus() {
        return this.vipStatus;
    }
    
    public void setVipStatus(String vipStatus) {
        this.vipStatus = vipStatus;
    }

    public String getEffectiveTime() {
        return this.effectiveTime;
    }
    
    public void setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    public String getExpireTime() {
        return this.expireTime;
    }
    
    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public Integer getRemainingDays() {
        return this.remainingDays;
    }
    
    public void setRemainingDays(Integer remainingDays) {
        this.remainingDays = remainingDays;
    }

    public Integer getTotalDays() {
        return this.totalDays;
    }
    
    public void setTotalDays(Integer totalDays) {
        this.totalDays = totalDays;
    }

    public Integer getTotalSpent() {
        return this.totalSpent;
    }
    
    public void setTotalSpent(Integer totalSpent) {
        this.totalSpent = totalSpent;
    }

    public Integer getVipPoints() {
        return this.vipPoints;
    }
    
    public void setVipPoints(Integer vipPoints) {
        this.vipPoints = vipPoints;
    }

    public Integer getGrowthValue() {
        return this.growthValue;
    }
    
    public void setGrowthValue(Integer growthValue) {
        this.growthValue = growthValue;
    }

    public Integer getUpgradeGrowthValue() {
        return this.upgradeGrowthValue;
    }
    
    public void setUpgradeGrowthValue(Integer upgradeGrowthValue) {
        this.upgradeGrowthValue = upgradeGrowthValue;
    }

    public CustomerServiceInfo getCustomerService() {
        return this.customerService;
    }
    
    public void setCustomerService(CustomerServiceInfo customerService) {
        this.customerService = customerService;
    }

    public List<VipBenefitVO> getBenefits() {
        return this.benefits;
    }
    
    public void setBenefits(List<VipBenefitVO> benefits) {
        this.benefits = benefits;
    }

    public List<VipCouponVO> getCoupons() {
        return this.coupons;
    }
    
    public void setCoupons(List<VipCouponVO> coupons) {
        this.coupons = coupons;
    }
}
