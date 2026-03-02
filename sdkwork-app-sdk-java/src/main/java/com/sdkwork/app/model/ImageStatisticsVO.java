package com.sdkwork.app.model;

public class ImageStatisticsVO {
    private String createdAt;
    private String updatedAt;
    private Integer totalImages;
    private Integer completedImages;
    private Integer processingImages;

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

    public Integer getTotalImages() {
        return this.totalImages;
    }
    
    public void setTotalImages(Integer totalImages) {
        this.totalImages = totalImages;
    }

    public Integer getCompletedImages() {
        return this.completedImages;
    }
    
    public void setCompletedImages(Integer completedImages) {
        this.completedImages = completedImages;
    }

    public Integer getProcessingImages() {
        return this.processingImages;
    }
    
    public void setProcessingImages(Integer processingImages) {
        this.processingImages = processingImages;
    }
}
