package com.sdkwork.app.model;

public class OrganizationStatisticsVO {
    private String createdAt;
    private String updatedAt;
    private Integer totalOrganizations;
    private Integer activeOrganizations;
    private Integer totalMembers;
    private Integer totalDepartments;
    private Integer totalPositions;

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

    public Integer getTotalOrganizations() {
        return this.totalOrganizations;
    }
    
    public void setTotalOrganizations(Integer totalOrganizations) {
        this.totalOrganizations = totalOrganizations;
    }

    public Integer getActiveOrganizations() {
        return this.activeOrganizations;
    }
    
    public void setActiveOrganizations(Integer activeOrganizations) {
        this.activeOrganizations = activeOrganizations;
    }

    public Integer getTotalMembers() {
        return this.totalMembers;
    }
    
    public void setTotalMembers(Integer totalMembers) {
        this.totalMembers = totalMembers;
    }

    public Integer getTotalDepartments() {
        return this.totalDepartments;
    }
    
    public void setTotalDepartments(Integer totalDepartments) {
        this.totalDepartments = totalDepartments;
    }

    public Integer getTotalPositions() {
        return this.totalPositions;
    }
    
    public void setTotalPositions(Integer totalPositions) {
        this.totalPositions = totalPositions;
    }
}
