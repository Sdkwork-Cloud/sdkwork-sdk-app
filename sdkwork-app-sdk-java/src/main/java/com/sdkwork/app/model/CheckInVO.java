package com.sdkwork.app.model;

public class CheckInVO {
    private String createdAt;
    private String updatedAt;
    private Boolean success;
    private String checkInDate;
    private Integer consecutiveDays;
    private Integer points;
    private Map<String, Object> extraRewards;
    private Boolean checkedInToday;
    private String message;

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

    public Boolean getSuccess() {
        return this.success;
    }
    
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getCheckInDate() {
        return this.checkInDate;
    }
    
    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public Integer getConsecutiveDays() {
        return this.consecutiveDays;
    }
    
    public void setConsecutiveDays(Integer consecutiveDays) {
        this.consecutiveDays = consecutiveDays;
    }

    public Integer getPoints() {
        return this.points;
    }
    
    public void setPoints(Integer points) {
        this.points = points;
    }

    public Map<String, Object> getExtraRewards() {
        return this.extraRewards;
    }
    
    public void setExtraRewards(Map<String, Object> extraRewards) {
        this.extraRewards = extraRewards;
    }

    public Boolean getCheckedInToday() {
        return this.checkedInToday;
    }
    
    public void setCheckedInToday(Boolean checkedInToday) {
        this.checkedInToday = checkedInToday;
    }

    public String getMessage() {
        return this.message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
}
