package com.sdkwork.app.model;

public class ConversionPathVO {
    private String createdAt;
    private String updatedAt;
    private String pathId;
    private List<String> steps;
    private Integer conversionCount;
    private Double conversionRate;
    private Double averageTime;
    private String startPage;
    private String endPage;

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

    public String getPathId() {
        return this.pathId;
    }
    
    public void setPathId(String pathId) {
        this.pathId = pathId;
    }

    public List<String> getSteps() {
        return this.steps;
    }
    
    public void setSteps(List<String> steps) {
        this.steps = steps;
    }

    public Integer getConversionCount() {
        return this.conversionCount;
    }
    
    public void setConversionCount(Integer conversionCount) {
        this.conversionCount = conversionCount;
    }

    public Double getConversionRate() {
        return this.conversionRate;
    }
    
    public void setConversionRate(Double conversionRate) {
        this.conversionRate = conversionRate;
    }

    public Double getAverageTime() {
        return this.averageTime;
    }
    
    public void setAverageTime(Double averageTime) {
        this.averageTime = averageTime;
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
}
