package com.sdkwork.app.model;

public class PrivilegeVO {
    private String privilegeId;
    private String name;
    private String description;
    private String icon;
    private String type;
    private String status;

    public String getPrivilegeId() {
        return this.privilegeId;
    }
    
    public void setPrivilegeId(String privilegeId) {
        this.privilegeId = privilegeId;
    }

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

    public String getIcon() {
        return this.icon;
    }
    
    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
}
