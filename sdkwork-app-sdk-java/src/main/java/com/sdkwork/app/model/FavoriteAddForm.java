package com.sdkwork.app.model;

public class FavoriteAddForm {
    private String favoriteType;
    private String type;
    private String targetId;
    private String favoriteName;
    private String favoriteDescription;
    private String folderId;
    private String tags;

    public String getFavoriteType() {
        return this.favoriteType;
    }
    
    public void setFavoriteType(String favoriteType) {
        this.favoriteType = favoriteType;
    }

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
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

    public String getTags() {
        return this.tags;
    }
    
    public void setTags(String tags) {
        this.tags = tags;
    }
}
