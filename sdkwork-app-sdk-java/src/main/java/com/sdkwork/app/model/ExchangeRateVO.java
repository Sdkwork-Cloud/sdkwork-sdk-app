package com.sdkwork.app.model;

public class ExchangeRateVO {
    private String createdAt;
    private String updatedAt;
    private String baseCurrencyCode;
    private String baseCurrencyName;
    private String targetCurrencyCode;
    private String targetCurrencyName;
    private Double rate;
    private String effectiveDate;

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

    public String getBaseCurrencyCode() {
        return this.baseCurrencyCode;
    }
    
    public void setBaseCurrencyCode(String baseCurrencyCode) {
        this.baseCurrencyCode = baseCurrencyCode;
    }

    public String getBaseCurrencyName() {
        return this.baseCurrencyName;
    }
    
    public void setBaseCurrencyName(String baseCurrencyName) {
        this.baseCurrencyName = baseCurrencyName;
    }

    public String getTargetCurrencyCode() {
        return this.targetCurrencyCode;
    }
    
    public void setTargetCurrencyCode(String targetCurrencyCode) {
        this.targetCurrencyCode = targetCurrencyCode;
    }

    public String getTargetCurrencyName() {
        return this.targetCurrencyName;
    }
    
    public void setTargetCurrencyName(String targetCurrencyName) {
        this.targetCurrencyName = targetCurrencyName;
    }

    public Double getRate() {
        return this.rate;
    }
    
    public void setRate(Double rate) {
        this.rate = rate;
    }

    public String getEffectiveDate() {
        return this.effectiveDate;
    }
    
    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }
}
