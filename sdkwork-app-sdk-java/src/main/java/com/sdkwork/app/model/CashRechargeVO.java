package com.sdkwork.app.model;

public class CashRechargeVO {
    private String createdAt;
    private String updatedAt;
    private String transactionId;
    private String accountId;
    private Double amount;
    private Double balanceAfter;
    private String status;
    private String paymentMethod;
    private String payUrl;

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

    public String getTransactionId() {
        return this.transactionId;
    }
    
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getAccountId() {
        return this.accountId;
    }
    
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public Double getAmount() {
        return this.amount;
    }
    
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getBalanceAfter() {
        return this.balanceAfter;
    }
    
    public void setBalanceAfter(Double balanceAfter) {
        this.balanceAfter = balanceAfter;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getPaymentMethod() {
        return this.paymentMethod;
    }
    
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPayUrl() {
        return this.payUrl;
    }
    
    public void setPayUrl(String payUrl) {
        this.payUrl = payUrl;
    }
}
