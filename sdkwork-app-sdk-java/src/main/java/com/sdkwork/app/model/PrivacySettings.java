package com.sdkwork.app.model;

public class PrivacySettings {
    private Boolean publicProfile;
    private Boolean allowSearch;
    private Boolean allowFriendRequest;
    private Boolean allowStrangerMessage;
    private Boolean locationShare;

    public Boolean getPublicProfile() {
        return this.publicProfile;
    }
    
    public void setPublicProfile(Boolean publicProfile) {
        this.publicProfile = publicProfile;
    }

    public Boolean getAllowSearch() {
        return this.allowSearch;
    }
    
    public void setAllowSearch(Boolean allowSearch) {
        this.allowSearch = allowSearch;
    }

    public Boolean getAllowFriendRequest() {
        return this.allowFriendRequest;
    }
    
    public void setAllowFriendRequest(Boolean allowFriendRequest) {
        this.allowFriendRequest = allowFriendRequest;
    }

    public Boolean getAllowStrangerMessage() {
        return this.allowStrangerMessage;
    }
    
    public void setAllowStrangerMessage(Boolean allowStrangerMessage) {
        this.allowStrangerMessage = allowStrangerMessage;
    }

    public Boolean getLocationShare() {
        return this.locationShare;
    }
    
    public void setLocationShare(Boolean locationShare) {
        this.locationShare = locationShare;
    }
}
