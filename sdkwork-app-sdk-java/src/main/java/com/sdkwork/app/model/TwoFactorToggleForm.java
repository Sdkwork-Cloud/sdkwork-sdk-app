package com.sdkwork.app.model;

public class TwoFactorToggleForm {
    private Boolean enable;
    private String method;
    private String verificationCode;

    public Boolean getEnable() {
        return this.enable;
    }
    
    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public String getMethod() {
        return this.method;
    }
    
    public void setMethod(String method) {
        this.method = method;
    }

    public String getVerificationCode() {
        return this.verificationCode;
    }
    
    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }
}
