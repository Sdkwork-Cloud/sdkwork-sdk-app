package com.sdkwork.app

data class AiUsageStatsVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val statsId: String? = null,
    val modelName: String? = null,
    val promptTokens: Int? = null,
    val completionTokens: Int? = null,
    val totalTokens: Int? = null,
    val requestCount: Int? = null,
    val errorCount: Int? = null,
    val date: String? = null,
    val userId: String? = null
)
