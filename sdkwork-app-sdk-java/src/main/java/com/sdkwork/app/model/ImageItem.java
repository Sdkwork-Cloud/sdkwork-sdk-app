package com.sdkwork.app.model;

public class ImageItem {
    private String id;
    private String url;
    private String contentType;

    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return this.url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }

    public String getContentType() {
        return this.contentType;
    }
    
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }
}
