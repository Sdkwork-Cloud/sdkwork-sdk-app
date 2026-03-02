package com.sdkwork.app.model;

public class EventTrendVO {
    private String createdAt;
    private String updatedAt;
    private String eventName;
    private List<String> timePoints;
    private List<Integer> values;
    private Integer totalCount;
    private Double growthRate;
    private String interval;

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

    public String getEventName() {
        return this.eventName;
    }
    
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public List<String> getTimePoints() {
        return this.timePoints;
    }
    
    public void setTimePoints(List<String> timePoints) {
        this.timePoints = timePoints;
    }

    public List<Integer> getValues() {
        return this.values;
    }
    
    public void setValues(List<Integer> values) {
        this.values = values;
    }

    public Integer getTotalCount() {
        return this.totalCount;
    }
    
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Double getGrowthRate() {
        return this.growthRate;
    }
    
    public void setGrowthRate(Double growthRate) {
        this.growthRate = growthRate;
    }

    public String getInterval() {
        return this.interval;
    }
    
    public void setInterval(String interval) {
        this.interval = interval;
    }
}
