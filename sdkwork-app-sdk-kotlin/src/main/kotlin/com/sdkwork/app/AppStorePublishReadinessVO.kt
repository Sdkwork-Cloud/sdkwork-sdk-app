package com.sdkwork.app

data class AppStorePublishReadinessVO(
    val platform: String? = null,
    val ready: Boolean? = null,
    val missingFields: List<String>? = null
)
