package com.sdkwork.app

data class ChatSessionDetailVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val name: String? = null,
    val description: String? = null,
    val type: String? = null,
    val status: String? = null,
    val userId: String? = null,
    val modelId: String? = null,
    val systemPrompt: String? = null,
    val temperature: Double? = null,
    val maxTokens: Int? = null,
    val topP: Double? = null,
    val messageCount: Int? = null,
    val unreadCount: Int? = null,
    val lastMessageTime: String? = null,
    val lastMessageContent: String? = null,
    val resourceId: String? = null,
    val resourceType: String? = null,
    val createTime: String? = null,
    val updateTime: String? = null,
    val extra: Map<String, Any>? = null,
    val stats: SessionStatsVO? = null
)
