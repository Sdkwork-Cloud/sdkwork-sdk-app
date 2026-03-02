package com.sdkwork.app.model;

public class BehaviorRiskCheckForm {
    private String userId;
    private String behaviorType;
    private Integer frequency;
    private Map<String, Object> context;
    private Integer timeWindow;

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

    public Integer getFrequency() {
        return this.frequency;
    }
    
    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }

    public Map<String, Object> getContext() {
        return this.context;
    }
    
    public void setContext(Map<String, Object> context) {
        this.context = context;
    }

    public Integer getTimeWindow() {
        return this.timeWindow;
    }
    
    public void setTimeWindow(Integer timeWindow) {
        this.timeWindow = timeWindow;
    }
}
