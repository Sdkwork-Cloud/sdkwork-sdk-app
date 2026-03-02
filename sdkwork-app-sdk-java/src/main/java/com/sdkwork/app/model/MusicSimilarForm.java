package com.sdkwork.app.model;

public class MusicSimilarForm {
    private String referenceUrl;
    private Integer duration;
    private String model;

    public String getReferenceUrl() {
        return this.referenceUrl;
    }
    
    public void setReferenceUrl(String referenceUrl) {
        this.referenceUrl = referenceUrl;
    }

    public Integer getDuration() {
        return this.duration;
    }
    
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getModel() {
        return this.model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
}
