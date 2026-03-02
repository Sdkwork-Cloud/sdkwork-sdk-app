package com.sdkwork.app

data class NotificationTypeVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val type: String? = null,
    val name: String? = null,
    val enabled: Boolean? = null,
    val pushMethod: String? = null,
    val needReminder: Boolean? = null,
    val description: String? = null
)
