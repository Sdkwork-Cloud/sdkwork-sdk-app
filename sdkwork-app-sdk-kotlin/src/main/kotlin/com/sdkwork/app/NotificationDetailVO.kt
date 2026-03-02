package com.sdkwork.app

data class NotificationDetailVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val notificationId: String? = null,
    val title: String? = null,
    val content: String? = null,
    val type: String? = null,
    val status: String? = null,
    val source: String? = null,
    val redirectUrl: String? = null,
    val isRead: Boolean? = null,
    val readAt: String? = null,
    val extraData: Map<String, Any>? = null
)
