package com.sdkwork.app

data class ContentAuditForm(
    val contentId: String? = null,
    val textContent: String? = null,
    val imageUrls: List<String>? = null,
    val videoUrl: String? = null,
    val audioUrl: String? = null,
    val contentType: String? = null,
    val scene: String? = null,
    val checkTypes: List<String>? = null,
    val metadata: Map<String, Any>? = null,
    val userId: String? = null
)
