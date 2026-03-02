package com.sdkwork.app.model;

public class PresignedUrlForm {
    private String objectKey;
    private String bucket;
    private String method;
    private Integer expirationSeconds;

    public String getObjectKey() {
        return this.objectKey;
    }
    
    public void setObjectKey(String objectKey) {
        this.objectKey = objectKey;
    }

    public String getBucket() {
        return this.bucket;
    }
    
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public String getMethod() {
        return this.method;
    }
    
    public void setMethod(String method) {
        this.method = method;
    }

    public Integer getExpirationSeconds() {
        return this.expirationSeconds;
    }
    
    public void setExpirationSeconds(Integer expirationSeconds) {
        this.expirationSeconds = expirationSeconds;
    }
}
