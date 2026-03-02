package com.sdkwork.app.model;

public class CurrencyConvertVO {
    private String createdAt;
    private String updatedAt;
    private String baseCurrencyCode;
    private String targetCurrencyCode;
    private Double originalAmount;
    private Double rate;
    private Double convertedAmount;

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

    public String getTargetCurrencyCode() {
        return this.targetCurrencyCode;
    }
    
    public void setTargetCurrencyCode(String targetCurrencyCode) {
        this.targetCurrencyCode = targetCurrencyCode;
    }

    public Double getOriginalAmount() {
        return this.originalAmount;
    }
    
    public void setOriginalAmount(Double originalAmount) {
        this.originalAmount = originalAmount;
    }

    public Double getRate() {
        return this.rate;
    }
    
    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Double getConvertedAmount() {
        return this.convertedAmount;
    }
    
    public void setConvertedAmount(Double convertedAmount) {
        this.convertedAmount = convertedAmount;
    }
}
