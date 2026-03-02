package com.sdkwork.app.model;

public class CollectionItemVO {
    private String createdAt;
    private String updatedAt;
    private String itemId;
    private String collectionId;
    private String contentType;
    private Integer contentId;
    private String title;
    private String description;
    private String coverImage;
    private Integer position;
    private Boolean isPinned;
    private String tags;
    private String addedAt;

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

    public String getItemId() {
        return this.itemId;
    }
    
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getCollectionId() {
        return this.collectionId;
    }
    
    public void setCollectionId(String collectionId) {
        this.collectionId = collectionId;
    }

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

    public String getCoverImage() {
        return this.coverImage;
    }
    
    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }

    public Integer getPosition() {
        return this.position;
    }
    
    public void setPosition(Integer position) {
        this.position = position;
    }

    public Boolean getIsPinned() {
        return this.isPinned;
    }
    
    public void setIsPinned(Boolean isPinned) {
        this.isPinned = isPinned;
    }

    public String getTags() {
        return this.tags;
    }
    
    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getAddedAt() {
        return this.addedAt;
    }
    
    public void setAddedAt(String addedAt) {
        this.addedAt = addedAt;
    }
}
