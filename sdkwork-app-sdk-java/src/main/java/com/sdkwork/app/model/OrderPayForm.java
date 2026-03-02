package com.sdkwork.app.model;

public class OrderPayForm {
    private String orderId;
    private String paymentMethod;
    private String amount;
    private String paymentPassword;
    private String clientIp;

    public String getOrderId() {
        return this.orderId;
    }
    
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getPaymentMethod() {
        return this.paymentMethod;
    }
    
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getAmount() {
        return this.amount;
    }
    
    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getPaymentPassword() {
        return this.paymentPassword;
    }
    
    public void setPaymentPassword(String paymentPassword) {
        this.paymentPassword = paymentPassword;
    }

    public String getClientIp() {
        return this.clientIp;
    }
    
    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }
}
