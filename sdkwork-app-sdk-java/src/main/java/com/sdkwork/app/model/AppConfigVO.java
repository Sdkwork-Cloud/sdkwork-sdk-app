package com.sdkwork.app.model;

public class AppConfigVO {
    private String createdAt;
    private String updatedAt;
    private String version;
    private String buildNumber;
    private String apiVersion;
    private Integer serverTime;
    private Map<String, Boolean> features;
    private Map<String, Object> systemConfig;
    private Boolean maintenanceMode;
    private String maintenanceMessage;

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

    public String getVersion() {
        return this.version;
    }
    
    public void setVersion(String version) {
        this.version = version;
    }

    public String getBuildNumber() {
        return this.buildNumber;
    }
    
    public void setBuildNumber(String buildNumber) {
        this.buildNumber = buildNumber;
    }

    public String getApiVersion() {
        return this.apiVersion;
    }
    
    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public Integer getServerTime() {
        return this.serverTime;
    }
    
    public void setServerTime(Integer serverTime) {
        this.serverTime = serverTime;
    }

    public Map<String, Boolean> getFeatures() {
        return this.features;
    }
    
    public void setFeatures(Map<String, Boolean> features) {
        this.features = features;
    }

    public Map<String, Object> getSystemConfig() {
        return this.systemConfig;
    }
    
    public void setSystemConfig(Map<String, Object> systemConfig) {
        this.systemConfig = systemConfig;
    }

    public Boolean getMaintenanceMode() {
        return this.maintenanceMode;
    }
    
    public void setMaintenanceMode(Boolean maintenanceMode) {
        this.maintenanceMode = maintenanceMode;
    }

    public String getMaintenanceMessage() {
        return this.maintenanceMessage;
    }
    
    public void setMaintenanceMessage(String maintenanceMessage) {
        this.maintenanceMessage = maintenanceMessage;
    }
}
