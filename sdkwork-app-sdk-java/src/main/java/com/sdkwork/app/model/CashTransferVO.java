package com.sdkwork.app.model;

public class CashTransferVO {
    private String createdAt;
    private String updatedAt;
    private String transactionId;
    private String fromAccountId;
    private String toAccountId;
    private Double amount;
    private String status;
    private Double fromBalanceAfter;
    private Double toBalanceAfter;

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

    public String getFromAccountId() {
        return this.fromAccountId;
    }
    
    public void setFromAccountId(String fromAccountId) {
        this.fromAccountId = fromAccountId;
    }

    public String getToAccountId() {
        return this.toAccountId;
    }
    
    public void setToAccountId(String toAccountId) {
        this.toAccountId = toAccountId;
    }

    public Double getAmount() {
        return this.amount;
    }
    
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public Double getFromBalanceAfter() {
        return this.fromBalanceAfter;
    }
    
    public void setFromBalanceAfter(Double fromBalanceAfter) {
        this.fromBalanceAfter = fromBalanceAfter;
    }

    public Double getToBalanceAfter() {
        return this.toBalanceAfter;
    }
    
    public void setToBalanceAfter(Double toBalanceAfter) {
        this.toBalanceAfter = toBalanceAfter;
    }
}
