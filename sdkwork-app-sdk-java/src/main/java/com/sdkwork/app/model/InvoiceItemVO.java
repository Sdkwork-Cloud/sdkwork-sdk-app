package com.sdkwork.app.model;

public class InvoiceItemVO {
    private String createdAt;
    private String updatedAt;
    private String itemId;
    private String productName;
    private String specification;
    private String unit;
    private Double quantity;
    private Double unitPriceExcludingTax;
    private Double amountExcludingTax;
    private Double taxAmount;
    private Double totalAmount;
    private Double taxRate;

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

    public String getItemId() {
        return this.itemId;
    }
    
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getProductName() {
        return this.productName;
    }
    
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSpecification() {
        return this.specification;
    }
    
    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public String getUnit() {
        return this.unit;
    }
    
    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Double getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public Double getUnitPriceExcludingTax() {
        return this.unitPriceExcludingTax;
    }
    
    public void setUnitPriceExcludingTax(Double unitPriceExcludingTax) {
        this.unitPriceExcludingTax = unitPriceExcludingTax;
    }

    public Double getAmountExcludingTax() {
        return this.amountExcludingTax;
    }
    
    public void setAmountExcludingTax(Double amountExcludingTax) {
        this.amountExcludingTax = amountExcludingTax;
    }

    public Double getTaxAmount() {
        return this.taxAmount;
    }
    
    public void setTaxAmount(Double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public Double getTotalAmount() {
        return this.totalAmount;
    }
    
    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Double getTaxRate() {
        return this.taxRate;
    }
    
    public void setTaxRate(Double taxRate) {
        this.taxRate = taxRate;
    }
}
