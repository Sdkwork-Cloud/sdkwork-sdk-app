package com.sdkwork.app.model;

public class WalletOperationResultVO {
    private String createdAt;
    private String updatedAt;
    private String requestNo;
    private String transactionId;
    private String operationType;
    private String accountType;
    private String status;
    private String statusName;
    private String fromAccountId;
    private String toAccountId;
    private Double amount;
    private Integer points;
    private Integer tokens;
    private Double fromBalanceAfter;
    private Double toBalanceAfter;
    private Integer fromPointsAfter;
    private Integer toPointsAfter;
    private Integer tokenAfter;
    private Double frozenBalance;
    private String channel;
    private String resultDesc;
    private String processedAt;

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

    public String getRequestNo() {
        return this.requestNo;
    }
    
    public void setRequestNo(String requestNo) {
        this.requestNo = requestNo;
    }

    public String getTransactionId() {
        return this.transactionId;
    }
    
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getOperationType() {
        return this.operationType;
    }
    
    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public String getAccountType() {
        return this.accountType;
    }
    
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusName() {
        return this.statusName;
    }
    
    public void setStatusName(String statusName) {
        this.statusName = statusName;
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

    public Integer getPoints() {
        return this.points;
    }
    
    public void setPoints(Integer points) {
        this.points = points;
    }

    public Integer getTokens() {
        return this.tokens;
    }
    
    public void setTokens(Integer tokens) {
        this.tokens = tokens;
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

    public Integer getFromPointsAfter() {
        return this.fromPointsAfter;
    }
    
    public void setFromPointsAfter(Integer fromPointsAfter) {
        this.fromPointsAfter = fromPointsAfter;
    }

    public Integer getToPointsAfter() {
        return this.toPointsAfter;
    }
    
    public void setToPointsAfter(Integer toPointsAfter) {
        this.toPointsAfter = toPointsAfter;
    }

    public Integer getTokenAfter() {
        return this.tokenAfter;
    }
    
    public void setTokenAfter(Integer tokenAfter) {
        this.tokenAfter = tokenAfter;
    }

    public Double getFrozenBalance() {
        return this.frozenBalance;
    }
    
    public void setFrozenBalance(Double frozenBalance) {
        this.frozenBalance = frozenBalance;
    }

    public String getChannel() {
        return this.channel;
    }
    
    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getResultDesc() {
        return this.resultDesc;
    }
    
    public void setResultDesc(String resultDesc) {
        this.resultDesc = resultDesc;
    }

    public String getProcessedAt() {
        return this.processedAt;
    }
    
    public void setProcessedAt(String processedAt) {
        this.processedAt = processedAt;
    }
}
