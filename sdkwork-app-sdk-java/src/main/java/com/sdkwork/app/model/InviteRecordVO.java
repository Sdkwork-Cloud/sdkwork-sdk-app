package com.sdkwork.app.model;

public class InviteRecordVO {
    private String createdAt;
    private String updatedAt;
    private String id;
    private String inviteeId;
    private String inviteeNickname;
    private String inviteTime;
    private String status;
    private String rewardAmount;

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

    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public String getInviteeId() {
        return this.inviteeId;
    }
    
    public void setInviteeId(String inviteeId) {
        this.inviteeId = inviteeId;
    }

    public String getInviteeNickname() {
        return this.inviteeNickname;
    }
    
    public void setInviteeNickname(String inviteeNickname) {
        this.inviteeNickname = inviteeNickname;
    }

    public String getInviteTime() {
        return this.inviteTime;
    }
    
    public void setInviteTime(String inviteTime) {
        this.inviteTime = inviteTime;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getRewardAmount() {
        return this.rewardAmount;
    }
    
    public void setRewardAmount(String rewardAmount) {
        this.rewardAmount = rewardAmount;
    }
}
