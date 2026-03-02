package com.sdkwork.app.model;

public class DriveItemListForm {
    private String keyword;
    private String assetType;
    private String folderId;
    private String diskId;
    private String sortField;
    private String sortDirection;
    private Integer pageNum;
    private Integer pageSize;

    public String getKeyword() {
        return this.keyword;
    }
    
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getAssetType() {
        return this.assetType;
    }
    
    public void setAssetType(String assetType) {
        this.assetType = assetType;
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
