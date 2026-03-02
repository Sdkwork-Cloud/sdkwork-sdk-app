package com.sdkwork.app.model;

public class ExchangeRateCreateForm {
    private String baseCurrencyCode;
    private String targetCurrencyCode;
    private Double rate;
    private String effectiveDate;

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
