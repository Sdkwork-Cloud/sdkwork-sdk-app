package com.sdkwork.app.model;

public class DocumentListQueryRequest {
    private String keyword;
    private String folderId;
    private String diskId;
    private Boolean includeArchived;
    private Boolean includeDeleted;
    private Boolean favoriteOnly;
    private String sortField;
    private String sortOrder;
    private Integer pageNum;
    private Integer pageSize;

    public String getKeyword() {
        return this.keyword;
    }
    
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getFolderId() {
        return this.folderId;
    }
    
    public void setFolderId(String folderId) {
        this.folderId = folderId;
    }

    public String getDiskId() {
        return this.diskId;
    }
    
    public void setDiskId(String diskId) {
        this.diskId = diskId;
    }

    public Boolean getIncludeArchived() {
        return this.includeArchived;
    }
    
    public void setIncludeArchived(Boolean includeArchived) {
        this.includeArchived = includeArchived;
    }

    public Boolean getIncludeDeleted() {
        return this.includeDeleted;
    }
    
    public void setIncludeDeleted(Boolean includeDeleted) {
        this.includeDeleted = includeDeleted;
    }

    public Boolean getFavoriteOnly() {
        return this.favoriteOnly;
    }
    
    public void setFavoriteOnly(Boolean favoriteOnly) {
        this.favoriteOnly = favoriteOnly;
    }

    public String getSortField() {
        return this.sortField;
    }
    
    public void setSortField(String sortField) {
        this.sortField = sortField;
    }

    public String getSortOrder() {
        return this.sortOrder;
    }
    
    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    public Integer getPageNum() {
        return this.pageNum;
    }
    
    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }
    
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
