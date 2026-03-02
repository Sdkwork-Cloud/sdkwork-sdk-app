package com.sdkwork.app

data class UserSettingsUpdateForm(
    val notificationSettings: NotificationSettings? = null,
    val privacySettings: PrivacySettings? = null,
    val language: String? = null,
    val theme: String? = null,
    val autoPlay: Boolean? = null,
    val highQuality: Boolean? = null,
    val dataSaver: Boolean? = null,
    val downloadSettings: DownloadSettings? = null
)
