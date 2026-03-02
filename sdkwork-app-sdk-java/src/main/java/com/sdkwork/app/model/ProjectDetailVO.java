package com.sdkwork.app.model;

public class ProjectDetailVO {
    private String createdAt;
    private String updatedAt;
    private String projectId;
    private String projectName;
    private String projectTitle;
    private String projectDescription;
    private String projectType;
    private String projectTypeName;
    private String projectCode;
    private String projectIcon;
    private String coverImageUrl;
    private List<String> projectTags;
    private String workspaceId;
    private String workspaceName;
    private String creatorId;
    private String creatorName;
    private String author;
    private String sitePath;
    private String domainPrefix;
    private String startTime;
    private String endTime;
    private Boolean isTemplate;
    private String createTime;
    private String updateTime;
    private List<MemberVO> members;
    private String status;
    private String statusName;
    private ProjectSettings settings;

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

    public String getProjectTitle() {
        return this.projectTitle;
    }
    
    public void setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
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

    public String getProjectTypeName() {
        return this.projectTypeName;
    }
    
    public void setProjectTypeName(String projectTypeName) {
        this.projectTypeName = projectTypeName;
    }

    public String getProjectCode() {
        return this.projectCode;
    }
    
    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public String getProjectIcon() {
        return this.projectIcon;
    }
    
    public void setProjectIcon(String projectIcon) {
        this.projectIcon = projectIcon;
    }

    public String getCoverImageUrl() {
        return this.coverImageUrl;
    }
    
    public void setCoverImageUrl(String coverImageUrl) {
        this.coverImageUrl = coverImageUrl;
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

    public String getAuthor() {
        return this.author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSitePath() {
        return this.sitePath;
    }
    
    public void setSitePath(String sitePath) {
        this.sitePath = sitePath;
    }

    public String getDomainPrefix() {
        return this.domainPrefix;
    }
    
    public void setDomainPrefix(String domainPrefix) {
        this.domainPrefix = domainPrefix;
    }

    public String getStartTime() {
        return this.startTime;
    }
    
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return this.endTime;
    }
    
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Boolean getIsTemplate() {
        return this.isTemplate;
    }
    
    public void setIsTemplate(Boolean isTemplate) {
        this.isTemplate = isTemplate;
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

    public List<MemberVO> getMembers() {
        return this.members;
    }
    
    public void setMembers(List<MemberVO> members) {
        this.members = members;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusName() {
        return this.statusName;
    }
    
    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public ProjectSettings getSettings() {
        return this.settings;
    }
    
    public void setSettings(ProjectSettings settings) {
        this.settings = settings;
    }
}
