package com.sdkwork.app.model;

public class NoteOperationVO {
    private String createdAt;
    private String updatedAt;
    private Boolean success;
    private Integer noteId;
    private String uuid;
    private String title;
    private String operationType;
    private String operationTime;
    private String message;

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

    public Boolean getSuccess() {
        return this.success;
    }
    
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Integer getNoteId() {
        return this.noteId;
    }
    
    public void setNoteId(Integer noteId) {
        this.noteId = noteId;
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

    public String getOperationType() {
        return this.operationType;
    }
    
    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public String getOperationTime() {
        return this.operationTime;
    }
    
    public void setOperationTime(String operationTime) {
        this.operationTime = operationTime;
    }

    public String getMessage() {
        return this.message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
}
