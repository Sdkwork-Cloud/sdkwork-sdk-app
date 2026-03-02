package com.sdkwork.app.model;

public class BehaviorRiskVO {
    private String createdAt;
    private String updatedAt;
    private String userId;
    private String behaviorType;
    private String riskLevel;
    private Integer riskScore;
    private List<AnomalyPattern> anomalies;
    private FrequencyStats frequencyStats;
    private String suggestion;
    private List<String> restrictions;

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

    public String getBehaviorType() {
        return this.behaviorType;
    }
    
    public void setBehaviorType(String behaviorType) {
        this.behaviorType = behaviorType;
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

    public List<AnomalyPattern> getAnomalies() {
        return this.anomalies;
    }
    
    public void setAnomalies(List<AnomalyPattern> anomalies) {
        this.anomalies = anomalies;
    }

    public FrequencyStats getFrequencyStats() {
        return this.frequencyStats;
    }
    
    public void setFrequencyStats(FrequencyStats frequencyStats) {
        this.frequencyStats = frequencyStats;
    }

    public String getSuggestion() {
        return this.suggestion;
    }
    
    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    public List<String> getRestrictions() {
        return this.restrictions;
    }
    
    public void setRestrictions(List<String> restrictions) {
        this.restrictions = restrictions;
    }
}
