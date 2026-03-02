package com.sdkwork.app

data class SessionStatsVO(
    val totalMessages: Int? = null,
    val userMessages: Int? = null,
    val aiMessages: Int? = null,
    val totalTokens: Int? = null,
    val avgResponseTime: Int? = null,
    val totalDuration: Int? = null
)
