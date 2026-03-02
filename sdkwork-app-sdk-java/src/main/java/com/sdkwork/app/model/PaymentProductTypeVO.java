package com.sdkwork.app.model;

public class PaymentProductTypeVO {
    private String createdAt;
    private String updatedAt;
    private String code;
    private String name;
    private Boolean available;

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

    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public Boolean getAvailable() {
        return this.available;
    }
    
    public void setAvailable(Boolean available) {
        this.available = available;
    }
}
