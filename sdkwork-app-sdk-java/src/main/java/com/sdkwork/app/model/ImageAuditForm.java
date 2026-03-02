package com.sdkwork.app.model;

public class ImageAuditForm {
    private String imageUrl;
    private String imageBase64;
    private String contentId;
    private String contentType;
    private List<String> checkTypes;
    private String scene;
    private Boolean async;

    public String getImageUrl() {
        return this.imageUrl;
    }
    
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageBase64() {
        return this.imageBase64;
    }
    
    public void setImageBase64(String imageBase64) {
        this.imageBase64 = imageBase64;
    }

    public String getContentId() {
        return this.contentId;
    }
    
    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public String getContentType() {
        return this.contentType;
    }
    
    public void setContentType(String contentType) {
        this.contentType = contentType;
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

    public Boolean getAsync() {
        return this.async;
    }
    
    public void setAsync(Boolean async) {
        this.async = async;
    }
}
