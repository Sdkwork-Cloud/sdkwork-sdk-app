package com.sdkwork.app.model;

public class FileSystemNodeListForm {
    private String diskId;
    private String parentId;
    private String keyword;
    private String sortField;
    private String sortOrder;
    private Integer pageNum;
    private Integer pageSize;

    public String getDiskId() {
        return this.diskId;
    }
    
    public void setDiskId(String diskId) {
        this.diskId = diskId;
    }

    public String getParentId() {
        return this.parentId;
    }
    
    public void setParentId(String parentId) {
        this.parentId = parentId;
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
