package com.sdkwork.app

data class NotificationVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val notificationId: String? = null,
    val title: String? = null,
    val content: String? = null,
    val type: String? = null,
    val status: String? = null,
    val source: String? = null,
    val link: String? = null,
    val isRead: Boolean? = null,
    val readAt: String? = null
)
