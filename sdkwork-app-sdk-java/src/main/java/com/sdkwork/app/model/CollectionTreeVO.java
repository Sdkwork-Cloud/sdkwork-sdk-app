package com.sdkwork.app.model;

public class CollectionTreeVO {
    private String createdAt;
    private String updatedAt;
    private String collectionId;
    private String name;
    private String type;
    private Integer itemCount;
    private Integer parentId;

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

    public String getCollectionId() {
        return this.collectionId;
    }
    
    public void setCollectionId(String collectionId) {
        this.collectionId = collectionId;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public Integer getItemCount() {
        return this.itemCount;
    }
    
    public void setItemCount(Integer itemCount) {
        this.itemCount = itemCount;
    }

    public Integer getParentId() {
        return this.parentId;
    }
    
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }
}
