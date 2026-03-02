package com.sdkwork.app.model;

public class UserSearchResult {
    private Integer id;
    private String username;
    private String realName;
    private String userType;
    private String avatarUrl;

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    public String getRealName() {
        return this.realName;
    }
    
    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getUserType() {
        return this.userType;
    }
    
    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getAvatarUrl() {
        return this.avatarUrl;
    }
    
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }
}
