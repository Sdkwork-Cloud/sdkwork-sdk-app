package com.sdkwork.app.model;

public class AccountDeleteForm {
    private String password;
    private String reason;
    private Boolean confirm;
    private Integer timestamp;

    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public String getReason() {
        return this.reason;
    }
    
    public void setReason(String reason) {
        this.reason = reason;
    }

    public Boolean getConfirm() {
        return this.confirm;
    }
    
    public void setConfirm(Boolean confirm) {
        this.confirm = confirm;
    }

    public Integer getTimestamp() {
        return this.timestamp;
    }
    
    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }
}
