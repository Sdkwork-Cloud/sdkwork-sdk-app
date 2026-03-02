package com.sdkwork.app.model;

public class SpeakerStatisticsVO {
    private Integer totalSpeakers;
    private Integer activeSpeakers;
    private Integer inactiveSpeakers;

    public Integer getTotalSpeakers() {
        return this.totalSpeakers;
    }
    
    public void setTotalSpeakers(Integer totalSpeakers) {
        this.totalSpeakers = totalSpeakers;
    }

    public Integer getActiveSpeakers() {
        return this.activeSpeakers;
    }
    
    public void setActiveSpeakers(Integer activeSpeakers) {
        this.activeSpeakers = activeSpeakers;
    }

    public Integer getInactiveSpeakers() {
        return this.inactiveSpeakers;
    }
    
    public void setInactiveSpeakers(Integer inactiveSpeakers) {
        this.inactiveSpeakers = inactiveSpeakers;
    }
}
