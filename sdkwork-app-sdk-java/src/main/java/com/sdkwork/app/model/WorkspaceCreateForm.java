package com.sdkwork.app.model;

public class WorkspaceCreateForm {
    private String workspaceName;
    private String workspaceDescription;
    private String workspaceIcon;
    private String workspaceColor;
    private String workspaceType;
    private List<WorkspaceMember> members;
    private WorkspaceSettings settings;

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

    public List<WorkspaceMember> getMembers() {
        return this.members;
    }
    
    public void setMembers(List<WorkspaceMember> members) {
        this.members = members;
    }

    public WorkspaceSettings getSettings() {
        return this.settings;
    }
    
    public void setSettings(WorkspaceSettings settings) {
        this.settings = settings;
    }
}
