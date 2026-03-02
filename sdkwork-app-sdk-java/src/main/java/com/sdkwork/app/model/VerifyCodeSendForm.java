package com.sdkwork.app.model;

public class VerifyCodeSendForm {
    private String target;
    private String type;
    private String verifyType;
    private String deviceId;

    public String getTarget() {
        return this.target;
    }
    
    public void setTarget(String target) {
        this.target = target;
    }

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public String getVerifyType() {
        return this.verifyType;
    }
    
    public void setVerifyType(String verifyType) {
        this.verifyType = verifyType;
    }

    public String getDeviceId() {
        return this.deviceId;
    }
    
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }
}
