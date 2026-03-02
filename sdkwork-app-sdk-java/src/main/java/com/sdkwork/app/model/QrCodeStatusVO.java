package com.sdkwork.app.model;

public class QrCodeStatusVO {
    private String createdAt;
    private String updatedAt;
    private String status;
    private UserInfoVO userInfo;
    private LoginVO token;

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

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public UserInfoVO getUserInfo() {
        return this.userInfo;
    }
    
    public void setUserInfo(UserInfoVO userInfo) {
        this.userInfo = userInfo;
    }

    public LoginVO getToken() {
        return this.token;
    }
    
    public void setToken(LoginVO token) {
        this.token = token;
    }
}
