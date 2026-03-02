package com.sdkwork.app.model;

public class CashWithdrawVO {
    private String createdAt;
    private String updatedAt;
    private String transactionId;
    private String accountId;
    private Double amount;
    private Double balanceAfter;
    private Double frozenBalance;
    private String status;
    private String estimatedArrivalTime;
    private String withdrawMethod;

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

    public Double getFrozenBalance() {
        return this.frozenBalance;
    }
    
    public void setFrozenBalance(Double frozenBalance) {
        this.frozenBalance = frozenBalance;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getEstimatedArrivalTime() {
        return this.estimatedArrivalTime;
    }
    
    public void setEstimatedArrivalTime(String estimatedArrivalTime) {
        this.estimatedArrivalTime = estimatedArrivalTime;
    }

    public String getWithdrawMethod() {
        return this.withdrawMethod;
    }
    
    public void setWithdrawMethod(String withdrawMethod) {
        this.withdrawMethod = withdrawMethod;
    }
}
