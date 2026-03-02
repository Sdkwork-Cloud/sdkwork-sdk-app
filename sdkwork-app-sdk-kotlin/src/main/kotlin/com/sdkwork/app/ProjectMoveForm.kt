package com.sdkwork.app

data class ProjectMoveForm(
    val projectId: String? = null,
    val targetWorkspaceId: String? = null,
    val moveReason: String? = null,
    val retainMembers: Boolean? = null,
    val retainSettings: Boolean? = null
)
