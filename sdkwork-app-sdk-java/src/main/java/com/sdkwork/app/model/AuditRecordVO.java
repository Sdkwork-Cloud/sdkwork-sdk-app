package com.sdkwork.app.model;

public class AuditRecordVO {
    private String createdAt;
    private String updatedAt;
    private String recordId;
    private String contentId;
    private String contentType;
    private String contentPreview;
    private String result;
    private String riskLevel;
    private List<String> checkTypes;
    private List<String> violationTypes;
    private String auditTime;
    private Integer processTime;

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

    public String getRecordId() {
        return this.recordId;
    }
    
    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public String getContentId() {
        return this.contentId;
    }
    
    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public String getContentType() {
        return this.contentType;
    }
    
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getContentPreview() {
        return this.contentPreview;
    }
    
    public void setContentPreview(String contentPreview) {
        this.contentPreview = contentPreview;
    }

    public String getResult() {
        return this.result;
    }
    
    public void setResult(String result) {
        this.result = result;
    }

    public String getRiskLevel() {
        return this.riskLevel;
    }
    
    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }

    public List<String> getCheckTypes() {
        return this.checkTypes;
    }
    
    public void setCheckTypes(List<String> checkTypes) {
        this.checkTypes = checkTypes;
    }

    public List<String> getViolationTypes() {
        return this.violationTypes;
    }
    
    public void setViolationTypes(List<String> violationTypes) {
        this.violationTypes = violationTypes;
    }

    public String getAuditTime() {
        return this.auditTime;
    }
    
    public void setAuditTime(String auditTime) {
        this.auditTime = auditTime;
    }

    public Integer getProcessTime() {
        return this.processTime;
    }
    
    public void setProcessTime(Integer processTime) {
        this.processTime = processTime;
    }
}
