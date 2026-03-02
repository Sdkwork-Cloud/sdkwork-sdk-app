package com.sdkwork.app.model;

public class FunnelAnalysisVO {
    private String createdAt;
    private String updatedAt;
    private String funnelName;
    private List<FunnelStepVO> steps;
    private Double overallConversionRate;
    private Integer totalUsers;
    private Integer convertedUsers;

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

    public String getFunnelName() {
        return this.funnelName;
    }
    
    public void setFunnelName(String funnelName) {
        this.funnelName = funnelName;
    }

    public List<FunnelStepVO> getSteps() {
        return this.steps;
    }
    
    public void setSteps(List<FunnelStepVO> steps) {
        this.steps = steps;
    }

    public Double getOverallConversionRate() {
        return this.overallConversionRate;
    }
    
    public void setOverallConversionRate(Double overallConversionRate) {
        this.overallConversionRate = overallConversionRate;
    }

    public Integer getTotalUsers() {
        return this.totalUsers;
    }
    
    public void setTotalUsers(Integer totalUsers) {
        this.totalUsers = totalUsers;
    }

    public Integer getConvertedUsers() {
        return this.convertedUsers;
    }
    
    public void setConvertedUsers(Integer convertedUsers) {
        this.convertedUsers = convertedUsers;
    }
}
