package com.sdkwork.app

data class AppPublishReadinessVO(
    val ready: Boolean? = null,
    val missingFields: List<String>? = null,
    val stores: List<AppStorePublishReadinessVO>? = null
)
