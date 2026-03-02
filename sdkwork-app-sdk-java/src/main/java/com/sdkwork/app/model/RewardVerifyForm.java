package com.sdkwork.app.model;

public class RewardVerifyForm {
    private String advertId;
    private String rewardId;
    private String verificationToken;
    private String deviceId;
    private String ipAddress;

    public String getAdvertId() {
        return this.advertId;
    }
    
    public void setAdvertId(String advertId) {
        this.advertId = advertId;
    }

    public String getRewardId() {
        return this.rewardId;
    }
    
    public void setRewardId(String rewardId) {
        this.rewardId = rewardId;
    }

    public String getVerificationToken() {
        return this.verificationToken;
    }
    
    public void setVerificationToken(String verificationToken) {
        this.verificationToken = verificationToken;
    }

    public String getDeviceId() {
        return this.deviceId;
    }
    
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getIpAddress() {
        return this.ipAddress;
    }
    
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
}
