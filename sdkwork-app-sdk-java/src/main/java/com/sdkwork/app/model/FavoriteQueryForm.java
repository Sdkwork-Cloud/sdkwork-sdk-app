package com.sdkwork.app.model;

public class FavoriteQueryForm {
    private String favoriteType;
    private String type;
    private String folderId;
    private String keyword;
    private String sortField;
    private String sortDirection;
    private Integer page;
    private Integer size;

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

    public String getFolderId() {
        return this.folderId;
    }
    
    public void setFolderId(String folderId) {
        this.folderId = folderId;
    }

    public String getKeyword() {
        return this.keyword;
    }
    
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getSortField() {
        return this.sortField;
    }
    
    public void setSortField(String sortField) {
        this.sortField = sortField;
    }

    public String getSortDirection() {
        return this.sortDirection;
    }
    
    public void setSortDirection(String sortDirection) {
        this.sortDirection = sortDirection;
    }

    public Integer getPage() {
        return this.page;
    }
    
    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return this.size;
    }
    
    public void setSize(Integer size) {
        this.size = size;
    }
}
