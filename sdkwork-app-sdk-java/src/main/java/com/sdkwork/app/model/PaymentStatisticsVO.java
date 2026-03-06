package com.sdkwork.app.model;

public class PaymentStatisticsVO {
    private Integer totalPayments;
    private Integer pendingPayments;
    private Integer successPayments;
    private Integer failedPayments;
    private Integer closedPayments;
    private Integer timeoutPayments;

    public Integer getTotalPayments() {
        return this.totalPayments;
    }
    
    public void setTotalPayments(Integer totalPayments) {
        this.totalPayments = totalPayments;
    }

    public Integer getPendingPayments() {
        return this.pendingPayments;
    }
    
    public void setPendingPayments(Integer pendingPayments) {
        this.pendingPayments = pendingPayments;
    }

    public Integer getSuccessPayments() {
        return this.successPayments;
    }
    
    public void setSuccessPayments(Integer successPayments) {
        this.successPayments = successPayments;
    }

    public Integer getFailedPayments() {
        return this.failedPayments;
    }
    
    public void setFailedPayments(Integer failedPayments) {
        this.failedPayments = failedPayments;
    }

    public Integer getClosedPayments() {
        return this.closedPayments;
    }
    
    public void setClosedPayments(Integer closedPayments) {
        this.closedPayments = closedPayments;
    }

    public Integer getTimeoutPayments() {
        return this.timeoutPayments;
    }
    
    public void setTimeoutPayments(Integer timeoutPayments) {
        this.timeoutPayments = timeoutPayments;
    }
}
