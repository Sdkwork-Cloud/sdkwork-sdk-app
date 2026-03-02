package com.sdkwork.app

data class MemberRoleUpdateForm(
    val workspaceId: String? = null,
    val memberId: String? = null,
    val userId: String? = null,
    val newRoleId: String? = null,
    val newRoleName: String? = null,
    val permissions: List<String>? = null,
    val updateReason: String? = null,
    val needNotify: Boolean? = null
)
