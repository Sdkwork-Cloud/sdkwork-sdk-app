package com.sdkwork.app.model;

public class DocumentOperationVO {
    private String createdAt;
    private String updatedAt;
    private Boolean success;
    private String operationType;
    private String message;
    private String documentId;
    private String documentUuid;
    private String title;
    private String operationTime;

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

    public String getOperationType() {
        return this.operationType;
    }
    
    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public String getMessage() {
        return this.message;
    }
    
    public void setMessage(String message) {
        this.message = message;
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

    public String getOperationTime() {
        return this.operationTime;
    }
    
    public void setOperationTime(String operationTime) {
        this.operationTime = operationTime;
    }
}
