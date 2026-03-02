package com.sdkwork.app.model;

public class AdvertVO {
    private String createdAt;
    private String updatedAt;
    private String advertId;
    private String advertName;
    private String advertType;
    private String positionId;
    private String creativeUrl;
    private String landingUrl;
    private Integer priority;
    private Boolean enabled;
    private String startTime;
    private String endTime;
    private Integer clickCount;
    private Integer impressionCount;

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

    public String getAdvertId() {
        return this.advertId;
    }
    
    public void setAdvertId(String advertId) {
        this.advertId = advertId;
    }

    public String getAdvertName() {
        return this.advertName;
    }
    
    public void setAdvertName(String advertName) {
        this.advertName = advertName;
    }

    public String getAdvertType() {
        return this.advertType;
    }
    
    public void setAdvertType(String advertType) {
        this.advertType = advertType;
    }

    public String getPositionId() {
        return this.positionId;
    }
    
    public void setPositionId(String positionId) {
        this.positionId = positionId;
    }

    public String getCreativeUrl() {
        return this.creativeUrl;
    }
    
    public void setCreativeUrl(String creativeUrl) {
        this.creativeUrl = creativeUrl;
    }

    public String getLandingUrl() {
        return this.landingUrl;
    }
    
    public void setLandingUrl(String landingUrl) {
        this.landingUrl = landingUrl;
    }

    public Integer getPriority() {
        return this.priority;
    }
    
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }
    
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getStartTime() {
        return this.startTime;
    }
    
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return this.endTime;
    }
    
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Integer getClickCount() {
        return this.clickCount;
    }
    
    public void setClickCount(Integer clickCount) {
        this.clickCount = clickCount;
    }

    public Integer getImpressionCount() {
        return this.impressionCount;
    }
    
    public void setImpressionCount(Integer impressionCount) {
        this.impressionCount = impressionCount;
    }
}
