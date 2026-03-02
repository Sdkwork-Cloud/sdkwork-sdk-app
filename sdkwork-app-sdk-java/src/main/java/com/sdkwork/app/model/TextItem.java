package com.sdkwork.app.model;

public class TextItem {
    private String id;
    private String content;
    private String contentType;

    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }

    public String getContentType() {
        return this.contentType;
    }
    
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }
}
