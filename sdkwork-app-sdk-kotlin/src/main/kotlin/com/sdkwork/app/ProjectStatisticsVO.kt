package com.sdkwork.app

data class ProjectStatisticsVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val projectId: String? = null,
    val totalFiles: Int? = null,
    val totalMembers: Int? = null,
    val totalConversations: Int? = null,
    val documentCount: Int? = null,
    val tagCount: Int? = null,
    val lastActivityTime: String? = null,
    val activityStats: Map<String, Int>? = null,
    val documentTypeStats: Map<String, Int>? = null
)
