package com.sdkwork.app.model;

public class CurrencyConvertForm {
    private String baseCurrencyCode;
    private String targetCurrencyCode;
    private Double amount;

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

    public Double getAmount() {
        return this.amount;
    }
    
    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
