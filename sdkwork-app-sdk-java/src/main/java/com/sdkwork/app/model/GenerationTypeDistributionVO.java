package com.sdkwork.app.model;

public class GenerationTypeDistributionVO {
    private Double text;
    private Double image;
    private Double audio;
    private Double video;
    private Double code;

    public Double getText() {
        return this.text;
    }
    
    public void setText(Double text) {
        this.text = text;
    }

    public Double getImage() {
        return this.image;
    }
    
    public void setImage(Double image) {
        this.image = image;
    }

    public Double getAudio() {
        return this.audio;
    }
    
    public void setAudio(Double audio) {
        this.audio = audio;
    }

    public Double getVideo() {
        return this.video;
    }
    
    public void setVideo(Double video) {
        this.video = video;
    }

    public Double getCode() {
        return this.code;
    }
    
    public void setCode(Double code) {
        this.code = code;
    }
}
