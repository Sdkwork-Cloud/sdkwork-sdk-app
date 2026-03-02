package com.sdkwork.app

data class HistoryStatisticsVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val browseCount: Int? = null,
    val operationCount: Int? = null,
    val generationCount: Int? = null,
    val loginCount: Int? = null,
    val activeSessionCount: Int? = null,
    val todayOperationCount: Int? = null,
    val weeklyOperationCount: Int? = null,
    val monthlyOperationCount: Int? = null,
    val mostFrequentAction: String? = null,
    val mostFrequentBrowseType: String? = null
)
