package com.sdkwork.app.model;

public class SoundEffectGenerationVO {
    private String createdAt;
    private String updatedAt;
    private String taskId;
    private String soundEffectId;
    private String name;
    private String description;
    private String audioUrl;
    private String waveformUrl;
    private String category;
    private Integer duration;
    private String status;
    private String completedAt;

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

    public String getSoundEffectId() {
        return this.soundEffectId;
    }
    
    public void setSoundEffectId(String soundEffectId) {
        this.soundEffectId = soundEffectId;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public String getAudioUrl() {
        return this.audioUrl;
    }
    
    public void setAudioUrl(String audioUrl) {
        this.audioUrl = audioUrl;
    }

    public String getWaveformUrl() {
        return this.waveformUrl;
    }
    
    public void setWaveformUrl(String waveformUrl) {
        this.waveformUrl = waveformUrl;
    }

    public String getCategory() {
        return this.category;
    }
    
    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getDuration() {
        return this.duration;
    }
    
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getCompletedAt() {
        return this.completedAt;
    }
    
    public void setCompletedAt(String completedAt) {
        this.completedAt = completedAt;
    }
}
