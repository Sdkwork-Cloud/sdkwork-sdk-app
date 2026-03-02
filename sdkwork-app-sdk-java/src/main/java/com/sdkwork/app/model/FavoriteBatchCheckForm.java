package com.sdkwork.app.model;

public class FavoriteBatchCheckForm {
    private String favoriteType;
    private List<String> targetIds;
    private List<CheckItem> items;

    public String getFavoriteType() {
        return this.favoriteType;
    }
    
    public void setFavoriteType(String favoriteType) {
        this.favoriteType = favoriteType;
    }

    public List<String> getTargetIds() {
        return this.targetIds;
    }
    
    public void setTargetIds(List<String> targetIds) {
        this.targetIds = targetIds;
    }

    public List<CheckItem> getItems() {
        return this.items;
    }
    
    public void setItems(List<CheckItem> items) {
        this.items = items;
    }
}
