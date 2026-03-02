package com.sdkwork.app

data class AudioAuditForm(
    val audioUrl: String? = null,
    val format: String? = null,
    val contentId: String? = null,
    val duration: Int? = null,
    val checkTypes: List<String>? = null,
    val sampleRate: Int? = null
)
