package com.sdkwork.app.model;

public class PointsTransferForm {
    private String toUserId;
    private Integer points;
    private String remarks;

    public String getToUserId() {
        return this.toUserId;
    }
    
    public void setToUserId(String toUserId) {
        this.toUserId = toUserId;
    }

    public Integer getPoints() {
        return this.points;
    }
    
    public void setPoints(Integer points) {
        this.points = points;
    }

    public String getRemarks() {
        return this.remarks;
    }
    
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
