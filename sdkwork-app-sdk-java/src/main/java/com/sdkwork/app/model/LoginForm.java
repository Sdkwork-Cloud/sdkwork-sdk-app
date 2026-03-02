package com.sdkwork.app.model;

public class LoginForm {
    private String username;
    private String password;
    private String captcha;

    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public String getCaptcha() {
        return this.captcha;
    }
    
    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }
}
