package com.sdkwork.app.model;

public class WalletOperationStatusVO {
    private String createdAt;
    private String updatedAt;
    private String requestNo;
    private Boolean found;
    private Boolean completed;
    private String status;
    private String statusName;
    private String transactionId;
    private String operationType;
    private String accountType;
    private String processedAt;
    private List<String> relatedTransactionIds;
    private List<HistoryVO> details;
    private String resultDesc;

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

    public Boolean getFound() {
        return this.found;
    }
    
    public void setFound(Boolean found) {
        this.found = found;
    }

    public Boolean getCompleted() {
        return this.completed;
    }
    
    public void setCompleted(Boolean completed) {
        this.completed = completed;
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

    public String getProcessedAt() {
        return this.processedAt;
    }
    
    public void setProcessedAt(String processedAt) {
        this.processedAt = processedAt;
    }

    public List<String> getRelatedTransactionIds() {
        return this.relatedTransactionIds;
    }
    
    public void setRelatedTransactionIds(List<String> relatedTransactionIds) {
        this.relatedTransactionIds = relatedTransactionIds;
    }

    public List<HistoryVO> getDetails() {
        return this.details;
    }
    
    public void setDetails(List<HistoryVO> details) {
        this.details = details;
    }

    public String getResultDesc() {
        return this.resultDesc;
    }
    
    public void setResultDesc(String resultDesc) {
        this.resultDesc = resultDesc;
    }
}
