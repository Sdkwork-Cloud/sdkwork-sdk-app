package com.sdkwork.app.model;

public class InviteLinkVO {
    private String createdAt;
    private String updatedAt;
    private String inviteLink;
    private String inviteCode;
    private String expireTime;
    private String qrCode;

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

    public String getInviteLink() {
        return this.inviteLink;
    }
    
    public void setInviteLink(String inviteLink) {
        this.inviteLink = inviteLink;
    }

    public String getInviteCode() {
        return this.inviteCode;
    }
    
    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode;
    }

    public String getExpireTime() {
        return this.expireTime;
    }
    
    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public String getQrCode() {
        return this.qrCode;
    }
    
    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }
}
