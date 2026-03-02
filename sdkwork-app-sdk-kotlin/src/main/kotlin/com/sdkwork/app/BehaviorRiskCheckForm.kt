package com.sdkwork.app

data class BehaviorRiskCheckForm(
    val userId: String? = null,
    val behaviorType: String? = null,
    val frequency: Int? = null,
    val context: Map<String, Any>? = null,
    val timeWindow: Int? = null
)
