package com.sdkwork.app.model;

public class ContactStatsVO {
    private String createdAt;
    private String updatedAt;
    private Integer total;
    private Integer online;
    private Integer newToday;

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

    public Integer getTotal() {
        return this.total;
    }
    
    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getOnline() {
        return this.online;
    }
    
    public void setOnline(Integer online) {
        this.online = online;
    }

    public Integer getNewToday() {
        return this.newToday;
    }
    
    public void setNewToday(Integer newToday) {
        this.newToday = newToday;
    }
}
