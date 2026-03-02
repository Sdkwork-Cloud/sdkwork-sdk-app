package com.sdkwork.app

data class UserStatisticsVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val userId: String? = null,
    val username: String? = null,
    val avatar: String? = null,
    val registeredAt: String? = null,
    val lastLoginAt: String? = null,
    val loginCount: Int? = null,
    val totalUsageTime: Int? = null,
    val totalGenerations: Int? = null,
    val totalProjects: Int? = null,
    val totalFiles: Int? = null,
    val totalStorage: Int? = null,
    val level: UserLevelVO? = null,
    val vipInfo: VipStatisticsVO? = null,
    val achievementStats: AchievementStatisticsVO? = null,
    val usageStats: UsageStatisticsVO? = null,
    val generationStats: GenerationStatisticsVO? = null
)
