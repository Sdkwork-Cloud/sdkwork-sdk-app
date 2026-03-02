package com.sdkwork.app.model;

public class NoteStatisticsVO {
    private String createdAt;
    private String updatedAt;
    private Integer totalNotes;
    private Integer totalFolders;
    private Integer favoritedNotes;
    private Integer thisMonthNotes;
    private Integer thisWeekNotes;
    private Integer todayNotes;
    private Integer totalWords;
    private String lastUpdateTime;
    private Map<String, Integer> folderNoteCounts;
    private Map<String, Integer> tagUsageCounts;

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

    public Integer getTotalNotes() {
        return this.totalNotes;
    }
    
    public void setTotalNotes(Integer totalNotes) {
        this.totalNotes = totalNotes;
    }

    public Integer getTotalFolders() {
        return this.totalFolders;
    }
    
    public void setTotalFolders(Integer totalFolders) {
        this.totalFolders = totalFolders;
    }

    public Integer getFavoritedNotes() {
        return this.favoritedNotes;
    }
    
    public void setFavoritedNotes(Integer favoritedNotes) {
        this.favoritedNotes = favoritedNotes;
    }

    public Integer getThisMonthNotes() {
        return this.thisMonthNotes;
    }
    
    public void setThisMonthNotes(Integer thisMonthNotes) {
        this.thisMonthNotes = thisMonthNotes;
    }

    public Integer getThisWeekNotes() {
        return this.thisWeekNotes;
    }
    
    public void setThisWeekNotes(Integer thisWeekNotes) {
        this.thisWeekNotes = thisWeekNotes;
    }

    public Integer getTodayNotes() {
        return this.todayNotes;
    }
    
    public void setTodayNotes(Integer todayNotes) {
        this.todayNotes = todayNotes;
    }

    public Integer getTotalWords() {
        return this.totalWords;
    }
    
    public void setTotalWords(Integer totalWords) {
        this.totalWords = totalWords;
    }

    public String getLastUpdateTime() {
        return this.lastUpdateTime;
    }
    
    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public Map<String, Integer> getFolderNoteCounts() {
        return this.folderNoteCounts;
    }
    
    public void setFolderNoteCounts(Map<String, Integer> folderNoteCounts) {
        this.folderNoteCounts = folderNoteCounts;
    }

    public Map<String, Integer> getTagUsageCounts() {
        return this.tagUsageCounts;
    }
    
    public void setTagUsageCounts(Map<String, Integer> tagUsageCounts) {
        this.tagUsageCounts = tagUsageCounts;
    }
}
