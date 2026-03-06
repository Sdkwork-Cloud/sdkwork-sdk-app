package com.sdkwork.app.model;

public class PaymentParamsVO {
    private String orderId;
    private String paymentId;
    private String outTradeNo;
    private String amount;
    private String paymentMethod;
    private Map<String, Object> paymentParams;

    public String getOrderId() {
        return this.orderId;
    }
    
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getPaymentId() {
        return this.paymentId;
    }
    
    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getOutTradeNo() {
        return this.outTradeNo;
    }
    
    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
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

    public Map<String, Object> getPaymentParams() {
        return this.paymentParams;
    }
    
    public void setPaymentParams(Map<String, Object> paymentParams) {
        this.paymentParams = paymentParams;
    }
}
