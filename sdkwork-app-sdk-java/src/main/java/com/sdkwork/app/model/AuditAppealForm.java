package com.sdkwork.app.model;

public class AuditAppealForm {
    private String reason;
    private String description;
    private String evidenceUrl;
    private String contactEmail;
    private String expectedAction;

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

    public String getContactEmail() {
        return this.contactEmail;
    }
    
    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getExpectedAction() {
        return this.expectedAction;
    }
    
    public void setExpectedAction(String expectedAction) {
        this.expectedAction = expectedAction;
    }
}
