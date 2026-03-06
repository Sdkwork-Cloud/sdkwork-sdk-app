package com.sdkwork.app

data class FriendRequestVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: String? = null,
    val fromId: String? = null,
    val fromName: String? = null,
    val fromAvatar: String? = null,
    val toId: String? = null,
    val status: String? = null,
    val message: String? = null
)
