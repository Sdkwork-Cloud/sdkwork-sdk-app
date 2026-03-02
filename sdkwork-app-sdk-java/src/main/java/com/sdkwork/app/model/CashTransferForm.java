package com.sdkwork.app.model;

public class CashTransferForm {
    private String toUserId;
    private Double amount;
    private String remarks;
    private String payPassword;

    public String getToUserId() {
        return this.toUserId;
    }
    
    public void setToUserId(String toUserId) {
        this.toUserId = toUserId;
    }

    public Double getAmount() {
        return this.amount;
    }
    
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getRemarks() {
        return this.remarks;
    }
    
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getPayPassword() {
        return this.payPassword;
    }
    
    public void setPayPassword(String payPassword) {
        this.payPassword = payPassword;
    }
}
