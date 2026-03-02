package com.sdkwork.app.model;

public class FeedListQueryForm {
    private Integer pageNum;
    private Integer pageSize;
    private String sortField;
    private String sortDirection;
    private String type;
    private String contentType;
    private String keyword;
    private Integer authorId;
    private Integer size;
    private Integer page;

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

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public String getContentType() {
        return this.contentType;
    }
    
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getKeyword() {
        return this.keyword;
    }
    
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Integer getAuthorId() {
        return this.authorId;
    }
    
    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public Integer getSize() {
        return this.size;
    }
    
    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getPage() {
        return this.page;
    }
    
    public void setPage(Integer page) {
        this.page = page;
    }
}
