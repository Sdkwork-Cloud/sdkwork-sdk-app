package com.sdkwork.app.model;

public class VipPointsHistoryVO {
    private String createdAt;
    private String updatedAt;
    private Integer id;
    private String changeType;
    private Integer changeAmount;
    private Integer beforeBalance;
    private Integer afterBalance;
    private String sourceType;
    private String remark;

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

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getChangeType() {
        return this.changeType;
    }
    
    public void setChangeType(String changeType) {
        this.changeType = changeType;
    }

    public Integer getChangeAmount() {
        return this.changeAmount;
    }
    
    public void setChangeAmount(Integer changeAmount) {
        this.changeAmount = changeAmount;
    }

    public Integer getBeforeBalance() {
        return this.beforeBalance;
    }
    
    public void setBeforeBalance(Integer beforeBalance) {
        this.beforeBalance = beforeBalance;
    }

    public Integer getAfterBalance() {
        return this.afterBalance;
    }
    
    public void setAfterBalance(Integer afterBalance) {
        this.afterBalance = afterBalance;
    }

    public String getSourceType() {
        return this.sourceType;
    }
    
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }
}
