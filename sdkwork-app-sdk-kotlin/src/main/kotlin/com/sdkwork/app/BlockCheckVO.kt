package com.sdkwork.app

data class BlockCheckVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val isBlocked: Boolean? = null,
    val blockTime: String? = null,
    val blockReason: String? = null
)
