package com.sdkwork.app.model;

public class BatchImageAuditForm {
    private List<ImageItem> images;
    private List<String> checkTypes;
    private String scene;

    public List<ImageItem> getImages() {
        return this.images;
    }
    
    public void setImages(List<ImageItem> images) {
        this.images = images;
    }

    public List<String> getCheckTypes() {
        return this.checkTypes;
    }
    
    public void setCheckTypes(List<String> checkTypes) {
        this.checkTypes = checkTypes;
    }

    public String getScene() {
        return this.scene;
    }
    
    public void setScene(String scene) {
        this.scene = scene;
    }
}
