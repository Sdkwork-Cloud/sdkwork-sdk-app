package com.sdkwork.app.model;

public class UpdateCheckVO {
    private String createdAt;
    private String updatedAt;
    private Boolean hasUpdate;
    private String latestVersion;
    private String currentVersion;
    private String downloadUrl;
    private String updateType;
    private String title;
    private String description;
    private Integer fileSize;
    private Boolean forceUpdate;

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

    public Boolean getHasUpdate() {
        return this.hasUpdate;
    }
    
    public void setHasUpdate(Boolean hasUpdate) {
        this.hasUpdate = hasUpdate;
    }

    public String getLatestVersion() {
        return this.latestVersion;
    }
    
    public void setLatestVersion(String latestVersion) {
        this.latestVersion = latestVersion;
    }

    public String getCurrentVersion() {
        return this.currentVersion;
    }
    
    public void setCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
    }

    public String getDownloadUrl() {
        return this.downloadUrl;
    }
    
    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public String getUpdateType() {
        return this.updateType;
    }
    
    public void setUpdateType(String updateType) {
        this.updateType = updateType;
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

    public Integer getFileSize() {
        return this.fileSize;
    }
    
    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    public Boolean getForceUpdate() {
        return this.forceUpdate;
    }
    
    public void setForceUpdate(Boolean forceUpdate) {
        this.forceUpdate = forceUpdate;
    }
}
