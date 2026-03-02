package com.sdkwork.app.model;

public class OnboardingStepVO {
    private String createdAt;
    private String updatedAt;
    private String id;
    private String title;
    private String description;
    private Integer order;
    private Boolean completed;
    private String completeTime;

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

    public Integer getOrder() {
        return this.order;
    }
    
    public void setOrder(Integer order) {
        this.order = order;
    }

    public Boolean getCompleted() {
        return this.completed;
    }
    
    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public String getCompleteTime() {
        return this.completeTime;
    }
    
    public void setCompleteTime(String completeTime) {
        this.completeTime = completeTime;
    }
}
