package com.sdkwork.app

data class AdvertConfigVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val configId: String? = null,
    val enabled: Boolean? = null,
    val maxAdsPerHour: Int? = null,
    val minInterval: Int? = null,
    val adNetwork: String? = null,
    val apiKey: String? = null,
    val status: String? = null
)
