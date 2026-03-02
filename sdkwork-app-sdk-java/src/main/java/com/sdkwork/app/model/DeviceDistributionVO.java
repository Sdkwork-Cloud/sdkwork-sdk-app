package com.sdkwork.app.model;

public class DeviceDistributionVO {
    private String createdAt;
    private String updatedAt;
    private String deviceType;
    private String deviceModel;
    private String osType;
    private String osVersion;
    private Integer userCount;
    private Double percentage;
    private Integer activeCount;

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

    public String getDeviceType() {
        return this.deviceType;
    }
    
    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getDeviceModel() {
        return this.deviceModel;
    }
    
    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }

    public String getOsType() {
        return this.osType;
    }
    
    public void setOsType(String osType) {
        this.osType = osType;
    }

    public String getOsVersion() {
        return this.osVersion;
    }
    
    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public Integer getUserCount() {
        return this.userCount;
    }
    
    public void setUserCount(Integer userCount) {
        this.userCount = userCount;
    }

    public Double getPercentage() {
        return this.percentage;
    }
    
    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    public Integer getActiveCount() {
        return this.activeCount;
    }
    
    public void setActiveCount(Integer activeCount) {
        this.activeCount = activeCount;
    }
}
