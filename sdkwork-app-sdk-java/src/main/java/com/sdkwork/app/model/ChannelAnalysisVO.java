package com.sdkwork.app.model;

public class ChannelAnalysisVO {
    private String createdAt;
    private String updatedAt;
    private String channelId;
    private String channelName;
    private String channelType;
    private Integer clickCount;
    private Integer installCount;
    private Integer activeCount;
    private Double conversionRate;
    private Double costPerInstall;
    private Double roi;

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

    public String getChannelId() {
        return this.channelId;
    }
    
    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getChannelName() {
        return this.channelName;
    }
    
    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getChannelType() {
        return this.channelType;
    }
    
    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    public Integer getClickCount() {
        return this.clickCount;
    }
    
    public void setClickCount(Integer clickCount) {
        this.clickCount = clickCount;
    }

    public Integer getInstallCount() {
        return this.installCount;
    }
    
    public void setInstallCount(Integer installCount) {
        this.installCount = installCount;
    }

    public Integer getActiveCount() {
        return this.activeCount;
    }
    
    public void setActiveCount(Integer activeCount) {
        this.activeCount = activeCount;
    }

    public Double getConversionRate() {
        return this.conversionRate;
    }
    
    public void setConversionRate(Double conversionRate) {
        this.conversionRate = conversionRate;
    }

    public Double getCostPerInstall() {
        return this.costPerInstall;
    }
    
    public void setCostPerInstall(Double costPerInstall) {
        this.costPerInstall = costPerInstall;
    }

    public Double getRoi() {
        return this.roi;
    }
    
    public void setRoi(Double roi) {
        this.roi = roi;
    }
}
