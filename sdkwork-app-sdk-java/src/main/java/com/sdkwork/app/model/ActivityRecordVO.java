package com.sdkwork.app.model;

public class ActivityRecordVO {
    private String createdAt;
    private String updatedAt;
    private String id;
    private String activityId;
    private String activityTitle;
    private String activityType;
    private String participateTime;
    private String status;
    private String result;
    private Map<String, Object> rewards;

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

    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public String getActivityId() {
        return this.activityId;
    }
    
    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public String getActivityTitle() {
        return this.activityTitle;
    }
    
    public void setActivityTitle(String activityTitle) {
        this.activityTitle = activityTitle;
    }

    public String getActivityType() {
        return this.activityType;
    }
    
    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    public String getParticipateTime() {
        return this.participateTime;
    }
    
    public void setParticipateTime(String participateTime) {
        this.participateTime = participateTime;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getResult() {
        return this.result;
    }
    
    public void setResult(String result) {
        this.result = result;
    }

    public Map<String, Object> getRewards() {
        return this.rewards;
    }
    
    public void setRewards(Map<String, Object> rewards) {
        this.rewards = rewards;
    }
}
