package com.sdkwork.app

data class ChatSessionVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val name: String? = null,
    val description: String? = null,
    val type: String? = null,
    val status: String? = null,
    val modelId: String? = null,
    val messageCount: Int? = null,
    val unreadCount: Int? = null,
    val lastMessageTime: String? = null,
    val lastMessageContent: String? = null,
    val createTime: String? = null,
    val updateTime: String? = null
)
