package com.sdkwork.app.model;

public class VideoExtendForm {
    private String videoUrl;
    private Integer extendDuration;
    private String model;
    private String style;

    public String getVideoUrl() {
        return this.videoUrl;
    }
    
    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public Integer getExtendDuration() {
        return this.extendDuration;
    }
    
    public void setExtendDuration(Integer extendDuration) {
        this.extendDuration = extendDuration;
    }

    public String getModel() {
        return this.model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }

    public String getStyle() {
        return this.style;
    }
    
    public void setStyle(String style) {
        this.style = style;
    }
}
