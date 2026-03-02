package com.sdkwork.app.model;

public class AuditRecordDetailVO {
    private String createdAt;
    private String updatedAt;
    private String recordId;
    private String contentId;
    private String contentType;
    private String originalContent;
    private String processedContent;
    private String userId;
    private String result;
    private String riskLevel;
    private Double confidence;
    private List<DetectionResult> detectionResults;
    private List<String> checkTypes;
    private String scene;
    private Map<String, Object> deviceInfo;
    private String ipAddress;
    private String location;
    private String auditTime;
    private Integer processTime;
    private Boolean hasAppeal;

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

    public String getOriginalContent() {
        return this.originalContent;
    }
    
    public void setOriginalContent(String originalContent) {
        this.originalContent = originalContent;
    }

    public String getProcessedContent() {
        return this.processedContent;
    }
    
    public void setProcessedContent(String processedContent) {
        this.processedContent = processedContent;
    }

    public String getUserId() {
        return this.userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
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

    public Double getConfidence() {
        return this.confidence;
    }
    
    public void setConfidence(Double confidence) {
        this.confidence = confidence;
    }

    public List<DetectionResult> getDetectionResults() {
        return this.detectionResults;
    }
    
    public void setDetectionResults(List<DetectionResult> detectionResults) {
        this.detectionResults = detectionResults;
    }

    public List<String> getCheckTypes() {
        return this.checkTypes;
    }
    
    public void setCheckTypes(List<String> checkTypes) {
        this.checkTypes = checkTypes;
    }

    public String getScene() {
        return this.scene;
    }
    
    public void setScene(String scene) {
        this.scene = scene;
    }

    public Map<String, Object> getDeviceInfo() {
        return this.deviceInfo;
    }
    
    public void setDeviceInfo(Map<String, Object> deviceInfo) {
        this.deviceInfo = deviceInfo;
    }

    public String getIpAddress() {
        return this.ipAddress;
    }
    
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getLocation() {
        return this.location;
    }
    
    public void setLocation(String location) {
        this.location = location;
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

    public Boolean getHasAppeal() {
        return this.hasAppeal;
    }
    
    public void setHasAppeal(Boolean hasAppeal) {
        this.hasAppeal = hasAppeal;
    }
}
