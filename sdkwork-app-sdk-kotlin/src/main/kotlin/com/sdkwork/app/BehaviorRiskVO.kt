package com.sdkwork.app

data class BehaviorRiskVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val userId: String? = null,
    val behaviorType: String? = null,
    val riskLevel: String? = null,
    val riskScore: Int? = null,
    val anomalies: List<AnomalyPattern>? = null,
    val frequencyStats: FrequencyStats? = null,
    val suggestion: String? = null,
    val restrictions: List<String>? = null
)
