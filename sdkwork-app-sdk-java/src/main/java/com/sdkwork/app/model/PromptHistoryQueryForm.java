package com.sdkwork.app.model;

public class PromptHistoryQueryForm {
    private Integer promptId;
    private String keyword;
    private String model;
    private Boolean success;
    private Integer page;
    private Integer size;
    private String sortBy;
    private String sortDirection;

    public Integer getPromptId() {
        return this.promptId;
    }
    
    public void setPromptId(Integer promptId) {
        this.promptId = promptId;
    }

    public String getKeyword() {
        return this.keyword;
    }
    
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getModel() {
        return this.model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }

    public Boolean getSuccess() {
        return this.success;
    }
    
    public void setSuccess(Boolean success) {
        this.success = success;
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
