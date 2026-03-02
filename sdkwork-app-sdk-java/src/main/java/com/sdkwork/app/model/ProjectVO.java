package com.sdkwork.app.model;

public class ProjectVO {
    private String createdAt;
    private String updatedAt;
    private String projectId;
    private String projectName;
    private String projectDescription;
    private String projectType;
    private String projectIcon;
    private String projectColor;
    private List<String> projectTags;
    private String workspaceId;
    private String workspaceName;
    private String creatorId;
    private String creatorName;
    private String createTime;
    private String updateTime;
    private Integer memberCount;
    private Integer fileCount;
    private String status;
    private Boolean isPublic;
    private List<String> userPermissions;

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

    public String getProjectId() {
        return this.projectId;
    }
    
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return this.projectName;
    }
    
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectDescription() {
        return this.projectDescription;
    }
    
    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    public String getProjectType() {
        return this.projectType;
    }
    
    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }

    public String getProjectIcon() {
        return this.projectIcon;
    }
    
    public void setProjectIcon(String projectIcon) {
        this.projectIcon = projectIcon;
    }

    public String getProjectColor() {
        return this.projectColor;
    }
    
    public void setProjectColor(String projectColor) {
        this.projectColor = projectColor;
    }

    public List<String> getProjectTags() {
        return this.projectTags;
    }
    
    public void setProjectTags(List<String> projectTags) {
        this.projectTags = projectTags;
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

    public Integer getFileCount() {
        return this.fileCount;
    }
    
    public void setFileCount(Integer fileCount) {
        this.fileCount = fileCount;
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

    public List<String> getUserPermissions() {
        return this.userPermissions;
    }
    
    public void setUserPermissions(List<String> userPermissions) {
        this.userPermissions = userPermissions;
    }
}
