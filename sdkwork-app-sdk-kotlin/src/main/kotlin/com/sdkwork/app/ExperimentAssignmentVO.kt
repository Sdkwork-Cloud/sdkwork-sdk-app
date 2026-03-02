package com.sdkwork.app

data class ExperimentAssignmentVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val experimentKey: String? = null,
    val variantKey: String? = null,
    val variantName: String? = null,
    val assignmentReason: String? = null,
    val assignmentParams: Map<String, Any>? = null
)
