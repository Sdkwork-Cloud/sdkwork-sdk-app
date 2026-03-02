package com.sdkwork.app.model;

public class ImageAuditItem {
    private String id;
    private ImageAuditVO auditResult;

    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public ImageAuditVO getAuditResult() {
        return this.auditResult;
    }
    
    public void setAuditResult(ImageAuditVO auditResult) {
        this.auditResult = auditResult;
    }
}
