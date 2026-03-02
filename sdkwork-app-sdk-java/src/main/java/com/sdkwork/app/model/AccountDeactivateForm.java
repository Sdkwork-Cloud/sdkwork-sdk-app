package com.sdkwork.app.model;

public class AccountDeactivateForm {
    private String reason;
    private String verifyCode;
    private String password;
    private Boolean confirm;
    private String remark;

    public String getReason() {
        return this.reason;
    }
    
    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getVerifyCode() {
        return this.verifyCode;
    }
    
    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }

    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getConfirm() {
        return this.confirm;
    }
    
    public void setConfirm(Boolean confirm) {
        this.confirm = confirm;
    }

    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }
}
