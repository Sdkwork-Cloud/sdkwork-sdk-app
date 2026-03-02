package com.sdkwork.app.model;

public class AssetStatisticsVO {
    private Integer totalAssets;
    private Integer imageCount;
    private Integer videoCount;
    private Integer audioCount;

    public Integer getTotalAssets() {
        return this.totalAssets;
    }
    
    public void setTotalAssets(Integer totalAssets) {
        this.totalAssets = totalAssets;
    }

    public Integer getImageCount() {
        return this.imageCount;
    }
    
    public void setImageCount(Integer imageCount) {
        this.imageCount = imageCount;
    }

    public Integer getVideoCount() {
        return this.videoCount;
    }
    
    public void setVideoCount(Integer videoCount) {
        this.videoCount = videoCount;
    }

    public Integer getAudioCount() {
        return this.audioCount;
    }
    
    public void setAudioCount(Integer audioCount) {
        this.audioCount = audioCount;
    }
}
