package com.sdkwork.app.model;

public class PartnerStatisticsVO {
    private String createdAt;
    private String updatedAt;
    private Integer totalPartners;
    private Integer activePartners;
    private Integer pendingPartners;
    private Double totalCommission;
    private Double withdrawableCommission;

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

    public Integer getTotalPartners() {
        return this.totalPartners;
    }
    
    public void setTotalPartners(Integer totalPartners) {
        this.totalPartners = totalPartners;
    }

    public Integer getActivePartners() {
        return this.activePartners;
    }
    
    public void setActivePartners(Integer activePartners) {
        this.activePartners = activePartners;
    }

    public Integer getPendingPartners() {
        return this.pendingPartners;
    }
    
    public void setPendingPartners(Integer pendingPartners) {
        this.pendingPartners = pendingPartners;
    }

    public Double getTotalCommission() {
        return this.totalCommission;
    }
    
    public void setTotalCommission(Double totalCommission) {
        this.totalCommission = totalCommission;
    }

    public Double getWithdrawableCommission() {
        return this.withdrawableCommission;
    }
    
    public void setWithdrawableCommission(Double withdrawableCommission) {
        this.withdrawableCommission = withdrawableCommission;
    }
}
