package com.sdkwork.app.model;

public class PathAnalysisVO {
    private String createdAt;
    private String updatedAt;
    private String startPage;
    private String endPage;
    private List<PathStepVO> steps;
    private Integer totalUsers;
    private Double averageSteps;
    private Double conversionRate;

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

    public String getStartPage() {
        return this.startPage;
    }
    
    public void setStartPage(String startPage) {
        this.startPage = startPage;
    }

    public String getEndPage() {
        return this.endPage;
    }
    
    public void setEndPage(String endPage) {
        this.endPage = endPage;
    }

    public List<PathStepVO> getSteps() {
        return this.steps;
    }
    
    public void setSteps(List<PathStepVO> steps) {
        this.steps = steps;
    }

    public Integer getTotalUsers() {
        return this.totalUsers;
    }
    
    public void setTotalUsers(Integer totalUsers) {
        this.totalUsers = totalUsers;
    }

    public Double getAverageSteps() {
        return this.averageSteps;
    }
    
    public void setAverageSteps(Double averageSteps) {
        this.averageSteps = averageSteps;
    }

    public Double getConversionRate() {
        return this.conversionRate;
    }
    
    public void setConversionRate(Double conversionRate) {
        this.conversionRate = conversionRate;
    }
}
