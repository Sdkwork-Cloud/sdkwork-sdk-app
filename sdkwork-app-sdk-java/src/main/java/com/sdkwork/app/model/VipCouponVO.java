package com.sdkwork.app.model;

public class VipCouponVO {
    private String createdAt;
    private String updatedAt;
    private String id;
    private String name;
    private Double discount;
    private Double minAmount;
    private Double reduceAmount;
    private String validFrom;
    private String validTo;
    private String status;
    private Boolean used;

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

    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public Double getDiscount() {
        return this.discount;
    }
    
    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getMinAmount() {
        return this.minAmount;
    }
    
    public void setMinAmount(Double minAmount) {
        this.minAmount = minAmount;
    }

    public Double getReduceAmount() {
        return this.reduceAmount;
    }
    
    public void setReduceAmount(Double reduceAmount) {
        this.reduceAmount = reduceAmount;
    }

    public String getValidFrom() {
        return this.validFrom;
    }
    
    public void setValidFrom(String validFrom) {
        this.validFrom = validFrom;
    }

    public String getValidTo() {
        return this.validTo;
    }
    
    public void setValidTo(String validTo) {
        this.validTo = validTo;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getUsed() {
        return this.used;
    }
    
    public void setUsed(Boolean used) {
        this.used = used;
    }
}
