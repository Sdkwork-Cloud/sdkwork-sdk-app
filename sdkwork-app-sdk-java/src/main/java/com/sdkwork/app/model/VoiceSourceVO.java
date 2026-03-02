package com.sdkwork.app.model;

public class VoiceSourceVO {
    private String id;
    private String name;
    private String type;
    private String language;
    private Integer sampleRate;

    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public String getLanguage() {
        return this.language;
    }
    
    public void setLanguage(String language) {
        this.language = language;
    }

    public Integer getSampleRate() {
        return this.sampleRate;
    }
    
    public void setSampleRate(Integer sampleRate) {
        this.sampleRate = sampleRate;
    }
}
