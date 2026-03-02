package com.sdkwork.app

data class PopupNotificationVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: String? = null,
    val title: String? = null,
    val content: String? = null,
    val type: String? = null,
    val icon: String? = null,
    val image: String? = null,
    val url: String? = null,
    val buttons: List<NotificationButtonVO>? = null,
    val needConfirm: Boolean? = null,
    val closable: Boolean? = null,
    val duration: Int? = null,
    val priority: Int? = null
)
