package com.sdkwork.app.model;

public class AccountRiskVO {
    private String createdAt;
    private String updatedAt;
    private String userId;
    private String deviceId;
    private String riskLevel;
    private Integer riskScore;
    private List<RiskItem> risks;
    private String suggestion;
    private Boolean needVerification;

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

    public String getUserId() {
        return this.userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDeviceId() {
        return this.deviceId;
    }
    
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getRiskLevel() {
        return this.riskLevel;
    }
    
    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }

    public Integer getRiskScore() {
        return this.riskScore;
    }
    
    public void setRiskScore(Integer riskScore) {
        this.riskScore = riskScore;
    }

    public List<RiskItem> getRisks() {
        return this.risks;
    }
    
    public void setRisks(List<RiskItem> risks) {
        this.risks = risks;
    }

    public String getSuggestion() {
        return this.suggestion;
    }
    
    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    public Boolean getNeedVerification() {
        return this.needVerification;
    }
    
    public void setNeedVerification(Boolean needVerification) {
        this.needVerification = needVerification;
    }
}
