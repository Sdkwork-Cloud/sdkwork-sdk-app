package com.sdkwork.app

data class BatchTextAuditForm(
    val items: List<TextItem>? = null,
    val checkTypes: List<String>? = null,
    val scene: String? = null
)
