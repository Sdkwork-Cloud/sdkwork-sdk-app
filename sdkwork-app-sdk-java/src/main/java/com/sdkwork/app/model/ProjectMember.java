package com.sdkwork.app.model;

public class ProjectMember {
    private String userId;
    private String roleId;
    private String roleName;
    private List<String> permissions;

    public String getUserId() {
        return this.userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
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
}
