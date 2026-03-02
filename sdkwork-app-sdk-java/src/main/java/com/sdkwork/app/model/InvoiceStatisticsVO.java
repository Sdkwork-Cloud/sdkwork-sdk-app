package com.sdkwork.app.model;

public class InvoiceStatisticsVO {
    private String createdAt;
    private String updatedAt;
    private Integer totalInvoices;
    private Integer pendingInvoices;
    private Integer completedInvoices;
    private Double totalAmount;

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

    public Integer getTotalInvoices() {
        return this.totalInvoices;
    }
    
    public void setTotalInvoices(Integer totalInvoices) {
        this.totalInvoices = totalInvoices;
    }

    public Integer getPendingInvoices() {
        return this.pendingInvoices;
    }
    
    public void setPendingInvoices(Integer pendingInvoices) {
        this.pendingInvoices = pendingInvoices;
    }

    public Integer getCompletedInvoices() {
        return this.completedInvoices;
    }
    
    public void setCompletedInvoices(Integer completedInvoices) {
        this.completedInvoices = completedInvoices;
    }

    public Double getTotalAmount() {
        return this.totalAmount;
    }
    
    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
