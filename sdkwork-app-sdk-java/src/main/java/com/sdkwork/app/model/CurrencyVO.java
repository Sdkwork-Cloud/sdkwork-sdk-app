package com.sdkwork.app.model;

public class CurrencyVO {
    private String createdAt;
    private String updatedAt;
    private String code;
    private String name;
    private String symbol;
    private String currencyType;
    private Integer precisionDigits;
    private Boolean isActive;
    private String description;

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

    public String getSymbol() {
        return this.symbol;
    }
    
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getCurrencyType() {
        return this.currencyType;
    }
    
    public void setCurrencyType(String currencyType) {
        this.currencyType = currencyType;
    }

    public Integer getPrecisionDigits() {
        return this.precisionDigits;
    }
    
    public void setPrecisionDigits(Integer precisionDigits) {
        this.precisionDigits = precisionDigits;
    }

    public Boolean getIsActive() {
        return this.isActive;
    }
    
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
}
