package com.sdkwork.app.model;

public class FavoriteStatisticsVO {
    private String createdAt;
    private String updatedAt;
    private Integer totalCount;
    private Integer folderCount;
    private Integer monthlyAdded;
    private String lastFavoritedTime;
    private Map<String, Integer> countByType;

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

    public Integer getTotalCount() {
        return this.totalCount;
    }
    
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getFolderCount() {
        return this.folderCount;
    }
    
    public void setFolderCount(Integer folderCount) {
        this.folderCount = folderCount;
    }

    public Integer getMonthlyAdded() {
        return this.monthlyAdded;
    }
    
    public void setMonthlyAdded(Integer monthlyAdded) {
        this.monthlyAdded = monthlyAdded;
    }

    public String getLastFavoritedTime() {
        return this.lastFavoritedTime;
    }
    
    public void setLastFavoritedTime(String lastFavoritedTime) {
        this.lastFavoritedTime = lastFavoritedTime;
    }

    public Map<String, Integer> getCountByType() {
        return this.countByType;
    }
    
    public void setCountByType(Map<String, Integer> countByType) {
        this.countByType = countByType;
    }
}
