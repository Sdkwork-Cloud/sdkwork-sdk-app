package com.sdkwork.app.model;

public class UserProfileUpdateForm {
    private String nickname;
    private String avatar;
    private String gender;
    private String birthday;
    private String region;
    private String bio;
    private String occupation;
    private String interests;
    private String phone;
    private String email;
    private String verifyCode;

    public String getNickname() {
        return this.nickname;
    }
    
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getAvatar() {
        return this.avatar;
    }
    
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getGender() {
        return this.gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return this.birthday;
    }
    
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getRegion() {
        return this.region;
    }
    
    public void setRegion(String region) {
        this.region = region;
    }

    public String getBio() {
        return this.bio;
    }
    
    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getOccupation() {
        return this.occupation;
    }
    
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getInterests() {
        return this.interests;
    }
    
    public void setInterests(String interests) {
        this.interests = interests;
    }

    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public String getVerifyCode() {
        return this.verifyCode;
    }
    
    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }
}
