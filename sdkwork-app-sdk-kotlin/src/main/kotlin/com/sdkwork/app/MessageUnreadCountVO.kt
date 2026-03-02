package com.sdkwork.app

data class MessageUnreadCountVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val totalUnread: Int? = null,
    val privateUnread: Int? = null,
    val systemUnread: Int? = null
)
