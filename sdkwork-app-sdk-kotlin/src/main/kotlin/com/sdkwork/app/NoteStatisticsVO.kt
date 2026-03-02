package com.sdkwork.app

data class NoteStatisticsVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val totalNotes: Int? = null,
    val totalFolders: Int? = null,
    val favoritedNotes: Int? = null,
    val thisMonthNotes: Int? = null,
    val thisWeekNotes: Int? = null,
    val todayNotes: Int? = null,
    val totalWords: Int? = null,
    val lastUpdateTime: String? = null,
    val folderNoteCounts: Map<String, Int>? = null,
    val tagUsageCounts: Map<String, Int>? = null
)
