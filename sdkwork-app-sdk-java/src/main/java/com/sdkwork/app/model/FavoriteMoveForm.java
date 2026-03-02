package com.sdkwork.app.model;

public class FavoriteMoveForm {
    private String favoriteId;
    private String targetFolderId;
    private String folderId;

    public String getFavoriteId() {
        return this.favoriteId;
    }
    
    public void setFavoriteId(String favoriteId) {
        this.favoriteId = favoriteId;
    }

    public String getTargetFolderId() {
        return this.targetFolderId;
    }
    
    public void setTargetFolderId(String targetFolderId) {
        this.targetFolderId = targetFolderId;
    }

    public String getFolderId() {
        return this.folderId;
    }
    
    public void setFolderId(String folderId) {
        this.folderId = folderId;
    }
}
