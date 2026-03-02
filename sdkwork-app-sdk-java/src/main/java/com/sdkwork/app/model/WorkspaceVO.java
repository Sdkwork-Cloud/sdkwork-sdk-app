package com.sdkwork.app.model;

public class WorkspaceVO {
    private String createdAt;
    private String updatedAt;
    private String workspaceId;
    private String workspaceName;
    private String workspaceDescription;
    private String workspaceIcon;
    private String workspaceColor;
    private String workspaceType;
    private String creatorId;
    private String creatorName;
    private String createTime;
    private String updateTime;
    private Integer memberCount;
    private Integer projectCount;
    private String status;
    private Boolean isPublic;
    private String userRole;
    private List<String> userPermissions;
    private WorkspaceSettings settings;

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

    public String getWorkspaceId() {
        return this.workspaceId;
    }
    
    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public String getWorkspaceName() {
        return this.workspaceName;
    }
    
    public void setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
    }

    public String getWorkspaceDescription() {
        return this.workspaceDescription;
    }
    
    public void setWorkspaceDescription(String workspaceDescription) {
        this.workspaceDescription = workspaceDescription;
    }

    public String getWorkspaceIcon() {
        return this.workspaceIcon;
    }
    
    public void setWorkspaceIcon(String workspaceIcon) {
        this.workspaceIcon = workspaceIcon;
    }

    public String getWorkspaceColor() {
        return this.workspaceColor;
    }
    
    public void setWorkspaceColor(String workspaceColor) {
        this.workspaceColor = workspaceColor;
    }

    public String getWorkspaceType() {
        return this.workspaceType;
    }
    
    public void setWorkspaceType(String workspaceType) {
        this.workspaceType = workspaceType;
    }

    public String getCreatorId() {
        return this.creatorId;
    }
    
    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public String getCreatorName() {
        return this.creatorName;
    }
    
    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public String getCreateTime() {
        return this.createTime;
    }
    
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return this.updateTime;
    }
    
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getMemberCount() {
        return this.memberCount;
    }
    
    public void setMemberCount(Integer memberCount) {
        this.memberCount = memberCount;
    }

    public Integer getProjectCount() {
        return this.projectCount;
    }
    
    public void setProjectCount(Integer projectCount) {
        this.projectCount = projectCount;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getIsPublic() {
        return this.isPublic;
    }
    
    public void setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
    }

    public String getUserRole() {
        return this.userRole;
    }
    
    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public List<String> getUserPermissions() {
        return this.userPermissions;
    }
    
    public void setUserPermissions(List<String> userPermissions) {
        this.userPermissions = userPermissions;
    }

    public WorkspaceSettings getSettings() {
        return this.settings;
    }
    
    public void setSettings(WorkspaceSettings settings) {
        this.settings = settings;
    }
}
