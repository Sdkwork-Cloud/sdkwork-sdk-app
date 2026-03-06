package com.sdkwork.app.model;

public class AppUpdateForm {
    private String name;
    private String description;
    private String accessUrl;
    private String version;
    private String iconUrl;
    private AppConfig config;
    private AppPlatforms platforms;
    private AppPlatforms installPlatforms;
    private AppInstallSkill installSkill;
    private AppInstallConfig installConfig;
    private String packageName;
    private String bundleId;
    private String storeUrl;
    private String downloadUrl;

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

    public String getIconUrl() {
        return this.iconUrl;
    }
    
    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public AppConfig getConfig() {
        return this.config;
    }
    
    public void setConfig(AppConfig config) {
        this.config = config;
    }

    public AppPlatforms getPlatforms() {
        return this.platforms;
    }
    
    public void setPlatforms(AppPlatforms platforms) {
        this.platforms = platforms;
    }

    public AppPlatforms getInstallPlatforms() {
        return this.installPlatforms;
    }
    
    public void setInstallPlatforms(AppPlatforms installPlatforms) {
        this.installPlatforms = installPlatforms;
    }

    public AppInstallSkill getInstallSkill() {
        return this.installSkill;
    }
    
    public void setInstallSkill(AppInstallSkill installSkill) {
        this.installSkill = installSkill;
    }

    public AppInstallConfig getInstallConfig() {
        return this.installConfig;
    }
    
    public void setInstallConfig(AppInstallConfig installConfig) {
        this.installConfig = installConfig;
    }

    public String getPackageName() {
        return this.packageName;
    }
    
    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getBundleId() {
        return this.bundleId;
    }
    
    public void setBundleId(String bundleId) {
        this.bundleId = bundleId;
    }

    public String getStoreUrl() {
        return this.storeUrl;
    }
    
    public void setStoreUrl(String storeUrl) {
        this.storeUrl = storeUrl;
    }

    public String getDownloadUrl() {
        return this.downloadUrl;
    }
    
    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }
}
