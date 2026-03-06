package com.sdkwork.app.model;

public class AppCreateForm {
    private String name;
    private String description;
    private String appType;
    private Integer projectId;
    private AppInstallSkill installSkill;

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public String getAppType() {
        return this.appType;
    }
    
    public void setAppType(String appType) {
        this.appType = appType;
    }

    public Integer getProjectId() {
        return this.projectId;
    }
    
    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public AppInstallSkill getInstallSkill() {
        return this.installSkill;
    }
    
    public void setInstallSkill(AppInstallSkill installSkill) {
        this.installSkill = installSkill;
    }
}
