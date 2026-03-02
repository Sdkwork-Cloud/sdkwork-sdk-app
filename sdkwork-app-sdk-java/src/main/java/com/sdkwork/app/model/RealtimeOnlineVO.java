package com.sdkwork.app.model;

public class RealtimeOnlineVO {
    private String createdAt;
    private String updatedAt;
    private Integer currentOnline;
    private Integer peakOnline;
    private Integer averageOnline;
    private Integer newUsers;
    private Integer activeUsers;
    private String timestamp;

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

    public Integer getCurrentOnline() {
        return this.currentOnline;
    }
    
    public void setCurrentOnline(Integer currentOnline) {
        this.currentOnline = currentOnline;
    }

    public Integer getPeakOnline() {
        return this.peakOnline;
    }
    
    public void setPeakOnline(Integer peakOnline) {
        this.peakOnline = peakOnline;
    }

    public Integer getAverageOnline() {
        return this.averageOnline;
    }
    
    public void setAverageOnline(Integer averageOnline) {
        this.averageOnline = averageOnline;
    }

    public Integer getNewUsers() {
        return this.newUsers;
    }
    
    public void setNewUsers(Integer newUsers) {
        this.newUsers = newUsers;
    }

    public Integer getActiveUsers() {
        return this.activeUsers;
    }
    
    public void setActiveUsers(Integer activeUsers) {
        this.activeUsers = activeUsers;
    }

    public String getTimestamp() {
        return this.timestamp;
    }
    
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
