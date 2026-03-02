package com.sdkwork.app

data class VipPrivilegeUsageVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val speedUpUsed: Int? = null,
    val speedUpLimit: Int? = null,
    val priorityQueueUsed: Int? = null,
    val priorityQueueLimit: Int? = null,
    val exclusiveModelUsed: Int? = null,
    val exclusiveModelLimit: Int? = null
)
