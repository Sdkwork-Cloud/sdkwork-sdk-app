package com.sdkwork.app

data class SupportMessageRequest(
    val sessionId: String? = null,
    val content: String? = null,
    val attachmentUrl: String? = null
)
