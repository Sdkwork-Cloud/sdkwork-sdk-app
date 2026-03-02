package com.sdkwork.app

data class InviteLinkForm(
    val inviteType: String? = null,
    val expireSeconds: Int? = null,
    val inviteCode: String? = null,
    val channel: String? = null
)
