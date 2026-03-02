package com.sdkwork.app.model;

public class ShareStatisticsVO {
    private String createdAt;
    private String updatedAt;
    private Integer totalShares;
    private Integer totalVisits;
    private Integer todayShares;
    private Integer todayVisits;
    private String successRate;

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

    public Integer getTotalShares() {
        return this.totalShares;
    }
    
    public void setTotalShares(Integer totalShares) {
        this.totalShares = totalShares;
    }

    public Integer getTotalVisits() {
        return this.totalVisits;
    }
    
    public void setTotalVisits(Integer totalVisits) {
        this.totalVisits = totalVisits;
    }

    public Integer getTodayShares() {
        return this.todayShares;
    }
    
    public void setTodayShares(Integer todayShares) {
        this.todayShares = todayShares;
    }

    public Integer getTodayVisits() {
        return this.todayVisits;
    }
    
    public void setTodayVisits(Integer todayVisits) {
        this.todayVisits = todayVisits;
    }

    public String getSuccessRate() {
        return this.successRate;
    }
    
    public void setSuccessRate(String successRate) {
        this.successRate = successRate;
    }
}
