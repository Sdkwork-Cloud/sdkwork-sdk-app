package com.sdkwork.app.model;

public class InviteInfoVO {
    private String createdAt;
    private String updatedAt;
    private String inviteCode;
    private String inviteLink;
    private Integer inviteCount;
    private String rewardAmount;
    private String remainingReward;

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

    public String getInviteCode() {
        return this.inviteCode;
    }
    
    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode;
    }

    public String getInviteLink() {
        return this.inviteLink;
    }
    
    public void setInviteLink(String inviteLink) {
        this.inviteLink = inviteLink;
    }

    public Integer getInviteCount() {
        return this.inviteCount;
    }
    
    public void setInviteCount(Integer inviteCount) {
        this.inviteCount = inviteCount;
    }

    public String getRewardAmount() {
        return this.rewardAmount;
    }
    
    public void setRewardAmount(String rewardAmount) {
        this.rewardAmount = rewardAmount;
    }

    public String getRemainingReward() {
        return this.remainingReward;
    }
    
    public void setRemainingReward(String remainingReward) {
        this.remainingReward = remainingReward;
    }
}
