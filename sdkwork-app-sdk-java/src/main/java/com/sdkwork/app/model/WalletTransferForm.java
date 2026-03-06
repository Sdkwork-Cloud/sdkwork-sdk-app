package com.sdkwork.app.model;

public class WalletTransferForm {
    private String accountType;
    private String toUserId;
    private Double amount;
    private Integer points;
    private String requestNo;
    private String remarks;

    public String getAccountType() {
        return this.accountType;
    }
    
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

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

    public Integer getPoints() {
        return this.points;
    }
    
    public void setPoints(Integer points) {
        this.points = points;
    }

    public String getRequestNo() {
        return this.requestNo;
    }
    
    public void setRequestNo(String requestNo) {
        this.requestNo = requestNo;
    }

    public String getRemarks() {
        return this.remarks;
    }
    
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
