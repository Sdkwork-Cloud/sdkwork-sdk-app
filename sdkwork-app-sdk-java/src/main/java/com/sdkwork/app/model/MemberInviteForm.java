package com.sdkwork.app.model;

public class MemberInviteForm {
    private String workspaceId;
    private List<String> emails;
    private String roleId;
    private String roleName;
    private List<String> permissions;
    private String inviteMessage;
    private Integer expireHours;
    private Boolean needApproval;

    public String getWorkspaceId() {
        return this.workspaceId;
    }
    
    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public List<String> getEmails() {
        return this.emails;
    }
    
    public void setEmails(List<String> emails) {
        this.emails = emails;
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

    public String getInviteMessage() {
        return this.inviteMessage;
    }
    
    public void setInviteMessage(String inviteMessage) {
        this.inviteMessage = inviteMessage;
    }

    public Integer getExpireHours() {
        return this.expireHours;
    }
    
    public void setExpireHours(Integer expireHours) {
        this.expireHours = expireHours;
    }

    public Boolean getNeedApproval() {
        return this.needApproval;
    }
    
    public void setNeedApproval(Boolean needApproval) {
        this.needApproval = needApproval;
    }
}
