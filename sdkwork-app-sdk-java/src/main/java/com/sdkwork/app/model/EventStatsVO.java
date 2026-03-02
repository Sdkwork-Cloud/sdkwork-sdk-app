package com.sdkwork.app.model;

public class EventStatsVO {
    private String createdAt;
    private String updatedAt;
    private String eventName;
    private Integer totalCount;
    private Double averagePerUser;
    private Map<String, Integer> hourlyStats;
    private Map<String, Integer> dailyStats;
    private Map<String, Object> topProperties;

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

    public Integer getTotalCount() {
        return this.totalCount;
    }
    
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Double getAveragePerUser() {
        return this.averagePerUser;
    }
    
    public void setAveragePerUser(Double averagePerUser) {
        this.averagePerUser = averagePerUser;
    }

    public Map<String, Integer> getHourlyStats() {
        return this.hourlyStats;
    }
    
    public void setHourlyStats(Map<String, Integer> hourlyStats) {
        this.hourlyStats = hourlyStats;
    }

    public Map<String, Integer> getDailyStats() {
        return this.dailyStats;
    }
    
    public void setDailyStats(Map<String, Integer> dailyStats) {
        this.dailyStats = dailyStats;
    }

    public Map<String, Object> getTopProperties() {
        return this.topProperties;
    }
    
    public void setTopProperties(Map<String, Object> topProperties) {
        this.topProperties = topProperties;
    }
}
