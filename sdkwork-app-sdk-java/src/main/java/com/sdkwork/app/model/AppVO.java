package com.sdkwork.app.model;

public class AppVO {
    private String createdAt;
    private String updatedAt;
    private String appId;
    private String name;
    private String description;
    private ImageMediaResource icon;
    private String iconUrl;
    private String accessUrl;
    private String version;
    private String appType;
    private String status;
    private Integer projectId;
    private AppInstallSkill installSkill;

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

    public String getAppId() {
        return this.appId;
    }
    
    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public ImageMediaResource getIcon() {
        return this.icon;
    }
    
    public void setIcon(ImageMediaResource icon) {
        this.icon = icon;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }
    
    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public String getAccessUrl() {
        return this.accessUrl;
    }
    
    public void setAccessUrl(String accessUrl) {
        this.accessUrl = accessUrl;
    }

    public String getVersion() {
        return this.version;
    }
    
    public void setVersion(String version) {
        this.version = version;
    }

    public String getAppType() {
        return this.appType;
    }
    
    public void setAppType(String appType) {
        this.appType = appType;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getProjectId() {
        return this.projectId;
    }
    
    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public AppInstallSkill getInstallSkill() {
        return this.installSkill;
    }
    
    public void setInstallSkill(AppInstallSkill installSkill) {
        this.installSkill = installSkill;
    }
}
