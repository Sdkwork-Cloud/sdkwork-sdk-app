package com.sdkwork.app.model;

public class RefundApplyForm {
    private String orderId;
    private String refundAmount;
    private String refundReason;
    private String reason;
    private String refundType;
    private String proofImage;

    public String getOrderId() {
        return this.orderId;
    }
    
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getRefundAmount() {
        return this.refundAmount;
    }
    
    public void setRefundAmount(String refundAmount) {
        this.refundAmount = refundAmount;
    }

    public String getRefundReason() {
        return this.refundReason;
    }
    
    public void setRefundReason(String refundReason) {
        this.refundReason = refundReason;
    }

    public String getReason() {
        return this.reason;
    }
    
    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getRefundType() {
        return this.refundType;
    }
    
    public void setRefundType(String refundType) {
        this.refundType = refundType;
    }

    public String getProofImage() {
        return this.proofImage;
    }
    
    public void setProofImage(String proofImage) {
        this.proofImage = proofImage;
    }
}
