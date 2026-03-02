package com.sdkwork.app.model;

public class GenerationStatisticsVO {
    private String createdAt;
    private String updatedAt;
    private Integer todayCount;
    private Integer weekCount;
    private Integer monthCount;
    private Integer totalCount;
    private Integer avgGenerationTime;
    private Integer maxGenerationTime;
    private Integer minGenerationTime;
    private Double successRate;
    private String mostUsedModel;
    private GenerationTypeDistributionVO typeDistribution;

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

    public Integer getTodayCount() {
        return this.todayCount;
    }
    
    public void setTodayCount(Integer todayCount) {
        this.todayCount = todayCount;
    }

    public Integer getWeekCount() {
        return this.weekCount;
    }
    
    public void setWeekCount(Integer weekCount) {
        this.weekCount = weekCount;
    }

    public Integer getMonthCount() {
        return this.monthCount;
    }
    
    public void setMonthCount(Integer monthCount) {
        this.monthCount = monthCount;
    }

    public Integer getTotalCount() {
        return this.totalCount;
    }
    
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getAvgGenerationTime() {
        return this.avgGenerationTime;
    }
    
    public void setAvgGenerationTime(Integer avgGenerationTime) {
        this.avgGenerationTime = avgGenerationTime;
    }

    public Integer getMaxGenerationTime() {
        return this.maxGenerationTime;
    }
    
    public void setMaxGenerationTime(Integer maxGenerationTime) {
        this.maxGenerationTime = maxGenerationTime;
    }

    public Integer getMinGenerationTime() {
        return this.minGenerationTime;
    }
    
    public void setMinGenerationTime(Integer minGenerationTime) {
        this.minGenerationTime = minGenerationTime;
    }

    public Double getSuccessRate() {
        return this.successRate;
    }
    
    public void setSuccessRate(Double successRate) {
        this.successRate = successRate;
    }

    public String getMostUsedModel() {
        return this.mostUsedModel;
    }
    
    public void setMostUsedModel(String mostUsedModel) {
        this.mostUsedModel = mostUsedModel;
    }

    public GenerationTypeDistributionVO getTypeDistribution() {
        return this.typeDistribution;
    }
    
    public void setTypeDistribution(GenerationTypeDistributionVO typeDistribution) {
        this.typeDistribution = typeDistribution;
    }
}
