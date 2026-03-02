package com.sdkwork.app.model;

public class PartnerVO {
    private String createdAt;
    private String updatedAt;
    private String partnerId;
    private String name;
    private String level;
    private String status;
    private String promotionCode;
    private String contactName;
    private String contactPhone;
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

    public String getPartnerId() {
        return this.partnerId;
    }
    
    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return this.level;
    }
    
    public void setLevel(String level) {
        this.level = level;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getPromotionCode() {
        return this.promotionCode;
    }
    
    public void setPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode;
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
