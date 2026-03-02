package com.sdkwork.app.model;

public class HistoryStatisticsVO {
    private String createdAt;
    private String updatedAt;
    private Integer browseCount;
    private Integer operationCount;
    private Integer generationCount;
    private Integer loginCount;
    private Integer activeSessionCount;
    private Integer todayOperationCount;
    private Integer weeklyOperationCount;
    private Integer monthlyOperationCount;
    private String mostFrequentAction;
    private String mostFrequentBrowseType;

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

    public Integer getBrowseCount() {
        return this.browseCount;
    }
    
    public void setBrowseCount(Integer browseCount) {
        this.browseCount = browseCount;
    }

    public Integer getOperationCount() {
        return this.operationCount;
    }
    
    public void setOperationCount(Integer operationCount) {
        this.operationCount = operationCount;
    }

    public Integer getGenerationCount() {
        return this.generationCount;
    }
    
    public void setGenerationCount(Integer generationCount) {
        this.generationCount = generationCount;
    }

    public Integer getLoginCount() {
        return this.loginCount;
    }
    
    public void setLoginCount(Integer loginCount) {
        this.loginCount = loginCount;
    }

    public Integer getActiveSessionCount() {
        return this.activeSessionCount;
    }
    
    public void setActiveSessionCount(Integer activeSessionCount) {
        this.activeSessionCount = activeSessionCount;
    }

    public Integer getTodayOperationCount() {
        return this.todayOperationCount;
    }
    
    public void setTodayOperationCount(Integer todayOperationCount) {
        this.todayOperationCount = todayOperationCount;
    }

    public Integer getWeeklyOperationCount() {
        return this.weeklyOperationCount;
    }
    
    public void setWeeklyOperationCount(Integer weeklyOperationCount) {
        this.weeklyOperationCount = weeklyOperationCount;
    }

    public Integer getMonthlyOperationCount() {
        return this.monthlyOperationCount;
    }
    
    public void setMonthlyOperationCount(Integer monthlyOperationCount) {
        this.monthlyOperationCount = monthlyOperationCount;
    }

    public String getMostFrequentAction() {
        return this.mostFrequentAction;
    }
    
    public void setMostFrequentAction(String mostFrequentAction) {
        this.mostFrequentAction = mostFrequentAction;
    }

    public String getMostFrequentBrowseType() {
        return this.mostFrequentBrowseType;
    }
    
    public void setMostFrequentBrowseType(String mostFrequentBrowseType) {
        this.mostFrequentBrowseType = mostFrequentBrowseType;
    }
}
