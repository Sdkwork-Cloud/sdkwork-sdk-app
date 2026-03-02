package com.sdkwork.app.model;

public class StyleStatisticsVO {
    private String createdAt;
    private String updatedAt;
    private Integer totalStyles;
    private Integer activeStyles;
    private Integer imageStyles;
    private Integer videoStyles;
    private Integer musicStyles;

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

    public Integer getTotalStyles() {
        return this.totalStyles;
    }
    
    public void setTotalStyles(Integer totalStyles) {
        this.totalStyles = totalStyles;
    }

    public Integer getActiveStyles() {
        return this.activeStyles;
    }
    
    public void setActiveStyles(Integer activeStyles) {
        this.activeStyles = activeStyles;
    }

    public Integer getImageStyles() {
        return this.imageStyles;
    }
    
    public void setImageStyles(Integer imageStyles) {
        this.imageStyles = imageStyles;
    }

    public Integer getVideoStyles() {
        return this.videoStyles;
    }
    
    public void setVideoStyles(Integer videoStyles) {
        this.videoStyles = videoStyles;
    }

    public Integer getMusicStyles() {
        return this.musicStyles;
    }
    
    public void setMusicStyles(Integer musicStyles) {
        this.musicStyles = musicStyles;
    }
}
