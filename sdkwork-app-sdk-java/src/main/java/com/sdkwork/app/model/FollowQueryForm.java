package com.sdkwork.app.model;

public class FollowQueryForm {
    private Integer page;
    private Integer size;
    private String queryType;
    private String userId;
    private String keyword;

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

    public String getQueryType() {
        return this.queryType;
    }
    
    public void setQueryType(String queryType) {
        this.queryType = queryType;
    }

    public String getUserId() {
        return this.userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getKeyword() {
        return this.keyword;
    }
    
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
}
