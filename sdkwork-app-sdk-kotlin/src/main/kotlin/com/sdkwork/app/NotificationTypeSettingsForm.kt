package com.sdkwork.app

data class NotificationTypeSettingsForm(
    val type: String? = null,
    val enabled: Boolean? = null,
    val pushMethod: String? = null,
    val needReminder: Boolean? = null
)
