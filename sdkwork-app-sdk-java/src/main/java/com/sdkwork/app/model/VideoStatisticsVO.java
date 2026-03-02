package com.sdkwork.app.model;

public class VideoStatisticsVO {
    private String createdAt;
    private String updatedAt;
    private Integer totalVideos;
    private Integer completedVideos;
    private Integer processingVideos;

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

    public Integer getTotalVideos() {
        return this.totalVideos;
    }
    
    public void setTotalVideos(Integer totalVideos) {
        this.totalVideos = totalVideos;
    }

    public Integer getCompletedVideos() {
        return this.completedVideos;
    }
    
    public void setCompletedVideos(Integer completedVideos) {
        this.completedVideos = completedVideos;
    }

    public Integer getProcessingVideos() {
        return this.processingVideos;
    }
    
    public void setProcessingVideos(Integer processingVideos) {
        this.processingVideos = processingVideos;
    }
}
