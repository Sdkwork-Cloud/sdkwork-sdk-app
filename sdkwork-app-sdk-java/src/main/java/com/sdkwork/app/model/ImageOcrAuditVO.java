package com.sdkwork.app.model;

public class ImageOcrAuditVO {
    private String createdAt;
    private String updatedAt;
    private String taskId;
    private String ocrText;
    private List<TextBlock> textBlocks;
    private TextAuditVO textAuditResult;
    private String overallResult;

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

    public String getTaskId() {
        return this.taskId;
    }
    
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getOcrText() {
        return this.ocrText;
    }
    
    public void setOcrText(String ocrText) {
        this.ocrText = ocrText;
    }

    public List<TextBlock> getTextBlocks() {
        return this.textBlocks;
    }
    
    public void setTextBlocks(List<TextBlock> textBlocks) {
        this.textBlocks = textBlocks;
    }

    public TextAuditVO getTextAuditResult() {
        return this.textAuditResult;
    }
    
    public void setTextAuditResult(TextAuditVO textAuditResult) {
        this.textAuditResult = textAuditResult;
    }

    public String getOverallResult() {
        return this.overallResult;
    }
    
    public void setOverallResult(String overallResult) {
        this.overallResult = overallResult;
    }
}
