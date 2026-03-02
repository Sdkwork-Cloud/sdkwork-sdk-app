package com.sdkwork.app.model;

public class AudioAuditForm {
    private String audioUrl;
    private String format;
    private String contentId;
    private Integer duration;
    private List<String> checkTypes;
    private Integer sampleRate;

    public String getAudioUrl() {
        return this.audioUrl;
    }
    
    public void setAudioUrl(String audioUrl) {
        this.audioUrl = audioUrl;
    }

    public String getFormat() {
        return this.format;
    }
    
    public void setFormat(String format) {
        this.format = format;
    }

    public String getContentId() {
        return this.contentId;
    }
    
    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public Integer getDuration() {
        return this.duration;
    }
    
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public List<String> getCheckTypes() {
        return this.checkTypes;
    }
    
    public void setCheckTypes(List<String> checkTypes) {
        this.checkTypes = checkTypes;
    }

    public Integer getSampleRate() {
        return this.sampleRate;
    }
    
    public void setSampleRate(Integer sampleRate) {
        this.sampleRate = sampleRate;
    }
}
