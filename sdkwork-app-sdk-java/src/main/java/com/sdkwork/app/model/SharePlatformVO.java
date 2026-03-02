package com.sdkwork.app.model;

public class SharePlatformVO {
    private String createdAt;
    private String updatedAt;
    private String platformId;
    private String platformName;
    private String platformIcon;
    private Boolean supported;

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

    public String getPlatformId() {
        return this.platformId;
    }
    
    public void setPlatformId(String platformId) {
        this.platformId = platformId;
    }

    public String getPlatformName() {
        return this.platformName;
    }
    
    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    public String getPlatformIcon() {
        return this.platformIcon;
    }
    
    public void setPlatformIcon(String platformIcon) {
        this.platformIcon = platformIcon;
    }

    public Boolean getSupported() {
        return this.supported;
    }
    
    public void setSupported(Boolean supported) {
        this.supported = supported;
    }
}
