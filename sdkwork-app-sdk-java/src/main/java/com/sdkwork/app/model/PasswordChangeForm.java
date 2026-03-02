package com.sdkwork.app.model;

public class PasswordChangeForm {
    private String oldPassword;
    private String newPassword;
    private String confirmPassword;
    private String verifyCode;

    public String getOldPassword() {
        return this.oldPassword;
    }
    
    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public String getNewPassword() {
        return this.newPassword;
    }
    
    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getConfirmPassword() {
        return this.confirmPassword;
    }
    
    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getVerifyCode() {
        return this.verifyCode;
    }
    
    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }
}
