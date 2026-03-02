package com.sdkwork.app

data class MemberInviteForm(
    val workspaceId: String? = null,
    val emails: List<String>? = null,
    val roleId: String? = null,
    val roleName: String? = null,
    val permissions: List<String>? = null,
    val inviteMessage: String? = null,
    val expireHours: Int? = null,
    val needApproval: Boolean? = null
)
