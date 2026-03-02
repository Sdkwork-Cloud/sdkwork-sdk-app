package com.sdkwork.app.model;

public class CollectionItemAddForm {
    private String contentType;
    private Integer contentId;
    private String title;
    private String description;
    private Integer position;

    public String getContentType() {
        return this.contentType;
    }
    
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public Integer getContentId() {
        return this.contentId;
    }
    
    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPosition() {
        return this.position;
    }
    
    public void setPosition(Integer position) {
        this.position = position;
    }
}
