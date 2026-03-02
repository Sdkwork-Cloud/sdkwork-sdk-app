package com.sdkwork.app.model;

public class ActivityJoinVO {
    private String createdAt;
    private String updatedAt;
    private String recordId;
    private Boolean success;
    private String result;
    private Map<String, Object> rewards;
    private Integer remainingCount;
    private String message;

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

    public Boolean getSuccess() {
        return this.success;
    }
    
    public void setSuccess(Boolean success) {
        this.success = success;
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

    public Integer getRemainingCount() {
        return this.remainingCount;
    }
    
    public void setRemainingCount(Integer remainingCount) {
        this.remainingCount = remainingCount;
    }

    public String getMessage() {
        return this.message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
}
