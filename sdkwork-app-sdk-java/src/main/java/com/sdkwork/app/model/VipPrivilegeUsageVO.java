package com.sdkwork.app.model;

public class VipPrivilegeUsageVO {
    private String createdAt;
    private String updatedAt;
    private Integer speedUpUsed;
    private Integer speedUpLimit;
    private Integer priorityQueueUsed;
    private Integer priorityQueueLimit;
    private Integer exclusiveModelUsed;
    private Integer exclusiveModelLimit;

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

    public Integer getSpeedUpUsed() {
        return this.speedUpUsed;
    }
    
    public void setSpeedUpUsed(Integer speedUpUsed) {
        this.speedUpUsed = speedUpUsed;
    }

    public Integer getSpeedUpLimit() {
        return this.speedUpLimit;
    }
    
    public void setSpeedUpLimit(Integer speedUpLimit) {
        this.speedUpLimit = speedUpLimit;
    }

    public Integer getPriorityQueueUsed() {
        return this.priorityQueueUsed;
    }
    
    public void setPriorityQueueUsed(Integer priorityQueueUsed) {
        this.priorityQueueUsed = priorityQueueUsed;
    }

    public Integer getPriorityQueueLimit() {
        return this.priorityQueueLimit;
    }
    
    public void setPriorityQueueLimit(Integer priorityQueueLimit) {
        this.priorityQueueLimit = priorityQueueLimit;
    }

    public Integer getExclusiveModelUsed() {
        return this.exclusiveModelUsed;
    }
    
    public void setExclusiveModelUsed(Integer exclusiveModelUsed) {
        this.exclusiveModelUsed = exclusiveModelUsed;
    }

    public Integer getExclusiveModelLimit() {
        return this.exclusiveModelLimit;
    }
    
    public void setExclusiveModelLimit(Integer exclusiveModelLimit) {
        this.exclusiveModelLimit = exclusiveModelLimit;
    }
}
