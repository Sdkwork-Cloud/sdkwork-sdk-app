package com.sdkwork.app.model;

public class UserStatisticsVO {
    private String createdAt;
    private String updatedAt;
    private String userId;
    private String username;
    private String avatar;
    private String registeredAt;
    private String lastLoginAt;
    private Integer loginCount;
    private Integer totalUsageTime;
    private Integer totalGenerations;
    private Integer totalProjects;
    private Integer totalFiles;
    private Integer totalStorage;
    private UserLevelVO level;
    private VipStatisticsVO vipInfo;
    private AchievementStatisticsVO achievementStats;
    private UsageStatisticsVO usageStats;
    private GenerationStatisticsVO generationStats;

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

    public String getUserId() {
        return this.userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    public String getAvatar() {
        return this.avatar;
    }
    
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getRegisteredAt() {
        return this.registeredAt;
    }
    
    public void setRegisteredAt(String registeredAt) {
        this.registeredAt = registeredAt;
    }

    public String getLastLoginAt() {
        return this.lastLoginAt;
    }
    
    public void setLastLoginAt(String lastLoginAt) {
        this.lastLoginAt = lastLoginAt;
    }

    public Integer getLoginCount() {
        return this.loginCount;
    }
    
    public void setLoginCount(Integer loginCount) {
        this.loginCount = loginCount;
    }

    public Integer getTotalUsageTime() {
        return this.totalUsageTime;
    }
    
    public void setTotalUsageTime(Integer totalUsageTime) {
        this.totalUsageTime = totalUsageTime;
    }

    public Integer getTotalGenerations() {
        return this.totalGenerations;
    }
    
    public void setTotalGenerations(Integer totalGenerations) {
        this.totalGenerations = totalGenerations;
    }

    public Integer getTotalProjects() {
        return this.totalProjects;
    }
    
    public void setTotalProjects(Integer totalProjects) {
        this.totalProjects = totalProjects;
    }

    public Integer getTotalFiles() {
        return this.totalFiles;
    }
    
    public void setTotalFiles(Integer totalFiles) {
        this.totalFiles = totalFiles;
    }

    public Integer getTotalStorage() {
        return this.totalStorage;
    }
    
    public void setTotalStorage(Integer totalStorage) {
        this.totalStorage = totalStorage;
    }

    public UserLevelVO getLevel() {
        return this.level;
    }
    
    public void setLevel(UserLevelVO level) {
        this.level = level;
    }

    public VipStatisticsVO getVipInfo() {
        return this.vipInfo;
    }
    
    public void setVipInfo(VipStatisticsVO vipInfo) {
        this.vipInfo = vipInfo;
    }

    public AchievementStatisticsVO getAchievementStats() {
        return this.achievementStats;
    }
    
    public void setAchievementStats(AchievementStatisticsVO achievementStats) {
        this.achievementStats = achievementStats;
    }

    public UsageStatisticsVO getUsageStats() {
        return this.usageStats;
    }
    
    public void setUsageStats(UsageStatisticsVO usageStats) {
        this.usageStats = usageStats;
    }

    public GenerationStatisticsVO getGenerationStats() {
        return this.generationStats;
    }
    
    public void setGenerationStats(GenerationStatisticsVO generationStats) {
        this.generationStats = generationStats;
    }
}
