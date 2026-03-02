package com.sdkwork.app.model;

public class ProjectUpdateForm {
    private String projectId;
    private String projectName;
    private String projectDescription;
    private String projectIcon;
    private String projectColor;
    private List<String> projectTags;
    private ProjectSettings settings;

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

    public ProjectSettings getSettings() {
        return this.settings;
    }
    
    public void setSettings(ProjectSettings settings) {
        this.settings = settings;
    }
}
