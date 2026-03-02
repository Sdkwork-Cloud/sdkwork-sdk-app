package com.sdkwork.app.model;

public class PartnerCreateForm {
    private String name;
    private String contactName;
    private String contactPhone;
    private String contactEmail;
    private String level;
    private Integer parentId;

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getContactName() {
        return this.contactName;
    }
    
    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactPhone() {
        return this.contactPhone;
    }
    
    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getContactEmail() {
        return this.contactEmail;
    }
    
    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getLevel() {
        return this.level;
    }
    
    public void setLevel(String level) {
        this.level = level;
    }

    public Integer getParentId() {
        return this.parentId;
    }
    
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }
}
