package com.sdkwork.app.model;

public class CheckInRecordVO {
    private String createdAt;
    private String updatedAt;
    private String date;
    private Boolean checkedIn;
    private Boolean isMakeUp;
    private Integer points;
    private Integer consecutiveDays;
    private Map<String, Object> extraRewards;

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

    public String getDate() {
        return this.date;
    }
    
    public void setDate(String date) {
        this.date = date;
    }

    public Boolean getCheckedIn() {
        return this.checkedIn;
    }
    
    public void setCheckedIn(Boolean checkedIn) {
        this.checkedIn = checkedIn;
    }

    public Boolean getIsMakeUp() {
        return this.isMakeUp;
    }
    
    public void setIsMakeUp(Boolean isMakeUp) {
        this.isMakeUp = isMakeUp;
    }

    public Integer getPoints() {
        return this.points;
    }
    
    public void setPoints(Integer points) {
        this.points = points;
    }

    public Integer getConsecutiveDays() {
        return this.consecutiveDays;
    }
    
    public void setConsecutiveDays(Integer consecutiveDays) {
        this.consecutiveDays = consecutiveDays;
    }

    public Map<String, Object> getExtraRewards() {
        return this.extraRewards;
    }
    
    public void setExtraRewards(Map<String, Object> extraRewards) {
        this.extraRewards = extraRewards;
    }
}
