package com.sdkwork.app.model;

public class UploadPolicyVO {
    private String createdAt;
    private String updatedAt;
    private String bucketName;
    private String objectKeyPrefix;
    private String expirationTime;
    private Integer maxFileSize;
    private Integer minFileSize;
    private List<String> allowedContentTypes;
    private Boolean allowOverwrite;
    private String callbackUrl;

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

    public String getBucketName() {
        return this.bucketName;
    }
    
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getObjectKeyPrefix() {
        return this.objectKeyPrefix;
    }
    
    public void setObjectKeyPrefix(String objectKeyPrefix) {
        this.objectKeyPrefix = objectKeyPrefix;
    }

    public String getExpirationTime() {
        return this.expirationTime;
    }
    
    public void setExpirationTime(String expirationTime) {
        this.expirationTime = expirationTime;
    }

    public Integer getMaxFileSize() {
        return this.maxFileSize;
    }
    
    public void setMaxFileSize(Integer maxFileSize) {
        this.maxFileSize = maxFileSize;
    }

    public Integer getMinFileSize() {
        return this.minFileSize;
    }
    
    public void setMinFileSize(Integer minFileSize) {
        this.minFileSize = minFileSize;
    }

    public List<String> getAllowedContentTypes() {
        return this.allowedContentTypes;
    }
    
    public void setAllowedContentTypes(List<String> allowedContentTypes) {
        this.allowedContentTypes = allowedContentTypes;
    }

    public Boolean getAllowOverwrite() {
        return this.allowOverwrite;
    }
    
    public void setAllowOverwrite(Boolean allowOverwrite) {
        this.allowOverwrite = allowOverwrite;
    }

    public String getCallbackUrl() {
        return this.callbackUrl;
    }
    
    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }
}
