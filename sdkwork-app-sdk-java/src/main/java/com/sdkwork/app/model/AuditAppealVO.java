package com.sdkwork.app.model;

public class AuditAppealVO {
    private String createdAt;
    private String updatedAt;
    private String appealId;
    private String recordId;
    private String reason;
    private String description;
    private String evidenceUrl;
    private String status;
    private String result;
    private String comment;
    private String submitTime;
    private String processTime;

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

    public String getAppealId() {
        return this.appealId;
    }
    
    public void setAppealId(String appealId) {
        this.appealId = appealId;
    }

    public String getRecordId() {
        return this.recordId;
    }
    
    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public String getReason() {
        return this.reason;
    }
    
    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public String getEvidenceUrl() {
        return this.evidenceUrl;
    }
    
    public void setEvidenceUrl(String evidenceUrl) {
        this.evidenceUrl = evidenceUrl;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getResult() {
        return this.result;
    }
    
    public void setResult(String result) {
        this.result = result;
    }

    public String getComment() {
        return this.comment;
    }
    
    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getSubmitTime() {
        return this.submitTime;
    }
    
    public void setSubmitTime(String submitTime) {
        this.submitTime = submitTime;
    }

    public String getProcessTime() {
        return this.processTime;
    }
    
    public void setProcessTime(String processTime) {
        this.processTime = processTime;
    }
}
