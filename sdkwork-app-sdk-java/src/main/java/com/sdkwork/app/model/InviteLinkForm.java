package com.sdkwork.app.model;

public class InviteLinkForm {
    private String inviteType;
    private Integer expireSeconds;
    private String inviteCode;
    private String channel;

    public String getInviteType() {
        return this.inviteType;
    }
    
    public void setInviteType(String inviteType) {
        this.inviteType = inviteType;
    }

    public Integer getExpireSeconds() {
        return this.expireSeconds;
    }
    
    public void setExpireSeconds(Integer expireSeconds) {
        this.expireSeconds = expireSeconds;
    }

    public String getInviteCode() {
        return this.inviteCode;
    }
    
    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode;
    }

    public String getChannel() {
        return this.channel;
    }
    
    public void setChannel(String channel) {
        this.channel = channel;
    }
}
