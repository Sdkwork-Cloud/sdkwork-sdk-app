package com.sdkwork.app

data class SearchStatisticsVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val totalSearches: Int? = null,
    val todaySearches: Int? = null,
    val thisWeekSearches: Int? = null,
    val thisMonthSearches: Int? = null,
    val hotKeywords: Map<String, Int>? = null,
    val typeDistribution: Map<String, Int>? = null,
    val lastSearchTime: String? = null
)
