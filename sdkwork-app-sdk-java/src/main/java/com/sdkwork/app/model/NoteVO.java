package com.sdkwork.app.model;

public class NoteVO {
    private String createdAt;
    private String updatedAt;
    private Integer id;
    private String uuid;
    private String title;
    private String content;
    private Integer userId;
    private String folderId;
    private String folderPath;
    private List<String> tags;
    private String accessScope;
    private Boolean hasPassword;
    private String coverImageUrl;
    private String status;
    private String summary;
    private Boolean favorited;
    private Integer wordCount;

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

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getUuid() {
        return this.uuid;
    }
    
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }

    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getFolderId() {
        return this.folderId;
    }
    
    public void setFolderId(String folderId) {
        this.folderId = folderId;
    }

    public String getFolderPath() {
        return this.folderPath;
    }
    
    public void setFolderPath(String folderPath) {
        this.folderPath = folderPath;
    }

    public List<String> getTags() {
        return this.tags;
    }
    
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getAccessScope() {
        return this.accessScope;
    }
    
    public void setAccessScope(String accessScope) {
        this.accessScope = accessScope;
    }

    public Boolean getHasPassword() {
        return this.hasPassword;
    }
    
    public void setHasPassword(Boolean hasPassword) {
        this.hasPassword = hasPassword;
    }

    public String getCoverImageUrl() {
        return this.coverImageUrl;
    }
    
    public void setCoverImageUrl(String coverImageUrl) {
        this.coverImageUrl = coverImageUrl;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getSummary() {
        return this.summary;
    }
    
    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Boolean getFavorited() {
        return this.favorited;
    }
    
    public void setFavorited(Boolean favorited) {
        this.favorited = favorited;
    }

    public Integer getWordCount() {
        return this.wordCount;
    }
    
    public void setWordCount(Integer wordCount) {
        this.wordCount = wordCount;
    }
}
