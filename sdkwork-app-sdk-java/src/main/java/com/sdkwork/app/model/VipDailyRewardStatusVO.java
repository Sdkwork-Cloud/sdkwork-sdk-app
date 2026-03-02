package com.sdkwork.app.model;

public class VipDailyRewardStatusVO {
    private String createdAt;
    private String updatedAt;
    private Boolean canClaim;
    private Boolean claimedToday;
    private Integer consecutiveDays;
    private Integer totalDays;

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

    public Boolean getCanClaim() {
        return this.canClaim;
    }
    
    public void setCanClaim(Boolean canClaim) {
        this.canClaim = canClaim;
    }

    public Boolean getClaimedToday() {
        return this.claimedToday;
    }
    
    public void setClaimedToday(Boolean claimedToday) {
        this.claimedToday = claimedToday;
    }

    public Integer getConsecutiveDays() {
        return this.consecutiveDays;
    }
    
    public void setConsecutiveDays(Integer consecutiveDays) {
        this.consecutiveDays = consecutiveDays;
    }

    public Integer getTotalDays() {
        return this.totalDays;
    }
    
    public void setTotalDays(Integer totalDays) {
        this.totalDays = totalDays;
    }
}
