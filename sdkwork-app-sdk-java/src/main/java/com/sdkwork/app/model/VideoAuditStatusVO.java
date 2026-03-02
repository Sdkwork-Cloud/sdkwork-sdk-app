package com.sdkwork.app.model;

public class VideoAuditStatusVO {
    private String createdAt;
    private String updatedAt;
    private String taskId;
    private String status;
    private Integer progress;
    private Integer processedDuration;
    private Integer totalDuration;
    private List<FrameDetection> detections;
    private String estimatedCompleteTime;

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

    public Integer getProgress() {
        return this.progress;
    }
    
    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public Integer getProcessedDuration() {
        return this.processedDuration;
    }
    
    public void setProcessedDuration(Integer processedDuration) {
        this.processedDuration = processedDuration;
    }

    public Integer getTotalDuration() {
        return this.totalDuration;
    }
    
    public void setTotalDuration(Integer totalDuration) {
        this.totalDuration = totalDuration;
    }

    public List<FrameDetection> getDetections() {
        return this.detections;
    }
    
    public void setDetections(List<FrameDetection> detections) {
        this.detections = detections;
    }

    public String getEstimatedCompleteTime() {
        return this.estimatedCompleteTime;
    }
    
    public void setEstimatedCompleteTime(String estimatedCompleteTime) {
        this.estimatedCompleteTime = estimatedCompleteTime;
    }
}
