package com.sdkwork.app

data class FollowCheckVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val isFollowing: Boolean? = null,
    val followTime: String? = null,
    val isFollowedBy: Boolean? = null
)
