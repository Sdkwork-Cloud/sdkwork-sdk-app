package com.sdkwork.app.model;

public class TextAuditItem {
    private String id;
    private TextAuditVO auditResult;

    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public TextAuditVO getAuditResult() {
        return this.auditResult;
    }
    
    public void setAuditResult(TextAuditVO auditResult) {
        this.auditResult = auditResult;
    }
}
