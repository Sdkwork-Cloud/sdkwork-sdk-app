package com.sdkwork.app

data class NotificationSettingsVO(
    val system: Boolean? = null,
    val message: Boolean? = null,
    val activity: Boolean? = null,
    val promotion: Boolean? = null,
    val sound: Boolean? = null,
    val vibration: Boolean? = null
)
