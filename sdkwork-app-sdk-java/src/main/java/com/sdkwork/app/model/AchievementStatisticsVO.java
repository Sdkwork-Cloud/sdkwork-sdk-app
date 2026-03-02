package com.sdkwork.app.model;

public class AchievementStatisticsVO {
    private Integer totalAchievements;
    private Integer unlockedAchievements;
    private Double completionRate;
    private Integer totalPoints;
    private List<AchievementVO> recentAchievements;

    public Integer getTotalAchievements() {
        return this.totalAchievements;
    }
    
    public void setTotalAchievements(Integer totalAchievements) {
        this.totalAchievements = totalAchievements;
    }

    public Integer getUnlockedAchievements() {
        return this.unlockedAchievements;
    }
    
    public void setUnlockedAchievements(Integer unlockedAchievements) {
        this.unlockedAchievements = unlockedAchievements;
    }

    public Double getCompletionRate() {
        return this.completionRate;
    }
    
    public void setCompletionRate(Double completionRate) {
        this.completionRate = completionRate;
    }

    public Integer getTotalPoints() {
        return this.totalPoints;
    }
    
    public void setTotalPoints(Integer totalPoints) {
        this.totalPoints = totalPoints;
    }

    public List<AchievementVO> getRecentAchievements() {
        return this.recentAchievements;
    }
    
    public void setRecentAchievements(List<AchievementVO> recentAchievements) {
        this.recentAchievements = recentAchievements;
    }
}
