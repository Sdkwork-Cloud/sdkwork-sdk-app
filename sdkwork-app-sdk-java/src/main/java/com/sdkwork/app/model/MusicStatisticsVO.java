package com.sdkwork.app.model;

public class MusicStatisticsVO {
    private String createdAt;
    private String updatedAt;
    private Integer totalMusic;
    private Integer completedMusic;
    private Integer processingMusic;

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

    public Integer getTotalMusic() {
        return this.totalMusic;
    }
    
    public void setTotalMusic(Integer totalMusic) {
        this.totalMusic = totalMusic;
    }

    public Integer getCompletedMusic() {
        return this.completedMusic;
    }
    
    public void setCompletedMusic(Integer completedMusic) {
        this.completedMusic = completedMusic;
    }

    public Integer getProcessingMusic() {
        return this.processingMusic;
    }
    
    public void setProcessingMusic(Integer processingMusic) {
        this.processingMusic = processingMusic;
    }
}
