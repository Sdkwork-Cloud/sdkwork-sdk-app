package com.sdkwork.app

data class WorkspaceSettings(
    val isPublic: Boolean? = null,
    val allowInvite: Boolean? = null,
    val allowCreateProject: Boolean? = null,
    val allowFileUpload: Boolean? = null
)
