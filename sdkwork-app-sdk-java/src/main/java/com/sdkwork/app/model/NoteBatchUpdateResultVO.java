package com.sdkwork.app.model;

public class NoteBatchUpdateResultVO {
    private String createdAt;
    private String updatedAt;
    private String noteId;
    private String noteUuid;
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

    public String getNoteId() {
        return this.noteId;
    }
    
    public void setNoteId(String noteId) {
        this.noteId = noteId;
    }

    public String getNoteUuid() {
        return this.noteUuid;
    }
    
    public void setNoteUuid(String noteUuid) {
        this.noteUuid = noteUuid;
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
