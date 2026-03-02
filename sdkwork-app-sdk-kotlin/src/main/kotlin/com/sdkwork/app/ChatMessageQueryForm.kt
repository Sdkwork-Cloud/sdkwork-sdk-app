package com.sdkwork.app

data class ChatMessageQueryForm(
    val sessionId: Int? = null,
    val messageId: Int? = null,
    val page: Int? = null,
    val size: Int? = null,
    val sort: String? = null
)
