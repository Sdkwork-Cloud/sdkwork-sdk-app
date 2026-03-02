package com.sdkwork.app

data class NotificationSettingsUpdateForm(
    val enablePush: Boolean? = null,
    val enableEmail: Boolean? = null,
    val enableSms: Boolean? = null,
    val enableInApp: Boolean? = null,
    val quietHoursStart: String? = null,
    val quietHoursEnd: String? = null,
    val notificationSound: String? = null,
    val vibrationEnabled: Boolean? = null
)
