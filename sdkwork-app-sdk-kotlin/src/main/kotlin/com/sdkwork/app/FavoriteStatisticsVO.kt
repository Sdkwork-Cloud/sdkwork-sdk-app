package com.sdkwork.app

data class FavoriteStatisticsVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val totalCount: Int? = null,
    val folderCount: Int? = null,
    val monthlyAdded: Int? = null,
    val lastFavoritedTime: String? = null,
    val countByType: Map<String, Int>? = null
)
