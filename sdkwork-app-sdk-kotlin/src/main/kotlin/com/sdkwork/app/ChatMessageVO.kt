package com.sdkwork.app

data class ChatMessageVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val sessionId: Int? = null,
    val content: String? = null,
    val type: String? = null,
    val format: String? = null,
    val status: String? = null,
    val senderType: String? = null,
    val senderId: String? = null,
    val receiverId: String? = null,
    val quoteMessageId: Int? = null,
    val thinking: String? = null,
    val modelId: String? = null,
    val responseTime: Int? = null,
    val tokenCount: Int? = null,
    val attachments: List<AttachmentVO>? = null,
    val createTime: String? = null,
    val updateTime: String? = null
)
