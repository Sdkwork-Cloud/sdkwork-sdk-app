package com.sdkwork.app.model;

public class PrizeClaimVO {
    private String createdAt;
    private String updatedAt;
    private Boolean success;
    private String prizeName;
    private String prizeType;
    private String claimTime;
    private Map<String, Object> rewardDetails;
    private String message;

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

    public Boolean getSuccess() {
        return this.success;
    }
    
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getPrizeName() {
        return this.prizeName;
    }
    
    public void setPrizeName(String prizeName) {
        this.prizeName = prizeName;
    }

    public String getPrizeType() {
        return this.prizeType;
    }
    
    public void setPrizeType(String prizeType) {
        this.prizeType = prizeType;
    }

    public String getClaimTime() {
        return this.claimTime;
    }
    
    public void setClaimTime(String claimTime) {
        this.claimTime = claimTime;
    }

    public Map<String, Object> getRewardDetails() {
        return this.rewardDetails;
    }
    
    public void setRewardDetails(Map<String, Object> rewardDetails) {
        this.rewardDetails = rewardDetails;
    }

    public String getMessage() {
        return this.message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
}
