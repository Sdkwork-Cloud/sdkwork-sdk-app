package com.sdkwork.app

data class PathStepVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val pageUrl: String? = null,
    val pageTitle: String? = null,
    val userCount: Int? = null,
    val percentage: Double? = null,
    val nextSteps: List<PathStepVO>? = null
)
