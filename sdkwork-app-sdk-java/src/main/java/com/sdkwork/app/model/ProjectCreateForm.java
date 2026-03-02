package com.sdkwork.app.model;

public class ProjectCreateForm {
    private String workspaceId;
    private String projectName;
    private String projectDescription;
    private String projectType;
    private String projectIcon;
    private String projectColor;
    private List<String> projectTags;
    private List<ProjectMember> members;
    private ProjectSettings settings;

    public String getWorkspaceId() {
        return this.workspaceId;
    }
    
    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
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

    public List<ProjectMember> getMembers() {
        return this.members;
    }
    
    public void setMembers(List<ProjectMember> members) {
        this.members = members;
    }

    public ProjectSettings getSettings() {
        return this.settings;
    }
    
    public void setSettings(ProjectSettings settings) {
        this.settings = settings;
    }
}
