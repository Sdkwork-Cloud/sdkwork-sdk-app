package com.sdkwork.app.model;

public class NotificationQueryForm {
    private String type;
    private Boolean read;
    private Integer page;
    private Integer size;
    private String sortBy;
    private String sortDirection;

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public Boolean getRead() {
        return this.read;
    }
    
    public void setRead(Boolean read) {
        this.read = read;
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

    public String getSortBy() {
        return this.sortBy;
    }
    
    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    public String getSortDirection() {
        return this.sortDirection;
    }
    
    public void setSortDirection(String sortDirection) {
        this.sortDirection = sortDirection;
    }
}
