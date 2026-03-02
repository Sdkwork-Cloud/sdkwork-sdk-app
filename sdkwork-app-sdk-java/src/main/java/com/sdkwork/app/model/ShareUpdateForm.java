package com.sdkwork.app.model;

public class ShareUpdateForm {
    private String shareId;
    private String title;
    private String description;
    private String imageUrl;
    private Integer expireSeconds;
    private Boolean passwordRequired;
    private String password;
    private String status;

    public String getShareId() {
        return this.shareId;
    }
    
    public void setShareId(String shareId) {
        this.shareId = shareId;
    }

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }
    
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Integer getExpireSeconds() {
        return this.expireSeconds;
    }
    
    public void setExpireSeconds(Integer expireSeconds) {
        this.expireSeconds = expireSeconds;
    }

    public Boolean getPasswordRequired() {
        return this.passwordRequired;
    }
    
    public void setPasswordRequired(Boolean passwordRequired) {
        this.passwordRequired = passwordRequired;
    }

    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
}
