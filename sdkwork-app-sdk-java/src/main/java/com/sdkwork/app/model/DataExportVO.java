package com.sdkwork.app.model;

public class DataExportVO {
    private String createdAt;
    private String updatedAt;
    private String taskId;
    private String status;
    private String downloadUrl;
    private String fileSize;
    private String estimatedCompletionTime;
    private Integer progress;
    private String errorMessage;

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

    public String getTaskId() {
        return this.taskId;
    }
    
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getDownloadUrl() {
        return this.downloadUrl;
    }
    
    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public String getFileSize() {
        return this.fileSize;
    }
    
    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    public String getEstimatedCompletionTime() {
        return this.estimatedCompletionTime;
    }
    
    public void setEstimatedCompletionTime(String estimatedCompletionTime) {
        this.estimatedCompletionTime = estimatedCompletionTime;
    }

    public Integer getProgress() {
        return this.progress;
    }
    
    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }
    
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
