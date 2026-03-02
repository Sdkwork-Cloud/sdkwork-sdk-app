package com.sdkwork.app.model;

public class RetentionAnalysisVO {
    private String createdAt;
    private String updatedAt;
    private String retentionType;
    private Map<String, Double> retentionRates;
    private Double averageRetentionRate;
    private Integer totalUsers;
    private Map<String, Integer> cohortSizes;

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

    public String getRetentionType() {
        return this.retentionType;
    }
    
    public void setRetentionType(String retentionType) {
        this.retentionType = retentionType;
    }

    public Map<String, Double> getRetentionRates() {
        return this.retentionRates;
    }
    
    public void setRetentionRates(Map<String, Double> retentionRates) {
        this.retentionRates = retentionRates;
    }

    public Double getAverageRetentionRate() {
        return this.averageRetentionRate;
    }
    
    public void setAverageRetentionRate(Double averageRetentionRate) {
        this.averageRetentionRate = averageRetentionRate;
    }

    public Integer getTotalUsers() {
        return this.totalUsers;
    }
    
    public void setTotalUsers(Integer totalUsers) {
        this.totalUsers = totalUsers;
    }

    public Map<String, Integer> getCohortSizes() {
        return this.cohortSizes;
    }
    
    public void setCohortSizes(Map<String, Integer> cohortSizes) {
        this.cohortSizes = cohortSizes;
    }
}
