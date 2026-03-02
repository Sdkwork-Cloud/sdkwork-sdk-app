package com.sdkwork.app.model;

public class PointsTransferVO {
    private String createdAt;
    private String updatedAt;
    private String transactionId;
    private String fromAccountId;
    private String toAccountId;
    private Integer points;
    private String status;
    private Integer fromPointsAfter;
    private Integer toPointsAfter;

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

    public Integer getPoints() {
        return this.points;
    }
    
    public void setPoints(Integer points) {
        this.points = points;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
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
}
