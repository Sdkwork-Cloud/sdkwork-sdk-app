package com.sdkwork.app.model;

public class MusicExtendForm {
    private String musicUrl;
    private Integer extendDuration;
    private String model;
    private String style;

    public String getMusicUrl() {
        return this.musicUrl;
    }
    
    public void setMusicUrl(String musicUrl) {
        this.musicUrl = musicUrl;
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
