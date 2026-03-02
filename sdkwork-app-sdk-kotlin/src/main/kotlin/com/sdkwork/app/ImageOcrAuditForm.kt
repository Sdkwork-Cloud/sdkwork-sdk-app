package com.sdkwork.app

data class ImageOcrAuditForm(
    val imageUrl: String? = null,
    val contentId: String? = null,
    val checkTypes: List<String>? = null,
    val language: String? = null,
    val returnFullText: Boolean? = null
)
