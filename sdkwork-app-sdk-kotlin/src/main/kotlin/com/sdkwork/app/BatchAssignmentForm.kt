package com.sdkwork.app

data class BatchAssignmentForm(
    val experimentKeys: List<String>? = null,
    val userAttributes: Map<String, Any>? = null
)
