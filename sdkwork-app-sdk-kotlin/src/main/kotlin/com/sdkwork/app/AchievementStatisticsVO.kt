package com.sdkwork.app

data class AchievementStatisticsVO(
    val totalAchievements: Int? = null,
    val unlockedAchievements: Int? = null,
    val completionRate: Double? = null,
    val totalPoints: Int? = null,
    val recentAchievements: List<AchievementVO>? = null
)
