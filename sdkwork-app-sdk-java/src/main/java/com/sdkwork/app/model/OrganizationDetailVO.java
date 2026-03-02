package com.sdkwork.app.model;

public class OrganizationDetailVO {
    private String createdAt;
    private String updatedAt;
    private String name;
    private String code;
    private String status;
    private String description;
    private Integer parentId;
    private String contactPerson;
    private String contactPhone;
    private String contactEmail;
    private String address;
    private String website;
    private String logoUrl;
    private OrganizationMetadata metadata;
    private InstallAppList installAppList;
    private Integer memberCount;
    private Integer departmentCount;
    private Integer positionCount;

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

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getParentId() {
        return this.parentId;
    }
    
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getContactPerson() {
        return this.contactPerson;
    }
    
    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
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

    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }

    public String getWebsite() {
        return this.website;
    }
    
    public void setWebsite(String website) {
        this.website = website;
    }

    public String getLogoUrl() {
        return this.logoUrl;
    }
    
    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public OrganizationMetadata getMetadata() {
        return this.metadata;
    }
    
    public void setMetadata(OrganizationMetadata metadata) {
        this.metadata = metadata;
    }

    public InstallAppList getInstallAppList() {
        return this.installAppList;
    }
    
    public void setInstallAppList(InstallAppList installAppList) {
        this.installAppList = installAppList;
    }

    public Integer getMemberCount() {
        return this.memberCount;
    }
    
    public void setMemberCount(Integer memberCount) {
        this.memberCount = memberCount;
    }

    public Integer getDepartmentCount() {
        return this.departmentCount;
    }
    
    public void setDepartmentCount(Integer departmentCount) {
        this.departmentCount = departmentCount;
    }

    public Integer getPositionCount() {
        return this.positionCount;
    }
    
    public void setPositionCount(Integer positionCount) {
        this.positionCount = positionCount;
    }
}
