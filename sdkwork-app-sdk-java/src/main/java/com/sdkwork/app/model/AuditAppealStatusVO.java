package com.sdkwork.app.model;

public class AuditAppealStatusVO {
    private String createdAt;
    private String updatedAt;
    private String appealId;
    private String recordId;
    private String currentStatus;
    private String statusDescription;
    private Integer progress;
    private String estimatedCompleteTime;
    private String result;
    private Boolean canAddEvidence;
    private Boolean canCancel;

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

    public String getCurrentStatus() {
        return this.currentStatus;
    }
    
    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    public String getStatusDescription() {
        return this.statusDescription;
    }
    
    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    public Integer getProgress() {
        return this.progress;
    }
    
    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public String getEstimatedCompleteTime() {
        return this.estimatedCompleteTime;
    }
    
    public void setEstimatedCompleteTime(String estimatedCompleteTime) {
        this.estimatedCompleteTime = estimatedCompleteTime;
    }

    public String getResult() {
        return this.result;
    }
    
    public void setResult(String result) {
        this.result = result;
    }

    public Boolean getCanAddEvidence() {
        return this.canAddEvidence;
    }
    
    public void setCanAddEvidence(Boolean canAddEvidence) {
        this.canAddEvidence = canAddEvidence;
    }

    public Boolean getCanCancel() {
        return this.canCancel;
    }
    
    public void setCanCancel(Boolean canCancel) {
        this.canCancel = canCancel;
    }
}
