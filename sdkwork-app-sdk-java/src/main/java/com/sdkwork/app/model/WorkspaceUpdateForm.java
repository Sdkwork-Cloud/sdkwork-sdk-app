package com.sdkwork.app.model;

public class WorkspaceUpdateForm {
    private String workspaceId;
    private String workspaceName;
    private String workspaceDescription;
    private String workspaceIcon;
    private String workspaceColor;
    private WorkspaceSettings settings;

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

    public WorkspaceSettings getSettings() {
        return this.settings;
    }
    
    public void setSettings(WorkspaceSettings settings) {
        this.settings = settings;
    }
}
