package com.sdkwork.app.model;

public class RealtimeAuditVO {
    private String createdAt;
    private String updatedAt;
    private String streamId;
    private String taskId;
    private String status;
    private Boolean videoEnabled;
    private Boolean audioEnabled;
    private String pushUrl;
    private String startTime;
    private String estimatedEndTime;

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

    public String getStreamId() {
        return this.streamId;
    }
    
    public void setStreamId(String streamId) {
        this.streamId = streamId;
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

    public Boolean getVideoEnabled() {
        return this.videoEnabled;
    }
    
    public void setVideoEnabled(Boolean videoEnabled) {
        this.videoEnabled = videoEnabled;
    }

    public Boolean getAudioEnabled() {
        return this.audioEnabled;
    }
    
    public void setAudioEnabled(Boolean audioEnabled) {
        this.audioEnabled = audioEnabled;
    }

    public String getPushUrl() {
        return this.pushUrl;
    }
    
    public void setPushUrl(String pushUrl) {
        this.pushUrl = pushUrl;
    }

    public String getStartTime() {
        return this.startTime;
    }
    
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEstimatedEndTime() {
        return this.estimatedEndTime;
    }
    
    public void setEstimatedEndTime(String estimatedEndTime) {
        this.estimatedEndTime = estimatedEndTime;
    }
}
