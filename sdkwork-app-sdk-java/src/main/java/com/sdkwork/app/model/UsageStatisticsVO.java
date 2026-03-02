package com.sdkwork.app.model;

public class UsageStatisticsVO {
    private String createdAt;
    private String updatedAt;
    private Integer todayUsage;
    private Integer weekUsage;
    private Integer monthUsage;
    private Integer totalUsage;
    private Double avgDailyUsage;
    private Integer maxDailyUsage;
    private UsageFrequencyVO frequency;
    private UsageTimeDistributionVO timeDistribution;

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

    public Integer getTodayUsage() {
        return this.todayUsage;
    }
    
    public void setTodayUsage(Integer todayUsage) {
        this.todayUsage = todayUsage;
    }

    public Integer getWeekUsage() {
        return this.weekUsage;
    }
    
    public void setWeekUsage(Integer weekUsage) {
        this.weekUsage = weekUsage;
    }

    public Integer getMonthUsage() {
        return this.monthUsage;
    }
    
    public void setMonthUsage(Integer monthUsage) {
        this.monthUsage = monthUsage;
    }

    public Integer getTotalUsage() {
        return this.totalUsage;
    }
    
    public void setTotalUsage(Integer totalUsage) {
        this.totalUsage = totalUsage;
    }

    public Double getAvgDailyUsage() {
        return this.avgDailyUsage;
    }
    
    public void setAvgDailyUsage(Double avgDailyUsage) {
        this.avgDailyUsage = avgDailyUsage;
    }

    public Integer getMaxDailyUsage() {
        return this.maxDailyUsage;
    }
    
    public void setMaxDailyUsage(Integer maxDailyUsage) {
        this.maxDailyUsage = maxDailyUsage;
    }

    public UsageFrequencyVO getFrequency() {
        return this.frequency;
    }
    
    public void setFrequency(UsageFrequencyVO frequency) {
        this.frequency = frequency;
    }

    public UsageTimeDistributionVO getTimeDistribution() {
        return this.timeDistribution;
    }
    
    public void setTimeDistribution(UsageTimeDistributionVO timeDistribution) {
        this.timeDistribution = timeDistribution;
    }
}
