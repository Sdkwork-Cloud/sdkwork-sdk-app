package com.sdkwork.app.model;

public class OperationHistoryQueryForm {
    private String action;
    private String result;
    private Integer page;
    private Integer size;
    private String sortField;
    private String sortOrder;

    public String getAction() {
        return this.action;
    }
    
    public void setAction(String action) {
        this.action = action;
    }

    public String getResult() {
        return this.result;
    }
    
    public void setResult(String result) {
        this.result = result;
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
}
