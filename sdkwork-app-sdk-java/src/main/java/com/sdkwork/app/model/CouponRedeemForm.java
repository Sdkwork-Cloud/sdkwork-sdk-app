package com.sdkwork.app.model;

public class CouponRedeemForm {
    private String redeemCode;
    private String channel;

    public String getRedeemCode() {
        return this.redeemCode;
    }
    
    public void setRedeemCode(String redeemCode) {
        this.redeemCode = redeemCode;
    }

    public String getChannel() {
        return this.channel;
    }
    
    public void setChannel(String channel) {
        this.channel = channel;
    }
}
