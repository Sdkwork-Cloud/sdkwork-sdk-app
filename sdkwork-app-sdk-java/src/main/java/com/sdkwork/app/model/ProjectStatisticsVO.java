package com.sdkwork.app.model;

public class ProjectStatisticsVO {
    private String createdAt;
    private String updatedAt;
    private String projectId;
    private Integer totalFiles;
    private Integer totalMembers;
    private Integer totalConversations;
    private Integer documentCount;
    private Integer tagCount;
    private String lastActivityTime;
    private Map<String, Integer> activityStats;
    private Map<String, Integer> documentTypeStats;

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

    public String getProjectId() {
        return this.projectId;
    }
    
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public Integer getTotalFiles() {
        return this.totalFiles;
    }
    
    public void setTotalFiles(Integer totalFiles) {
        this.totalFiles = totalFiles;
    }

    public Integer getTotalMembers() {
        return this.totalMembers;
    }
    
    public void setTotalMembers(Integer totalMembers) {
        this.totalMembers = totalMembers;
    }

    public Integer getTotalConversations() {
        return this.totalConversations;
    }
    
    public void setTotalConversations(Integer totalConversations) {
        this.totalConversations = totalConversations;
    }

    public Integer getDocumentCount() {
        return this.documentCount;
    }
    
    public void setDocumentCount(Integer documentCount) {
        this.documentCount = documentCount;
    }

    public Integer getTagCount() {
        return this.tagCount;
    }
    
    public void setTagCount(Integer tagCount) {
        this.tagCount = tagCount;
    }

    public String getLastActivityTime() {
        return this.lastActivityTime;
    }
    
    public void setLastActivityTime(String lastActivityTime) {
        this.lastActivityTime = lastActivityTime;
    }

    public Map<String, Integer> getActivityStats() {
        return this.activityStats;
    }
    
    public void setActivityStats(Map<String, Integer> activityStats) {
        this.activityStats = activityStats;
    }

    public Map<String, Integer> getDocumentTypeStats() {
        return this.documentTypeStats;
    }
    
    public void setDocumentTypeStats(Map<String, Integer> documentTypeStats) {
        this.documentTypeStats = documentTypeStats;
    }
}
