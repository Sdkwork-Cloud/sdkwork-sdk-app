package com.sdkwork.app

data class FeatureFlagVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val featureKey: String? = null,
    val featureName: String? = null,
    val enabled: Boolean? = null,
    val value: Any? = null,
    val description: String? = null
)
