package com.sdkwork.app

data class OperationHistoryVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: String? = null,
    val action: String? = null,
    val description: String? = null,
    val targetType: String? = null,
    val targetId: String? = null,
    val targetName: String? = null,
    val result: String? = null,
    val operationTime: String? = null,
    val ipAddress: String? = null,
    val userAgent: String? = null
)
