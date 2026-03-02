package com.sdkwork.app.model;

public class DocumentVO {
    private String createdAt;
    private String updatedAt;
    private String documentId;
    private String documentUuid;
    private String title;
    private String folderId;
    private String assetType;
    private String mimeType;
    private String description;
    private List<String> tags;
    private String status;
    private String summary;
    private Integer wordCount;
    private Integer charCount;

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

    public String getDocumentId() {
        return this.documentId;
    }
    
    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public String getDocumentUuid() {
        return this.documentUuid;
    }
    
    public void setDocumentUuid(String documentUuid) {
        this.documentUuid = documentUuid;
    }

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getFolderId() {
        return this.folderId;
    }
    
    public void setFolderId(String folderId) {
        this.folderId = folderId;
    }

    public String getAssetType() {
        return this.assetType;
    }
    
    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    public String getMimeType() {
        return this.mimeType;
    }
    
    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getTags() {
        return this.tags;
    }
    
    public void setTags(List<String> tags) {
        this.tags = tags;
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

    public Integer getWordCount() {
        return this.wordCount;
    }
    
    public void setWordCount(Integer wordCount) {
        this.wordCount = wordCount;
    }

    public Integer getCharCount() {
        return this.charCount;
    }
    
    public void setCharCount(Integer charCount) {
        this.charCount = charCount;
    }
}
