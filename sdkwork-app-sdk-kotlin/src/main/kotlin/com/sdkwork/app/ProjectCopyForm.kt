package com.sdkwork.app

data class ProjectCopyForm(
    val sourceProjectId: String? = null,
    val targetWorkspaceId: String? = null,
    val newName: String? = null,
    val newProjectDescription: String? = null,
    val copyMembers: Boolean? = null,
    val copyFiles: Boolean? = null,
    val copySettings: Boolean? = null,
    val copyReason: String? = null
)
