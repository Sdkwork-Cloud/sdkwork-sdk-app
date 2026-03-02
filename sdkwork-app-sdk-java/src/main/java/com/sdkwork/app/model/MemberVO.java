package com.sdkwork.app.model;

public class MemberVO {
    private String createdAt;
    private String updatedAt;
    private String memberId;
    private String userId;
    private String username;
    private String nickname;
    private String avatar;
    private String email;
    private String roleId;
    private String roleName;
    private List<String> permissions;
    private String joinTime;
    private String lastActiveTime;
    private String status;
    private Boolean isCreator;
    private Boolean isAdmin;

    public String getCreatedAt() {
        return this.createdAt;
    }
    
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return this.updatedAt;
    }
    
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getMemberId() {
        return this.memberId;
    }
    
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getUserId() {
        return this.userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

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

    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public String getRoleId() {
        return this.roleId;
    }
    
    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return this.roleName;
    }
    
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public List<String> getPermissions() {
        return this.permissions;
    }
    
    public void setPermissions(List<String> permissions) {
        this.permissions = permissions;
    }

    public String getJoinTime() {
        return this.joinTime;
    }
    
    public void setJoinTime(String joinTime) {
        this.joinTime = joinTime;
    }

    public String getLastActiveTime() {
        return this.lastActiveTime;
    }
    
    public void setLastActiveTime(String lastActiveTime) {
        this.lastActiveTime = lastActiveTime;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getIsCreator() {
        return this.isCreator;
    }
    
    public void setIsCreator(Boolean isCreator) {
        this.isCreator = isCreator;
    }

    public Boolean getIsAdmin() {
        return this.isAdmin;
    }
    
    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }
}
