package com.sdkwork.app.model;

public class CollectionVO {
    private String createdAt;
    private String updatedAt;
    private String collectionId;
    private String name;
    private String description;
    private String type;
    private String coverImage;
    private Boolean isPublic;
    private Boolean isPinned;
    private Integer itemCount;
    private Integer viewCount;
    private Integer favoriteCount;
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

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public String getCoverImage() {
        return this.coverImage;
    }
    
    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }

    public Boolean getIsPublic() {
        return this.isPublic;
    }
    
    public void setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
    }

    public Boolean getIsPinned() {
        return this.isPinned;
    }
    
    public void setIsPinned(Boolean isPinned) {
        this.isPinned = isPinned;
    }

    public Integer getItemCount() {
        return this.itemCount;
    }
    
    public void setItemCount(Integer itemCount) {
        this.itemCount = itemCount;
    }

    public Integer getViewCount() {
        return this.viewCount;
    }
    
    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public Integer getFavoriteCount() {
        return this.favoriteCount;
    }
    
    public void setFavoriteCount(Integer favoriteCount) {
        this.favoriteCount = favoriteCount;
    }

    public Integer getParentId() {
        return this.parentId;
    }
    
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }
}
