package com.sdkwork.app.model;

public class VipInviteRecordVO {
    private String createdAt;
    private String updatedAt;
    private Integer id;
    private Integer inviteeId;
    private String inviteeNickname;
    private String inviteeAvatar;
    private String status;
    private Integer rewardPoints;
    private String invitedAt;
    private String completedAt;

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

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getInviteeId() {
        return this.inviteeId;
    }
    
    public void setInviteeId(Integer inviteeId) {
        this.inviteeId = inviteeId;
    }

    public String getInviteeNickname() {
        return this.inviteeNickname;
    }
    
    public void setInviteeNickname(String inviteeNickname) {
        this.inviteeNickname = inviteeNickname;
    }

    public String getInviteeAvatar() {
        return this.inviteeAvatar;
    }
    
    public void setInviteeAvatar(String inviteeAvatar) {
        this.inviteeAvatar = inviteeAvatar;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getRewardPoints() {
        return this.rewardPoints;
    }
    
    public void setRewardPoints(Integer rewardPoints) {
        this.rewardPoints = rewardPoints;
    }

    public String getInvitedAt() {
        return this.invitedAt;
    }
    
    public void setInvitedAt(String invitedAt) {
        this.invitedAt = invitedAt;
    }

    public String getCompletedAt() {
        return this.completedAt;
    }
    
    public void setCompletedAt(String completedAt) {
        this.completedAt = completedAt;
    }
}
