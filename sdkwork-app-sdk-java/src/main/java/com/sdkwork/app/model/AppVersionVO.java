package com.sdkwork.app.model;

public class AppVersionVO {
    private String createdAt;
    private String updatedAt;
    private String currentVersion;
    private String latestVersion;
    private Boolean updateRequired;
    private Boolean forceUpdate;
    private String updateDescription;
    private String updateUrl;
    private String updateSize;
    private Integer releaseDate;

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

    public String getCurrentVersion() {
        return this.currentVersion;
    }
    
    public void setCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
    }

    public String getLatestVersion() {
        return this.latestVersion;
    }
    
    public void setLatestVersion(String latestVersion) {
        this.latestVersion = latestVersion;
    }

    public Boolean getUpdateRequired() {
        return this.updateRequired;
    }
    
    public void setUpdateRequired(Boolean updateRequired) {
        this.updateRequired = updateRequired;
    }

    public Boolean getForceUpdate() {
        return this.forceUpdate;
    }
    
    public void setForceUpdate(Boolean forceUpdate) {
        this.forceUpdate = forceUpdate;
    }

    public String getUpdateDescription() {
        return this.updateDescription;
    }
    
    public void setUpdateDescription(String updateDescription) {
        this.updateDescription = updateDescription;
    }

    public String getUpdateUrl() {
        return this.updateUrl;
    }
    
    public void setUpdateUrl(String updateUrl) {
        this.updateUrl = updateUrl;
    }

    public String getUpdateSize() {
        return this.updateSize;
    }
    
    public void setUpdateSize(String updateSize) {
        this.updateSize = updateSize;
    }

    public Integer getReleaseDate() {
        return this.releaseDate;
    }
    
    public void setReleaseDate(Integer releaseDate) {
        this.releaseDate = releaseDate;
    }
}
