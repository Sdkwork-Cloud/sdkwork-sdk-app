package com.sdkwork.app

data class MessageQueryForm(
    val conversationId: String? = null,
    val page: Int? = null,
    val size: Int? = null,
    val messageType: String? = null,
    val startTime: String? = null,
    val endTime: String? = null
)
