package com.sdkwork.app.model;

public class TenantStatisticsVO {
    private String createdAt;
    private String updatedAt;
    private Integer totalTenants;
    private Integer activeTenants;
    private Integer frozenTenants;
    private Integer closedTenants;

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

    public Integer getTotalTenants() {
        return this.totalTenants;
    }
    
    public void setTotalTenants(Integer totalTenants) {
        this.totalTenants = totalTenants;
    }

    public Integer getActiveTenants() {
        return this.activeTenants;
    }
    
    public void setActiveTenants(Integer activeTenants) {
        this.activeTenants = activeTenants;
    }

    public Integer getFrozenTenants() {
        return this.frozenTenants;
    }
    
    public void setFrozenTenants(Integer frozenTenants) {
        this.frozenTenants = frozenTenants;
    }

    public Integer getClosedTenants() {
        return this.closedTenants;
    }
    
    public void setClosedTenants(Integer closedTenants) {
        this.closedTenants = closedTenants;
    }
}
