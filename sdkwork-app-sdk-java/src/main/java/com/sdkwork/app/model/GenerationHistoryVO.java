package com.sdkwork.app.model;

public class GenerationHistoryVO {
    private String createdAt;
    private String updatedAt;
    private String id;
    private String type;
    private String taskId;
    private String title;
    private String description;
    private String status;
    private Integer duration;
    private String resultUrl;
    private String resultPreview;
    private String startTime;
    private String endTime;
    private String modelName;
    private Integer tokenUsage;

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

    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public String getTaskId() {
        return this.taskId;
    }
    
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getDuration() {
        return this.duration;
    }
    
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getResultUrl() {
        return this.resultUrl;
    }
    
    public void setResultUrl(String resultUrl) {
        this.resultUrl = resultUrl;
    }

    public String getResultPreview() {
        return this.resultPreview;
    }
    
    public void setResultPreview(String resultPreview) {
        this.resultPreview = resultPreview;
    }

    public String getStartTime() {
        return this.startTime;
    }
    
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return this.endTime;
    }
    
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getModelName() {
        return this.modelName;
    }
    
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Integer getTokenUsage() {
        return this.tokenUsage;
    }
    
    public void setTokenUsage(Integer tokenUsage) {
        this.tokenUsage = tokenUsage;
    }
}
