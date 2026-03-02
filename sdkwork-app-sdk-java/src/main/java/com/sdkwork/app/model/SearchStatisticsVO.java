package com.sdkwork.app.model;

public class SearchStatisticsVO {
    private String createdAt;
    private String updatedAt;
    private Integer totalSearches;
    private Integer todaySearches;
    private Integer thisWeekSearches;
    private Integer thisMonthSearches;
    private Map<String, Integer> hotKeywords;
    private Map<String, Integer> typeDistribution;
    private String lastSearchTime;

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

    public Integer getTotalSearches() {
        return this.totalSearches;
    }
    
    public void setTotalSearches(Integer totalSearches) {
        this.totalSearches = totalSearches;
    }

    public Integer getTodaySearches() {
        return this.todaySearches;
    }
    
    public void setTodaySearches(Integer todaySearches) {
        this.todaySearches = todaySearches;
    }

    public Integer getThisWeekSearches() {
        return this.thisWeekSearches;
    }
    
    public void setThisWeekSearches(Integer thisWeekSearches) {
        this.thisWeekSearches = thisWeekSearches;
    }

    public Integer getThisMonthSearches() {
        return this.thisMonthSearches;
    }
    
    public void setThisMonthSearches(Integer thisMonthSearches) {
        this.thisMonthSearches = thisMonthSearches;
    }

    public Map<String, Integer> getHotKeywords() {
        return this.hotKeywords;
    }
    
    public void setHotKeywords(Map<String, Integer> hotKeywords) {
        this.hotKeywords = hotKeywords;
    }

    public Map<String, Integer> getTypeDistribution() {
        return this.typeDistribution;
    }
    
    public void setTypeDistribution(Map<String, Integer> typeDistribution) {
        this.typeDistribution = typeDistribution;
    }

    public String getLastSearchTime() {
        return this.lastSearchTime;
    }
    
    public void setLastSearchTime(String lastSearchTime) {
        this.lastSearchTime = lastSearchTime;
    }
}
