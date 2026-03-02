package com.sdkwork.app

data class ActivityRecordVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: String? = null,
    val activityId: String? = null,
    val activityTitle: String? = null,
    val activityType: String? = null,
    val participateTime: String? = null,
    val status: String? = null,
    val result: String? = null,
    val rewards: Map<String, Any>? = null
)
