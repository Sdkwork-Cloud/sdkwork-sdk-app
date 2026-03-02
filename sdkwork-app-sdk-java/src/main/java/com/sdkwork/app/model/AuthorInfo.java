package com.sdkwork.app.model;

public class AuthorInfo {
    private Integer id;
    private String name;
    private String avatar;
    private String bio;
    private Boolean isFollowing;

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return this.avatar;
    }
    
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getBio() {
        return this.bio;
    }
    
    public void setBio(String bio) {
        this.bio = bio;
    }

    public Boolean getIsFollowing() {
        return this.isFollowing;
    }
    
    public void setIsFollowing(Boolean isFollowing) {
        this.isFollowing = isFollowing;
    }
}
