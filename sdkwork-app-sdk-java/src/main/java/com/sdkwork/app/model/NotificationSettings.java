package com.sdkwork.app.model;

public class NotificationSettings {
    private Boolean system;
    private Boolean message;
    private Boolean activity;
    private Boolean promotion;
    private Boolean sound;
    private Boolean vibration;

    public Boolean getSystem() {
        return this.system;
    }
    
    public void setSystem(Boolean system) {
        this.system = system;
    }

    public Boolean getMessage() {
        return this.message;
    }
    
    public void setMessage(Boolean message) {
        this.message = message;
    }

    public Boolean getActivity() {
        return this.activity;
    }
    
    public void setActivity(Boolean activity) {
        this.activity = activity;
    }

    public Boolean getPromotion() {
        return this.promotion;
    }
    
    public void setPromotion(Boolean promotion) {
        this.promotion = promotion;
    }

    public Boolean getSound() {
        return this.sound;
    }
    
    public void setSound(Boolean sound) {
        this.sound = sound;
    }

    public Boolean getVibration() {
        return this.vibration;
    }
    
    public void setVibration(Boolean vibration) {
        this.vibration = vibration;
    }
}
