package com.sdkwork.app

data class VideoAuditForm(
    val videoUrl: String? = null,
    val contentId: String? = null,
    val title: String? = null,
    val description: String? = null,
    val contentType: String? = null,
    val checkTypes: List<String>? = null,
    val callbackUrl: String? = null,
    val duration: Int? = null
)
