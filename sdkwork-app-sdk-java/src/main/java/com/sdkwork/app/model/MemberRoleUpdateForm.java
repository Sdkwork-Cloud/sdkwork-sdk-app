package com.sdkwork.app.model;

public class MemberRoleUpdateForm {
    private String workspaceId;
    private String memberId;
    private String userId;
    private String newRoleId;
    private String newRoleName;
    private List<String> permissions;
    private String updateReason;
    private Boolean needNotify;

    public String getWorkspaceId() {
        return this.workspaceId;
    }
    
    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
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

    public String getNewRoleId() {
        return this.newRoleId;
    }
    
    public void setNewRoleId(String newRoleId) {
        this.newRoleId = newRoleId;
    }

    public String getNewRoleName() {
        return this.newRoleName;
    }
    
    public void setNewRoleName(String newRoleName) {
        this.newRoleName = newRoleName;
    }

    public List<String> getPermissions() {
        return this.permissions;
    }
    
    public void setPermissions(List<String> permissions) {
        this.permissions = permissions;
    }

    public String getUpdateReason() {
        return this.updateReason;
    }
    
    public void setUpdateReason(String updateReason) {
        this.updateReason = updateReason;
    }

    public Boolean getNeedNotify() {
        return this.needNotify;
    }
    
    public void setNeedNotify(Boolean needNotify) {
        this.needNotify = needNotify;
    }
}
