package com.sdkwork.app

data class BatchImageAuditForm(
    val images: List<ImageItem>? = null,
    val checkTypes: List<String>? = null,
    val scene: String? = null
)
