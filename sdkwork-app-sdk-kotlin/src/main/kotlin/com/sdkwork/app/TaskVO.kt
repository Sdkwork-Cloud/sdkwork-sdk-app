package com.sdkwork.app

data class TaskVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val taskId: String? = null,
    val taskName: String? = null,
    val taskType: String? = null,
    val status: String? = null,
    val progress: Int? = null,
    val total: Int? = null,
    val rewardType: String? = null,
    val rewardAmount: Int? = null,
    val expireAt: String? = null
)
