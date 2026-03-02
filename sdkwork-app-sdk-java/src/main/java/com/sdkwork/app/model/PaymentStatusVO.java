package com.sdkwork.app.model;

public class PaymentStatusVO {
    private String createdAt;
    private String updatedAt;
    private String paymentOrderId;
    private String merchantOrderId;
    private String status;
    private String statusName;
    private String amount;
    private Integer payTime;
    private String paymentMethod;
    private Integer paymentId;
    private String paymentSn;
    private Integer orderId;
    private String paymentProvider;
    private String transactionId;
    private String outTradeNo;
    private String successTime;

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

    public String getPaymentOrderId() {
        return this.paymentOrderId;
    }
    
    public void setPaymentOrderId(String paymentOrderId) {
        this.paymentOrderId = paymentOrderId;
    }

    public String getMerchantOrderId() {
        return this.merchantOrderId;
    }
    
    public void setMerchantOrderId(String merchantOrderId) {
        this.merchantOrderId = merchantOrderId;
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

    public String getAmount() {
        return this.amount;
    }
    
    public void setAmount(String amount) {
        this.amount = amount;
    }

    public Integer getPayTime() {
        return this.payTime;
    }
    
    public void setPayTime(Integer payTime) {
        this.payTime = payTime;
    }

    public String getPaymentMethod() {
        return this.paymentMethod;
    }
    
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Integer getPaymentId() {
        return this.paymentId;
    }
    
    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    public String getPaymentSn() {
        return this.paymentSn;
    }
    
    public void setPaymentSn(String paymentSn) {
        this.paymentSn = paymentSn;
    }

    public Integer getOrderId() {
        return this.orderId;
    }
    
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getPaymentProvider() {
        return this.paymentProvider;
    }
    
    public void setPaymentProvider(String paymentProvider) {
        this.paymentProvider = paymentProvider;
    }

    public String getTransactionId() {
        return this.transactionId;
    }
    
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getOutTradeNo() {
        return this.outTradeNo;
    }
    
    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public String getSuccessTime() {
        return this.successTime;
    }
    
    public void setSuccessTime(String successTime) {
        this.successTime = successTime;
    }
}
