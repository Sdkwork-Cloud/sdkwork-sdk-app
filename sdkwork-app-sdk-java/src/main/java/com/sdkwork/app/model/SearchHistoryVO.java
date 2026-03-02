package com.sdkwork.app.model;

public class SearchHistoryVO {
    private String createdAt;
    private String updatedAt;
    private String keyword;
    private String searchTime;
    private Integer count;

    public String getCreatedAt() {
        return this.createdAt;
    }
    
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return this.updatedAt;
    }
    
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getKeyword() {
        return this.keyword;
    }
    
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getSearchTime() {
        return this.searchTime;
    }
    
    public void setSearchTime(String searchTime) {
        this.searchTime = searchTime;
    }

    public Integer getCount() {
        return this.count;
    }
    
    public void setCount(Integer count) {
        this.count = count;
    }
}
