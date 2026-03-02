package com.sdkwork.app.model;

public class LotteryDetailVO {
    private String createdAt;
    private String updatedAt;
    private String id;
    private String title;
    private String description;
    private String rules;
    private String startTime;
    private String endTime;
    private Integer freeDrawCount;
    private Integer remainingFreeCount;
    private Integer pointsCost;
    private Integer myPoints;
    private List<LotteryPrize> prizes;
    private List<RecentWinner> recentWinners;

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

    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public String getRules() {
        return this.rules;
    }
    
    public void setRules(String rules) {
        this.rules = rules;
    }

    public String getStartTime() {
        return this.startTime;
    }
    
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return this.endTime;
    }
    
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Integer getFreeDrawCount() {
        return this.freeDrawCount;
    }
    
    public void setFreeDrawCount(Integer freeDrawCount) {
        this.freeDrawCount = freeDrawCount;
    }

    public Integer getRemainingFreeCount() {
        return this.remainingFreeCount;
    }
    
    public void setRemainingFreeCount(Integer remainingFreeCount) {
        this.remainingFreeCount = remainingFreeCount;
    }

    public Integer getPointsCost() {
        return this.pointsCost;
    }
    
    public void setPointsCost(Integer pointsCost) {
        this.pointsCost = pointsCost;
    }

    public Integer getMyPoints() {
        return this.myPoints;
    }
    
    public void setMyPoints(Integer myPoints) {
        this.myPoints = myPoints;
    }

    public List<LotteryPrize> getPrizes() {
        return this.prizes;
    }
    
    public void setPrizes(List<LotteryPrize> prizes) {
        this.prizes = prizes;
    }

    public List<RecentWinner> getRecentWinners() {
        return this.recentWinners;
    }
    
    public void setRecentWinners(List<RecentWinner> recentWinners) {
        this.recentWinners = recentWinners;
    }
}
