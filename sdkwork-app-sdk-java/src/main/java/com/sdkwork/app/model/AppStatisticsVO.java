package com.sdkwork.app.model;

public class AppStatisticsVO {
    private String createdAt;
    private String updatedAt;
    private Integer totalApps;

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

    public Integer getTotalApps() {
        return this.totalApps;
    }
    
    public void setTotalApps(Integer totalApps) {
        this.totalApps = totalApps;
    }
}
