package com.sdkwork.app.model;

public class VipDailyRewardVO {
    private String createdAt;
    private String updatedAt;
    private Integer rewardPoints;
    private String claimedAt;
    private String message;
    private Integer consecutiveDays;

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

    public Integer getRewardPoints() {
        return this.rewardPoints;
    }
    
    public void setRewardPoints(Integer rewardPoints) {
        this.rewardPoints = rewardPoints;
    }

    public String getClaimedAt() {
        return this.claimedAt;
    }
    
    public void setClaimedAt(String claimedAt) {
        this.claimedAt = claimedAt;
    }

    public String getMessage() {
        return this.message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getConsecutiveDays() {
        return this.consecutiveDays;
    }
    
    public void setConsecutiveDays(Integer consecutiveDays) {
        this.consecutiveDays = consecutiveDays;
    }
}
