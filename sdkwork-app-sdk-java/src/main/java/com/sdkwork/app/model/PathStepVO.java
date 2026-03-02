package com.sdkwork.app.model;

public class PathStepVO {
    private String createdAt;
    private String updatedAt;
    private String pageUrl;
    private String pageTitle;
    private Integer userCount;
    private Double percentage;
    private List<PathStepVO> nextSteps;

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

    public String getPageUrl() {
        return this.pageUrl;
    }
    
    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
    }

    public String getPageTitle() {
        return this.pageTitle;
    }
    
    public void setPageTitle(String pageTitle) {
        this.pageTitle = pageTitle;
    }

    public Integer getUserCount() {
        return this.userCount;
    }
    
    public void setUserCount(Integer userCount) {
        this.userCount = userCount;
    }

    public Double getPercentage() {
        return this.percentage;
    }
    
    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    public List<PathStepVO> getNextSteps() {
        return this.nextSteps;
    }
    
    public void setNextSteps(List<PathStepVO> nextSteps) {
        this.nextSteps = nextSteps;
    }
}
