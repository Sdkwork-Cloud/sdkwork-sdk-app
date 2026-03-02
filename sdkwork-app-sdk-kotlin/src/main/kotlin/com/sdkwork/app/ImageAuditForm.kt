package com.sdkwork.app

data class ImageAuditForm(
    val imageUrl: String? = null,
    val imageBase64: String? = null,
    val contentId: String? = null,
    val contentType: String? = null,
    val checkTypes: List<String>? = null,
    val scene: String? = null,
    val async: Boolean? = null
)
