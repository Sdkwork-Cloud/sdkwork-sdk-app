package com.sdkwork.app.model;

public class FavoriteBatchMoveForm {
    private List<String> favoriteIds;
    private String targetFolderId;
    private String folderId;

    public List<String> getFavoriteIds() {
        return this.favoriteIds;
    }
    
    public void setFavoriteIds(List<String> favoriteIds) {
        this.favoriteIds = favoriteIds;
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
