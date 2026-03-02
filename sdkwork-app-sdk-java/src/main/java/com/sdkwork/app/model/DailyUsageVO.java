package com.sdkwork.app.model;

public class DailyUsageVO {
    private Integer generationCount;
    private Integer usageTime;
    private Integer storageUsage;

    public Integer getGenerationCount() {
        return this.generationCount;
    }
    
    public void setGenerationCount(Integer generationCount) {
        this.generationCount = generationCount;
    }

    public Integer getUsageTime() {
        return this.usageTime;
    }
    
    public void setUsageTime(Integer usageTime) {
        this.usageTime = usageTime;
    }

    public Integer getStorageUsage() {
        return this.storageUsage;
    }
    
    public void setStorageUsage(Integer storageUsage) {
        this.storageUsage = storageUsage;
    }
}
