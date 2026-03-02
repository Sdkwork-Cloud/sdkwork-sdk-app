package com.sdkwork.app

data class SendMessageForm(
    val recipientId: String? = null,
    val content: String? = null,
    val messageType: String? = null,
    val conversationId: String? = null,
    val attachmentUrl: String? = null
)
