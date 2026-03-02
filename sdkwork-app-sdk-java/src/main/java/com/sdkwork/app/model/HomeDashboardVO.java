package com.sdkwork.app.model;

public class HomeDashboardVO {
    private String createdAt;
    private String updatedAt;
    private UserInfoVO userInfo;
    private StatisticsVO statistics;
    private List<ShortcutVO> shortcuts;
    private List<RecentActivityVO> recentActivities;
    private List<RecentProjectVO> recentProjects;
    private List<TodoItemVO> todoItems;
    private List<RecommendationVO> recommendations;
    private List<TrendingItemVO> trendingItems;
    private List<AchievementVO> achievements;
    private List<PopupNotificationVO> notifications;
    private List<ChartDataVO> chartData;

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

    public UserInfoVO getUserInfo() {
        return this.userInfo;
    }
    
    public void setUserInfo(UserInfoVO userInfo) {
        this.userInfo = userInfo;
    }

    public StatisticsVO getStatistics() {
        return this.statistics;
    }
    
    public void setStatistics(StatisticsVO statistics) {
        this.statistics = statistics;
    }

    public List<ShortcutVO> getShortcuts() {
        return this.shortcuts;
    }
    
    public void setShortcuts(List<ShortcutVO> shortcuts) {
        this.shortcuts = shortcuts;
    }

    public List<RecentActivityVO> getRecentActivities() {
        return this.recentActivities;
    }
    
    public void setRecentActivities(List<RecentActivityVO> recentActivities) {
        this.recentActivities = recentActivities;
    }

    public List<RecentProjectVO> getRecentProjects() {
        return this.recentProjects;
    }
    
    public void setRecentProjects(List<RecentProjectVO> recentProjects) {
        this.recentProjects = recentProjects;
    }

    public List<TodoItemVO> getTodoItems() {
        return this.todoItems;
    }
    
    public void setTodoItems(List<TodoItemVO> todoItems) {
        this.todoItems = todoItems;
    }

    public List<RecommendationVO> getRecommendations() {
        return this.recommendations;
    }
    
    public void setRecommendations(List<RecommendationVO> recommendations) {
        this.recommendations = recommendations;
    }

    public List<TrendingItemVO> getTrendingItems() {
        return this.trendingItems;
    }
    
    public void setTrendingItems(List<TrendingItemVO> trendingItems) {
        this.trendingItems = trendingItems;
    }

    public List<AchievementVO> getAchievements() {
        return this.achievements;
    }
    
    public void setAchievements(List<AchievementVO> achievements) {
        this.achievements = achievements;
    }

    public List<PopupNotificationVO> getNotifications() {
        return this.notifications;
    }
    
    public void setNotifications(List<PopupNotificationVO> notifications) {
        this.notifications = notifications;
    }

    public List<ChartDataVO> getChartData() {
        return this.chartData;
    }
    
    public void setChartData(List<ChartDataVO> chartData) {
        this.chartData = chartData;
    }
}
