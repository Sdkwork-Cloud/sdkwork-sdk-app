package com.sdkwork.app.model;

public class VipStatisticsVO {
    private String createdAt;
    private String updatedAt;
    private String status;
    private String level;
    private String startedAt;
    private String expiredAt;
    private Integer remainingDays;
    private Integer totalDays;
    private List<VipPrivilegeVO> privileges;
    private VipRenewalVO renewalInfo;
    private VipUpgradeVO upgradeInfo;

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

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getLevel() {
        return this.level;
    }
    
    public void setLevel(String level) {
        this.level = level;
    }

    public String getStartedAt() {
        return this.startedAt;
    }
    
    public void setStartedAt(String startedAt) {
        this.startedAt = startedAt;
    }

    public String getExpiredAt() {
        return this.expiredAt;
    }
    
    public void setExpiredAt(String expiredAt) {
        this.expiredAt = expiredAt;
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

    public List<VipPrivilegeVO> getPrivileges() {
        return this.privileges;
    }
    
    public void setPrivileges(List<VipPrivilegeVO> privileges) {
        this.privileges = privileges;
    }

    public VipRenewalVO getRenewalInfo() {
        return this.renewalInfo;
    }
    
    public void setRenewalInfo(VipRenewalVO renewalInfo) {
        this.renewalInfo = renewalInfo;
    }

    public VipUpgradeVO getUpgradeInfo() {
        return this.upgradeInfo;
    }
    
    public void setUpgradeInfo(VipUpgradeVO upgradeInfo) {
        this.upgradeInfo = upgradeInfo;
    }
}
