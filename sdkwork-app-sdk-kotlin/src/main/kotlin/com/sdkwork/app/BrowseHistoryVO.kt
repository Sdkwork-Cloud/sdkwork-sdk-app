package com.sdkwork.app

data class BrowseHistoryVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: String? = null,
    val type: String? = null,
    val targetId: String? = null,
    val targetName: String? = null,
    val targetDescription: String? = null,
    val targetIcon: String? = null,
    val browseTime: String? = null,
    val duration: Int? = null,
    val source: String? = null
)
