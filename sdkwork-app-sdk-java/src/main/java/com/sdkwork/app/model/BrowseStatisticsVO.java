package com.sdkwork.app.model;

public class BrowseStatisticsVO {
    private String createdAt;
    private String updatedAt;
    private Integer totalCount;
    private Integer totalDuration;
    private Integer averageDuration;
    private Integer todayCount;
    private Integer weeklyCount;
    private Integer monthlyCount;
    private Map<String, Integer> typeDistribution;
    private Map<String, Integer> sourceDistribution;
    private Map<String, Integer> dailyTrend;

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

    public Integer getTotalCount() {
        return this.totalCount;
    }
    
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getTotalDuration() {
        return this.totalDuration;
    }
    
    public void setTotalDuration(Integer totalDuration) {
        this.totalDuration = totalDuration;
    }

    public Integer getAverageDuration() {
        return this.averageDuration;
    }
    
    public void setAverageDuration(Integer averageDuration) {
        this.averageDuration = averageDuration;
    }

    public Integer getTodayCount() {
        return this.todayCount;
    }
    
    public void setTodayCount(Integer todayCount) {
        this.todayCount = todayCount;
    }

    public Integer getWeeklyCount() {
        return this.weeklyCount;
    }
    
    public void setWeeklyCount(Integer weeklyCount) {
        this.weeklyCount = weeklyCount;
    }

    public Integer getMonthlyCount() {
        return this.monthlyCount;
    }
    
    public void setMonthlyCount(Integer monthlyCount) {
        this.monthlyCount = monthlyCount;
    }

    public Map<String, Integer> getTypeDistribution() {
        return this.typeDistribution;
    }
    
    public void setTypeDistribution(Map<String, Integer> typeDistribution) {
        this.typeDistribution = typeDistribution;
    }

    public Map<String, Integer> getSourceDistribution() {
        return this.sourceDistribution;
    }
    
    public void setSourceDistribution(Map<String, Integer> sourceDistribution) {
        this.sourceDistribution = sourceDistribution;
    }

    public Map<String, Integer> getDailyTrend() {
        return this.dailyTrend;
    }
    
    public void setDailyTrend(Map<String, Integer> dailyTrend) {
        this.dailyTrend = dailyTrend;
    }
}
