package com.sdkwork.app.model;

public class OrderCancelForm {
    private String orderId;
    private String cancelReason;
    private String reason;
    private String cancelType;

    public String getOrderId() {
        return this.orderId;
    }
    
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCancelReason() {
        return this.cancelReason;
    }
    
    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }

    public String getReason() {
        return this.reason;
    }
    
    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getCancelType() {
        return this.cancelType;
    }
    
    public void setCancelType(String cancelType) {
        this.cancelType = cancelType;
    }
}
