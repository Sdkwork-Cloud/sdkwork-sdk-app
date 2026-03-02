package com.sdkwork.app

data class ProjectSettings(
    val isPublic: Boolean? = null,
    val allowComments: Boolean? = null,
    val allowFileUpload: Boolean? = null,
    val allowInviteMembers: Boolean? = null
)
