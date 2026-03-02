package com.sdkwork.app

data class UserSettingsVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val theme: String? = null,
    val language: String? = null,
    val notificationSettings: NotificationSettingsVO? = null,
    val privacySettings: PrivacySettingsVO? = null
)
