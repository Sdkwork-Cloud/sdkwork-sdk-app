package com.sdkwork.app.model;

public class TaskVO {
    private String createdAt;
    private String updatedAt;
    private String taskId;
    private String taskName;
    private String taskType;
    private String status;
    private Integer progress;
    private Integer total;
    private String rewardType;
    private Integer rewardAmount;
    private String expireAt;

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

    public String getTaskName() {
        return this.taskName;
    }
    
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskType() {
        return this.taskType;
    }
    
    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getProgress() {
        return this.progress;
    }
    
    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public Integer getTotal() {
        return this.total;
    }
    
    public void setTotal(Integer total) {
        this.total = total;
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

    public String getExpireAt() {
        return this.expireAt;
    }
    
    public void setExpireAt(String expireAt) {
        this.expireAt = expireAt;
    }
}
