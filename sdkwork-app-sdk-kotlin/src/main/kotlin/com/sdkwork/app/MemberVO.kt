package com.sdkwork.app

data class MemberVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val memberId: String? = null,
    val userId: String? = null,
    val username: String? = null,
    val nickname: String? = null,
    val avatar: String? = null,
    val email: String? = null,
    val roleId: String? = null,
    val roleName: String? = null,
    val permissions: List<String>? = null,
    val joinTime: String? = null,
    val lastActiveTime: String? = null,
    val status: String? = null,
    val isCreator: Boolean? = null,
    val isAdmin: Boolean? = null
)
