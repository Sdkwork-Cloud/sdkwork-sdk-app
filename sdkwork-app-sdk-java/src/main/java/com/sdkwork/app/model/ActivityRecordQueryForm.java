package com.sdkwork.app.model;

public class ActivityRecordQueryForm {
    private Integer pageNum;
    private Integer pageSize;
    private String sortField;
    private String sortDirection;
    private String activityId;
    private String recordType;
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

    public String getActivityId() {
        return this.activityId;
    }
    
    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public String getRecordType() {
        return this.recordType;
    }
    
    public void setRecordType(String recordType) {
        this.recordType = recordType;
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
