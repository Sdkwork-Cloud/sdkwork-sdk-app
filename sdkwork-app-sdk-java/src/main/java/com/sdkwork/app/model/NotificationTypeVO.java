package com.sdkwork.app.model;

public class NotificationTypeVO {
    private String createdAt;
    private String updatedAt;
    private String type;
    private String name;
    private Boolean enabled;
    private String pushMethod;
    private Boolean needReminder;
    private String description;

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

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }
    
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getPushMethod() {
        return this.pushMethod;
    }
    
    public void setPushMethod(String pushMethod) {
        this.pushMethod = pushMethod;
    }

    public Boolean getNeedReminder() {
        return this.needReminder;
    }
    
    public void setNeedReminder(Boolean needReminder) {
        this.needReminder = needReminder;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
}
