package com.sdkwork.app.model;

public class VipInviteInfoVO {
    private String createdAt;
    private String updatedAt;
    private String inviteCode;
    private String inviteLink;
    private Integer totalInvites;
    private Integer successfulInvites;
    private Integer rewardPoints;
    private String rewardRule;

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

    public Integer getTotalInvites() {
        return this.totalInvites;
    }
    
    public void setTotalInvites(Integer totalInvites) {
        this.totalInvites = totalInvites;
    }

    public Integer getSuccessfulInvites() {
        return this.successfulInvites;
    }
    
    public void setSuccessfulInvites(Integer successfulInvites) {
        this.successfulInvites = successfulInvites;
    }

    public Integer getRewardPoints() {
        return this.rewardPoints;
    }
    
    public void setRewardPoints(Integer rewardPoints) {
        this.rewardPoints = rewardPoints;
    }

    public String getRewardRule() {
        return this.rewardRule;
    }
    
    public void setRewardRule(String rewardRule) {
        this.rewardRule = rewardRule;
    }
}
