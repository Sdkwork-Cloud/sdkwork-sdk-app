package com.sdkwork.app

data class FollowUserVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val userId: String? = null,
    val username: String? = null,
    val nickname: String? = null,
    val avatar: String? = null,
    val followTime: String? = null,
    val isMutual: Boolean? = null
)
