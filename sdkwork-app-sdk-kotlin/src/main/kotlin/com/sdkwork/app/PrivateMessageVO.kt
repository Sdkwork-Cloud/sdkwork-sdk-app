package com.sdkwork.app

data class PrivateMessageVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val messageId: String? = null,
    val senderId: String? = null,
    val recipientId: String? = null,
    val content: String? = null,
    val messageType: String? = null,
    val sendTime: String? = null,
    val isRead: Boolean? = null,
    val attachmentUrl: String? = null
)
