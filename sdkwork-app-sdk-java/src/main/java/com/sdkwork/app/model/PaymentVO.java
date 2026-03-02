package com.sdkwork.app.model;

public class PaymentVO {
    private String createdAt;
    private String updatedAt;
    private String paymentOrderId;
    private String merchantOrderId;
    private String status;
    private String amount;
    private String paymentMethod;
    private String paymentUrl;
    private String qrCode;
    private Integer paymentId;
    private String paymentSn;
    private Integer orderId;
    private String subject;
    private String paymentProvider;
    private String paymentProviderName;
    private String productType;
    private String productTypeName;
    private String statusName;
    private String expireTime;
    private Boolean needQuery;
    private Integer queryInterval;
    private String remark;
    private Map<String, Object> paymentParams;
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

    public String getAmount() {
        return this.amount;
    }
    
    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getPaymentMethod() {
        return this.paymentMethod;
    }
    
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentUrl() {
        return this.paymentUrl;
    }
    
    public void setPaymentUrl(String paymentUrl) {
        this.paymentUrl = paymentUrl;
    }

    public String getQrCode() {
        return this.qrCode;
    }
    
    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
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

    public String getSubject() {
        return this.subject;
    }
    
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getPaymentProvider() {
        return this.paymentProvider;
    }
    
    public void setPaymentProvider(String paymentProvider) {
        this.paymentProvider = paymentProvider;
    }

    public String getPaymentProviderName() {
        return this.paymentProviderName;
    }
    
    public void setPaymentProviderName(String paymentProviderName) {
        this.paymentProviderName = paymentProviderName;
    }

    public String getProductType() {
        return this.productType;
    }
    
    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductTypeName() {
        return this.productTypeName;
    }
    
    public void setProductTypeName(String productTypeName) {
        this.productTypeName = productTypeName;
    }

    public String getStatusName() {
        return this.statusName;
    }
    
    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public String getExpireTime() {
        return this.expireTime;
    }
    
    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public Boolean getNeedQuery() {
        return this.needQuery;
    }
    
    public void setNeedQuery(Boolean needQuery) {
        this.needQuery = needQuery;
    }

    public Integer getQueryInterval() {
        return this.queryInterval;
    }
    
    public void setQueryInterval(Integer queryInterval) {
        this.queryInterval = queryInterval;
    }

    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Map<String, Object> getPaymentParams() {
        return this.paymentParams;
    }
    
    public void setPaymentParams(Map<String, Object> paymentParams) {
        this.paymentParams = paymentParams;
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
