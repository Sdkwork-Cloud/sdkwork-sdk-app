package com.sdkwork.app.model;

public class ModelStatisticsVO {
    private String createdAt;
    private String updatedAt;
    private Integer totalModels;
    private Integer activeModels;
    private Integer chatModels;
    private Integer imageModels;
    private Integer audioModels;

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

    public Integer getTotalModels() {
        return this.totalModels;
    }
    
    public void setTotalModels(Integer totalModels) {
        this.totalModels = totalModels;
    }

    public Integer getActiveModels() {
        return this.activeModels;
    }
    
    public void setActiveModels(Integer activeModels) {
        this.activeModels = activeModels;
    }

    public Integer getChatModels() {
        return this.chatModels;
    }
    
    public void setChatModels(Integer chatModels) {
        this.chatModels = chatModels;
    }

    public Integer getImageModels() {
        return this.imageModels;
    }
    
    public void setImageModels(Integer imageModels) {
        this.imageModels = imageModels;
    }

    public Integer getAudioModels() {
        return this.audioModels;
    }
    
    public void setAudioModels(Integer audioModels) {
        this.audioModels = audioModels;
    }
}
