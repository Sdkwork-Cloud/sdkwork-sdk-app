package com.sdkwork.app.model;

public class FavoriteCheckVO {
    private String createdAt;
    private String updatedAt;
    private String targetId;
    private Boolean isFavorite;
    private String favoriteId;
    private String favoriteTime;

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

    public String getTargetId() {
        return this.targetId;
    }
    
    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    public Boolean getIsFavorite() {
        return this.isFavorite;
    }
    
    public void setIsFavorite(Boolean isFavorite) {
        this.isFavorite = isFavorite;
    }

    public String getFavoriteId() {
        return this.favoriteId;
    }
    
    public void setFavoriteId(String favoriteId) {
        this.favoriteId = favoriteId;
    }

    public String getFavoriteTime() {
        return this.favoriteTime;
    }
    
    public void setFavoriteTime(String favoriteTime) {
        this.favoriteTime = favoriteTime;
    }
}
