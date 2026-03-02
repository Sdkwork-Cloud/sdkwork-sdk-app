package com.sdkwork.app.model;

public class NotificationSettingsUpdateForm {
    private Boolean enablePush;
    private Boolean enableEmail;
    private Boolean enableSms;
    private Boolean enableInApp;
    private String quietHoursStart;
    private String quietHoursEnd;
    private String notificationSound;
    private Boolean vibrationEnabled;

    public Boolean getEnablePush() {
        return this.enablePush;
    }
    
    public void setEnablePush(Boolean enablePush) {
        this.enablePush = enablePush;
    }

    public Boolean getEnableEmail() {
        return this.enableEmail;
    }
    
    public void setEnableEmail(Boolean enableEmail) {
        this.enableEmail = enableEmail;
    }

    public Boolean getEnableSms() {
        return this.enableSms;
    }
    
    public void setEnableSms(Boolean enableSms) {
        this.enableSms = enableSms;
    }

    public Boolean getEnableInApp() {
        return this.enableInApp;
    }
    
    public void setEnableInApp(Boolean enableInApp) {
        this.enableInApp = enableInApp;
    }

    public String getQuietHoursStart() {
        return this.quietHoursStart;
    }
    
    public void setQuietHoursStart(String quietHoursStart) {
        this.quietHoursStart = quietHoursStart;
    }

    public String getQuietHoursEnd() {
        return this.quietHoursEnd;
    }
    
    public void setQuietHoursEnd(String quietHoursEnd) {
        this.quietHoursEnd = quietHoursEnd;
    }

    public String getNotificationSound() {
        return this.notificationSound;
    }
    
    public void setNotificationSound(String notificationSound) {
        this.notificationSound = notificationSound;
    }

    public Boolean getVibrationEnabled() {
        return this.vibrationEnabled;
    }
    
    public void setVibrationEnabled(Boolean vibrationEnabled) {
        this.vibrationEnabled = vibrationEnabled;
    }
}
