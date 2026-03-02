package com.sdkwork.app.model;

public class DocumentBatchUpdateResultVO {
    private String createdAt;
    private String updatedAt;
    private String documentId;
    private String documentUuid;
    private String versionId;
    private Integer appliedCount;
    private Integer skippedCount;
    private Integer charCount;
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

    public String getVersionId() {
        return this.versionId;
    }
    
    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    public Integer getAppliedCount() {
        return this.appliedCount;
    }
    
    public void setAppliedCount(Integer appliedCount) {
        this.appliedCount = appliedCount;
    }

    public Integer getSkippedCount() {
        return this.skippedCount;
    }
    
    public void setSkippedCount(Integer skippedCount) {
        this.skippedCount = skippedCount;
    }

    public Integer getCharCount() {
        return this.charCount;
    }
    
    public void setCharCount(Integer charCount) {
        this.charCount = charCount;
    }

    public Integer getWordCount() {
        return this.wordCount;
    }
    
    public void setWordCount(Integer wordCount) {
        this.wordCount = wordCount;
    }
}
