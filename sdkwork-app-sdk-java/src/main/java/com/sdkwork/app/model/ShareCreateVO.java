package com.sdkwork.app.model;

public class ShareCreateVO {
    private String createdAt;
    private String updatedAt;
    private String shareId;
    private String shareUrl;
    private String qrCode;
    private String expireTime;
    private String password;

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

    public String getShareId() {
        return this.shareId;
    }
    
    public void setShareId(String shareId) {
        this.shareId = shareId;
    }

    public String getShareUrl() {
        return this.shareUrl;
    }
    
    public void setShareUrl(String shareUrl) {
        this.shareUrl = shareUrl;
    }

    public String getQrCode() {
        return this.qrCode;
    }
    
    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public String getExpireTime() {
        return this.expireTime;
    }
    
    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
}
