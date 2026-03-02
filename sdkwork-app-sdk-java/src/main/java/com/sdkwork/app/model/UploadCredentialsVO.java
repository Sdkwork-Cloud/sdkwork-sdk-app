package com.sdkwork.app.model;

public class UploadCredentialsVO {
    private String createdAt;
    private String updatedAt;
    private String accessKeyId;
    private String secretAccessKey;
    private String sessionToken;
    private String expirationTime;
    private String bucket;
    private String region;

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

    public String getAccessKeyId() {
        return this.accessKeyId;
    }
    
    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    public String getSecretAccessKey() {
        return this.secretAccessKey;
    }
    
    public void setSecretAccessKey(String secretAccessKey) {
        this.secretAccessKey = secretAccessKey;
    }

    public String getSessionToken() {
        return this.sessionToken;
    }
    
    public void setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
    }

    public String getExpirationTime() {
        return this.expirationTime;
    }
    
    public void setExpirationTime(String expirationTime) {
        this.expirationTime = expirationTime;
    }

    public String getBucket() {
        return this.bucket;
    }
    
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public String getRegion() {
        return this.region;
    }
    
    public void setRegion(String region) {
        this.region = region;
    }
}
