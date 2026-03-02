package com.sdkwork.app.model;

public class StorageStatisticsVO {
    private String createdAt;
    private String updatedAt;
    private Integer totalStorage;
    private Integer usedStorage;
    private Integer remainingStorage;
    private Double usageRate;
    private StorageTypeDistributionVO typeDistribution;
    private StorageTrendVO trend;

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

    public Integer getTotalStorage() {
        return this.totalStorage;
    }
    
    public void setTotalStorage(Integer totalStorage) {
        this.totalStorage = totalStorage;
    }

    public Integer getUsedStorage() {
        return this.usedStorage;
    }
    
    public void setUsedStorage(Integer usedStorage) {
        this.usedStorage = usedStorage;
    }

    public Integer getRemainingStorage() {
        return this.remainingStorage;
    }
    
    public void setRemainingStorage(Integer remainingStorage) {
        this.remainingStorage = remainingStorage;
    }

    public Double getUsageRate() {
        return this.usageRate;
    }
    
    public void setUsageRate(Double usageRate) {
        this.usageRate = usageRate;
    }

    public StorageTypeDistributionVO getTypeDistribution() {
        return this.typeDistribution;
    }
    
    public void setTypeDistribution(StorageTypeDistributionVO typeDistribution) {
        this.typeDistribution = typeDistribution;
    }

    public StorageTrendVO getTrend() {
        return this.trend;
    }
    
    public void setTrend(StorageTrendVO trend) {
        this.trend = trend;
    }
}
