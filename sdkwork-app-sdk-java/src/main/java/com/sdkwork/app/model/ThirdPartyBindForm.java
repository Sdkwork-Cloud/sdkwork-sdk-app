package com.sdkwork.app.model;

public class ThirdPartyBindForm {
    private String platform;
    private String code;
    private String thirdPartyUserId;
    private String thirdPartyUserName;
    private String thirdPartyAvatar;
    private String accessToken;
    private String refreshToken;
    private String expireTime;

    public String getPlatform() {
        return this.platform;
    }
    
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }

    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }
    
    public void setThirdPartyUserId(String thirdPartyUserId) {
        this.thirdPartyUserId = thirdPartyUserId;
    }

    public String getThirdPartyUserName() {
        return this.thirdPartyUserName;
    }
    
    public void setThirdPartyUserName(String thirdPartyUserName) {
        this.thirdPartyUserName = thirdPartyUserName;
    }

    public String getThirdPartyAvatar() {
        return this.thirdPartyAvatar;
    }
    
    public void setThirdPartyAvatar(String thirdPartyAvatar) {
        this.thirdPartyAvatar = thirdPartyAvatar;
    }

    public String getAccessToken() {
        return this.accessToken;
    }
    
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getRefreshToken() {
        return this.refreshToken;
    }
    
    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public String getExpireTime() {
        return this.expireTime;
    }
    
    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }
}
