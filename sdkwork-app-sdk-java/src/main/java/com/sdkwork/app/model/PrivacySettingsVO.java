package com.sdkwork.app.model;

public class PrivacySettingsVO {
    private Boolean publicProfile;
    private Boolean allowSearch;
    private Boolean allowFriendRequest;

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
}
