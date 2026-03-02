package com.sdkwork.app.model;

public class PresignedUrlVO {
    private String createdAt;
    private String updatedAt;
    private String url;
    private String previewUrl;
    private String objectKey;

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

    public String getUrl() {
        return this.url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }

    public String getPreviewUrl() {
        return this.previewUrl;
    }
    
    public void setPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
    }

    public String getObjectKey() {
        return this.objectKey;
    }
    
    public void setObjectKey(String objectKey) {
        this.objectKey = objectKey;
    }
}
