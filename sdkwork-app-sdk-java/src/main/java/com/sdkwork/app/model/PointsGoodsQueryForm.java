package com.sdkwork.app.model;

public class PointsGoodsQueryForm {
    private Integer pageNum;
    private Integer pageSize;
    private String sortField;
    private String sortDirection;
    private String category;
    private Integer minPoints;
    private Integer maxPoints;
    private Boolean exchangeable;
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

    public String getCategory() {
        return this.category;
    }
    
    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getMinPoints() {
        return this.minPoints;
    }
    
    public void setMinPoints(Integer minPoints) {
        this.minPoints = minPoints;
    }

    public Integer getMaxPoints() {
        return this.maxPoints;
    }
    
    public void setMaxPoints(Integer maxPoints) {
        this.maxPoints = maxPoints;
    }

    public Boolean getExchangeable() {
        return this.exchangeable;
    }
    
    public void setExchangeable(Boolean exchangeable) {
        this.exchangeable = exchangeable;
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
