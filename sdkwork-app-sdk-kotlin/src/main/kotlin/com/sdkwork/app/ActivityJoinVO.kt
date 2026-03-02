package com.sdkwork.app

data class ActivityJoinVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val recordId: String? = null,
    val success: Boolean? = null,
    val result: String? = null,
    val rewards: Map<String, Any>? = null,
    val remainingCount: Int? = null,
    val message: String? = null
)
