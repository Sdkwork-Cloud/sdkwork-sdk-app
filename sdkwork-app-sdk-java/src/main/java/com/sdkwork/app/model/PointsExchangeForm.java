package com.sdkwork.app.model;

public class PointsExchangeForm {
    private Integer quantity;
    private String addressId;
    private String remark;

    public Integer getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getAddressId() {
        return this.addressId;
    }
    
    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }
}
