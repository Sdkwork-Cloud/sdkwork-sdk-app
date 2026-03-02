package com.sdkwork.app

data class BlockedUserVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val userId: String? = null,
    val username: String? = null,
    val nickname: String? = null,
    val avatar: String? = null,
    val blockTime: String? = null,
    val blockReason: String? = null
)
