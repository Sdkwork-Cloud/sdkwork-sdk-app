package com.sdkwork.app.model;

public class ChatSessionQueryForm {
    private Integer sessionId;
    private String name;
    private String type;
    private Integer page;
    private Integer size;
    private String sortBy;
    private String sortDirection;
    private Boolean includeMessageCount;

    public Integer getSessionId() {
        return this.sessionId;
    }
    
    public void setSessionId(Integer sessionId) {
        this.sessionId = sessionId;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
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

    public Boolean getIncludeMessageCount() {
        return this.includeMessageCount;
    }
    
    public void setIncludeMessageCount(Boolean includeMessageCount) {
        this.includeMessageCount = includeMessageCount;
    }
}
