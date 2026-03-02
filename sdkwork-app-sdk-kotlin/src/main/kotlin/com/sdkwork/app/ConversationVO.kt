package com.sdkwork.app

data class ConversationVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val conversationId: String? = null,
    val conversationType: String? = null,
    val otherUserId: String? = null,
    val otherUsername: String? = null,
    val otherNickname: String? = null,
    val otherAvatar: String? = null,
    val lastMessage: String? = null,
    val lastMessageTime: String? = null,
    val unreadCount: Int? = null,
    val isTop: Boolean? = null
)
