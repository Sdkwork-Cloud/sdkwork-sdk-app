package com.sdkwork.app

data class BrowseHistoryAddForm(
    val type: String? = null,
    val targetId: String? = null,
    val targetName: String? = null,
    val targetDescription: String? = null,
    val targetIcon: String? = null,
    val duration: Int? = null,
    val source: String? = null
)
