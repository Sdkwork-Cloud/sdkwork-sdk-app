package com.sdkwork.app

data class ChatExportForm(
    val format: String? = null,
    val scope: String? = null,
    val count: Int? = null,
    val includeThinking: Boolean? = null,
    val includeSystemMessages: Boolean? = null,
    val includeAttachments: Boolean? = null,
    val fileName: String? = null
)
