package com.sdkwork.app

data class HomeDashboardVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val userInfo: UserInfoVO? = null,
    val statistics: StatisticsVO? = null,
    val shortcuts: List<ShortcutVO>? = null,
    val recentActivities: List<RecentActivityVO>? = null,
    val recentProjects: List<RecentProjectVO>? = null,
    val todoItems: List<TodoItemVO>? = null,
    val recommendations: List<RecommendationVO>? = null,
    val trendingItems: List<TrendingItemVO>? = null,
    val achievements: List<AchievementVO>? = null,
    val notifications: List<PopupNotificationVO>? = null,
    val chartData: List<ChartDataVO>? = null
)
