package com.sdkwork.app

data class AuditPolicyVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val policyId: String? = null,
    val name: String? = null,
    val description: String? = null,
    val scenes: List<String>? = null,
    val detectionTypes: List<DetectionTypeConfig>? = null,
    val thresholds: Map<String, Double>? = null,
    val enabled: Boolean? = null,
    val priority: Int? = null
)
