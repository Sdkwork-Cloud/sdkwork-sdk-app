package com.sdkwork.app.model;

public class RolloutCheckVO {
    private String createdAt;
    private String updatedAt;
    private String rolloutKey;
    private Boolean canRollout;
    private String reason;
    private String status;
    private String checkedAt;

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

    public String getRolloutKey() {
        return this.rolloutKey;
    }
    
    public void setRolloutKey(String rolloutKey) {
        this.rolloutKey = rolloutKey;
    }

    public Boolean getCanRollout() {
        return this.canRollout;
    }
    
    public void setCanRollout(Boolean canRollout) {
        this.canRollout = canRollout;
    }

    public String getReason() {
        return this.reason;
    }
    
    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getCheckedAt() {
        return this.checkedAt;
    }
    
    public void setCheckedAt(String checkedAt) {
        this.checkedAt = checkedAt;
    }
}
