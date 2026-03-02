package com.sdkwork.app.model;

public class RewardVerifyVO {
    private String createdAt;
    private String updatedAt;
    private Boolean verified;
    private String rewardId;
    private String rewardType;
    private Integer rewardAmount;
    private String message;
    private String verificationToken;

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

    public Boolean getVerified() {
        return this.verified;
    }
    
    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    public String getRewardId() {
        return this.rewardId;
    }
    
    public void setRewardId(String rewardId) {
        this.rewardId = rewardId;
    }

    public String getRewardType() {
        return this.rewardType;
    }
    
    public void setRewardType(String rewardType) {
        this.rewardType = rewardType;
    }

    public Integer getRewardAmount() {
        return this.rewardAmount;
    }
    
    public void setRewardAmount(Integer rewardAmount) {
        this.rewardAmount = rewardAmount;
    }

    public String getMessage() {
        return this.message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }

    public String getVerificationToken() {
        return this.verificationToken;
    }
    
    public void setVerificationToken(String verificationToken) {
        this.verificationToken = verificationToken;
    }
}
