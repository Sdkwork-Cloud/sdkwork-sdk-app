package com.sdkwork.app.model;

public class AdvancedSearchRequest {
    private String keyword;
    private String type;
    private Map<String, Object> filters;
    private String sortField;
    private String sortDirection;
    private Integer page;
    private Integer size;

    public String getKeyword() {
        return this.keyword;
    }
    
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public Map<String, Object> getFilters() {
        return this.filters;
    }
    
    public void setFilters(Map<String, Object> filters) {
        this.filters = filters;
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
