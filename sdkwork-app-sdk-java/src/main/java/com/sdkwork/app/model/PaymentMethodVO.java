package com.sdkwork.app.model;

public class PaymentMethodVO {
    private String createdAt;
    private String updatedAt;
    private String code;
    private String methodId;
    private String methodName;
    private String methodIcon;
    private Boolean enabled;
    private Integer sort;
    private String icon;
    private Boolean available;
    private List<PaymentProductTypeVO> productTypes;

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

    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }

    public String getMethodId() {
        return this.methodId;
    }
    
    public void setMethodId(String methodId) {
        this.methodId = methodId;
    }

    public String getMethodName() {
        return this.methodName;
    }
    
    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public String getMethodIcon() {
        return this.methodIcon;
    }
    
    public void setMethodIcon(String methodIcon) {
        this.methodIcon = methodIcon;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }
    
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Integer getSort() {
        return this.sort;
    }
    
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getIcon() {
        return this.icon;
    }
    
    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Boolean getAvailable() {
        return this.available;
    }
    
    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public List<PaymentProductTypeVO> getProductTypes() {
        return this.productTypes;
    }
    
    public void setProductTypes(List<PaymentProductTypeVO> productTypes) {
        this.productTypes = productTypes;
    }
}
