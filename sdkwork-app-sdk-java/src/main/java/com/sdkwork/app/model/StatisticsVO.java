package com.sdkwork.app.model;

public class StatisticsVO {
    private Integer totalProjects;
    private Integer totalGenerations;
    private Integer totalUsageTime;
    private StorageStatisticsVO storage;
    private DailyUsageVO dailyUsage;

    public Integer getTotalProjects() {
        return this.totalProjects;
    }
    
    public void setTotalProjects(Integer totalProjects) {
        this.totalProjects = totalProjects;
    }

    public Integer getTotalGenerations() {
        return this.totalGenerations;
    }
    
    public void setTotalGenerations(Integer totalGenerations) {
        this.totalGenerations = totalGenerations;
    }

    public Integer getTotalUsageTime() {
        return this.totalUsageTime;
    }
    
    public void setTotalUsageTime(Integer totalUsageTime) {
        this.totalUsageTime = totalUsageTime;
    }

    public StorageStatisticsVO getStorage() {
        return this.storage;
    }
    
    public void setStorage(StorageStatisticsVO storage) {
        this.storage = storage;
    }

    public DailyUsageVO getDailyUsage() {
        return this.dailyUsage;
    }
    
    public void setDailyUsage(DailyUsageVO dailyUsage) {
        this.dailyUsage = dailyUsage;
    }
}
