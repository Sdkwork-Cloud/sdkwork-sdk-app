package com.sdkwork.app.model;

public class CheckInStatusVO {
    private String createdAt;
    private String updatedAt;
    private Boolean checkedInToday;
    private Integer consecutiveDays;
    private Integer monthlyCheckInCount;
    private List<String> monthlyCheckInDates;
    private List<String> missedDates;
    private CheckInReward todayReward;
    private CheckInReward tomorrowReward;
    private Integer makeUpCost;
    private Integer remainingMakeUpCount;

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

    public Boolean getCheckedInToday() {
        return this.checkedInToday;
    }
    
    public void setCheckedInToday(Boolean checkedInToday) {
        this.checkedInToday = checkedInToday;
    }

    public Integer getConsecutiveDays() {
        return this.consecutiveDays;
    }
    
    public void setConsecutiveDays(Integer consecutiveDays) {
        this.consecutiveDays = consecutiveDays;
    }

    public Integer getMonthlyCheckInCount() {
        return this.monthlyCheckInCount;
    }
    
    public void setMonthlyCheckInCount(Integer monthlyCheckInCount) {
        this.monthlyCheckInCount = monthlyCheckInCount;
    }

    public List<String> getMonthlyCheckInDates() {
        return this.monthlyCheckInDates;
    }
    
    public void setMonthlyCheckInDates(List<String> monthlyCheckInDates) {
        this.monthlyCheckInDates = monthlyCheckInDates;
    }

    public List<String> getMissedDates() {
        return this.missedDates;
    }
    
    public void setMissedDates(List<String> missedDates) {
        this.missedDates = missedDates;
    }

    public CheckInReward getTodayReward() {
        return this.todayReward;
    }
    
    public void setTodayReward(CheckInReward todayReward) {
        this.todayReward = todayReward;
    }

    public CheckInReward getTomorrowReward() {
        return this.tomorrowReward;
    }
    
    public void setTomorrowReward(CheckInReward tomorrowReward) {
        this.tomorrowReward = tomorrowReward;
    }

    public Integer getMakeUpCost() {
        return this.makeUpCost;
    }
    
    public void setMakeUpCost(Integer makeUpCost) {
        this.makeUpCost = makeUpCost;
    }

    public Integer getRemainingMakeUpCount() {
        return this.remainingMakeUpCount;
    }
    
    public void setRemainingMakeUpCount(Integer remainingMakeUpCount) {
        this.remainingMakeUpCount = remainingMakeUpCount;
    }
}
