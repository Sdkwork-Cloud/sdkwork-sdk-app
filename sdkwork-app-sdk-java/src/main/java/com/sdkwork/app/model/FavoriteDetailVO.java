package com.sdkwork.app.model;

public class FavoriteDetailVO {
    private String createdAt;
    private String updatedAt;
    private String favoriteId;
    private String favoriteType;
    private String targetId;
    private String favoriteName;
    private String favoriteDescription;
    private String folderId;
    private String folderName;
    private String tags;
    private String favoriteTime;
    private String updateTime;
    private Object targetInfo;

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

    public String getFavoriteId() {
        return this.favoriteId;
    }
    
    public void setFavoriteId(String favoriteId) {
        this.favoriteId = favoriteId;
    }

    public String getFavoriteType() {
        return this.favoriteType;
    }
    
    public void setFavoriteType(String favoriteType) {
        this.favoriteType = favoriteType;
    }

    public String getTargetId() {
        return this.targetId;
    }
    
    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    public String getFavoriteName() {
        return this.favoriteName;
    }
    
    public void setFavoriteName(String favoriteName) {
        this.favoriteName = favoriteName;
    }

    public String getFavoriteDescription() {
        return this.favoriteDescription;
    }
    
    public void setFavoriteDescription(String favoriteDescription) {
        this.favoriteDescription = favoriteDescription;
    }

    public String getFolderId() {
        return this.folderId;
    }
    
    public void setFolderId(String folderId) {
        this.folderId = folderId;
    }

    public String getFolderName() {
        return this.folderName;
    }
    
    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public String getTags() {
        return this.tags;
    }
    
    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getFavoriteTime() {
        return this.favoriteTime;
    }
    
    public void setFavoriteTime(String favoriteTime) {
        this.favoriteTime = favoriteTime;
    }

    public String getUpdateTime() {
        return this.updateTime;
    }
    
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public Object getTargetInfo() {
        return this.targetInfo;
    }
    
    public void setTargetInfo(Object targetInfo) {
        this.targetInfo = targetInfo;
    }
}
