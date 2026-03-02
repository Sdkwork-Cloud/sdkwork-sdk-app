package com.sdkwork.app.model;

public class OAuthUrlVO {
    private String createdAt;
    private String updatedAt;
    private String authUrl;

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

    public String getAuthUrl() {
        return this.authUrl;
    }
    
    public void setAuthUrl(String authUrl) {
        this.authUrl = authUrl;
    }
}
