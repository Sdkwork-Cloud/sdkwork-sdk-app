package com.sdkwork.app.model;

public class ShareVerifyForm {
    private String shareId;
    private String password;
    private String verificationCode;

    public String getShareId() {
        return this.shareId;
    }
    
    public void setShareId(String shareId) {
        this.shareId = shareId;
    }

    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public String getVerificationCode() {
        return this.verificationCode;
    }
    
    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }
}
