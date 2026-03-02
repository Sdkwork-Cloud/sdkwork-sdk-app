package com.sdkwork.app

data class AudioAsrAuditForm(
    val audioUrl: String? = null,
    val contentId: String? = null,
    val language: String? = null,
    val checkTypes: List<String>? = null,
    val withTimestamp: Boolean? = null
)
