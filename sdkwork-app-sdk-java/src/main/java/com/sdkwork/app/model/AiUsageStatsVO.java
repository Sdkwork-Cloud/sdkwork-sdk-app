package com.sdkwork.app.model;

public class AiUsageStatsVO {
    private String createdAt;
    private String updatedAt;
    private String statsId;
    private String modelName;
    private Integer promptTokens;
    private Integer completionTokens;
    private Integer totalTokens;
    private Integer requestCount;
    private Integer errorCount;
    private String date;
    private String userId;

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

    public String getStatsId() {
        return this.statsId;
    }
    
    public void setStatsId(String statsId) {
        this.statsId = statsId;
    }

    public String getModelName() {
        return this.modelName;
    }
    
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Integer getPromptTokens() {
        return this.promptTokens;
    }
    
    public void setPromptTokens(Integer promptTokens) {
        this.promptTokens = promptTokens;
    }

    public Integer getCompletionTokens() {
        return this.completionTokens;
    }
    
    public void setCompletionTokens(Integer completionTokens) {
        this.completionTokens = completionTokens;
    }

    public Integer getTotalTokens() {
        return this.totalTokens;
    }
    
    public void setTotalTokens(Integer totalTokens) {
        this.totalTokens = totalTokens;
    }

    public Integer getRequestCount() {
        return this.requestCount;
    }
    
    public void setRequestCount(Integer requestCount) {
        this.requestCount = requestCount;
    }

    public Integer getErrorCount() {
        return this.errorCount;
    }
    
    public void setErrorCount(Integer errorCount) {
        this.errorCount = errorCount;
    }

    public String getDate() {
        return this.date;
    }
    
    public void setDate(String date) {
        this.date = date;
    }

    public String getUserId() {
        return this.userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }
}
