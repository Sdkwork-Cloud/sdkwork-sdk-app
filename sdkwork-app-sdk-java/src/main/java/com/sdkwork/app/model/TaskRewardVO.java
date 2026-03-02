package com.sdkwork.app.model;

public class TaskRewardVO {
    private String createdAt;
    private String updatedAt;
    private String rewardId;
    private String taskId;
    private String rewardType;
    private Integer rewardAmount;
    private String status;
    private String message;
    private String claimedAt;

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

    public String getRewardId() {
        return this.rewardId;
    }
    
    public void setRewardId(String rewardId) {
        this.rewardId = rewardId;
    }

    public String getTaskId() {
        return this.taskId;
    }
    
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getRewardType() {
        return this.rewardType;
    }
    
    public void setRewardType(String rewardType) {
        this.rewardType = rewardType;
    }

    public Integer getRewardAmount() {
        return this.rewardAmount;
    }
    
    public void setRewardAmount(Integer rewardAmount) {
        this.rewardAmount = rewardAmount;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return this.message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }

    public String getClaimedAt() {
        return this.claimedAt;
    }
    
    public void setClaimedAt(String claimedAt) {
        this.claimedAt = claimedAt;
    }
}
