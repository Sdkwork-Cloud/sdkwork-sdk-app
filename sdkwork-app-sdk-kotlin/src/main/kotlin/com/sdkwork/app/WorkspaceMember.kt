package com.sdkwork.app

data class WorkspaceMember(
    val userId: String? = null,
    val roleId: String? = null,
    val roleName: String? = null,
    val permissions: List<String>? = null
)
