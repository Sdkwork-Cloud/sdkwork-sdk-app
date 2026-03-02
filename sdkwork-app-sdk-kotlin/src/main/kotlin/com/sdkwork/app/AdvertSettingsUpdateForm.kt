package com.sdkwork.app

data class AdvertSettingsUpdateForm(
    val enabled: Boolean? = null,
    val personalized: Boolean? = null,
    val maxDailyAds: Int? = null,
    val adBlockLevel: String? = null,
    val rewardVideoEnabled: Boolean? = null,
    val interstitialEnabled: Boolean? = null,
    val bannerEnabled: Boolean? = null
)
