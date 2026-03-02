package com.sdkwork.app

data class PrivacySettingsUpdateForm(
    val dataCollectionEnabled: Boolean? = null,
    val personalizedRecommendationsEnabled: Boolean? = null,
    val thirdPartyAnalyticsEnabled: Boolean? = null,
    val notificationsEnabled: Boolean? = null,
    val usageDataSharingEnabled: Boolean? = null,
    val autoSaveEnabled: Boolean? = null,
    val dataRetentionDays: Int? = null,
    val aiLearningEnabled: Boolean? = null
)
