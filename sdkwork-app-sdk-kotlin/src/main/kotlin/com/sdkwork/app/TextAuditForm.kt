package com.sdkwork.app

data class TextAuditForm(
    val content: String? = null,
    val contentId: String? = null,
    val contentType: String? = null,
    val scene: String? = null,
    val userId: String? = null,
    val checkTypes: List<String>? = null,
    val async: Boolean? = null
)
