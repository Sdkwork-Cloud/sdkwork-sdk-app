package com.sdkwork.app.model;

public class NotificationTypeSettingsForm {
    private String type;
    private Boolean enabled;
    private String pushMethod;
    private Boolean needReminder;

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
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
}
