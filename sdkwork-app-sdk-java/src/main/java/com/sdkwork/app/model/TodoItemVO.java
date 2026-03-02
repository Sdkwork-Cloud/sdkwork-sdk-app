package com.sdkwork.app.model;

public class TodoItemVO {
    private String createdAt;
    private String updatedAt;
    private String id;
    private String title;
    private String description;
    private String status;
    private String priority;
    private String dueDate;
    private String createTime;
    private String updateTime;
    private String completedAt;
    private String creator;
    private String assignee;
    private String resourceId;
    private String resourceType;
    private List<String> tags;
    private Integer progress;
    private String reminderTime;

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

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getPriority() {
        return this.priority;
    }
    
    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getDueDate() {
        return this.dueDate;
    }
    
    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getCreateTime() {
        return this.createTime;
    }
    
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return this.updateTime;
    }
    
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getCompletedAt() {
        return this.completedAt;
    }
    
    public void setCompletedAt(String completedAt) {
        this.completedAt = completedAt;
    }

    public String getCreator() {
        return this.creator;
    }
    
    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getAssignee() {
        return this.assignee;
    }
    
    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getResourceId() {
        return this.resourceId;
    }
    
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getResourceType() {
        return this.resourceType;
    }
    
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public List<String> getTags() {
        return this.tags;
    }
    
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Integer getProgress() {
        return this.progress;
    }
    
    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public String getReminderTime() {
        return this.reminderTime;
    }
    
    public void setReminderTime(String reminderTime) {
        this.reminderTime = reminderTime;
    }
}
