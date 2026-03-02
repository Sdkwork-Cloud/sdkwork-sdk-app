package com.sdkwork.app.model;

public class DownloadUrlVO {
    private String createdAt;
    private String updatedAt;
    private AssetMediaResource resource;
    private Integer expiresIn;

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

    public AssetMediaResource getResource() {
        return this.resource;
    }
    
    public void setResource(AssetMediaResource resource) {
        this.resource = resource;
    }

    public Integer getExpiresIn() {
        return this.expiresIn;
    }
    
    public void setExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
    }
}
