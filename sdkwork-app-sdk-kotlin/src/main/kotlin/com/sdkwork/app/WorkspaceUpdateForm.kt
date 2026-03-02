package com.sdkwork.app

data class WorkspaceUpdateForm(
    val workspaceId: String? = null,
    val workspaceName: String? = null,
    val workspaceDescription: String? = null,
    val workspaceIcon: String? = null,
    val workspaceColor: String? = null,
    val settings: WorkspaceSettings? = null
)
