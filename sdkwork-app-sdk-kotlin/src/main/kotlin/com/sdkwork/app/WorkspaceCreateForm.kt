package com.sdkwork.app

data class WorkspaceCreateForm(
    val workspaceName: String? = null,
    val workspaceDescription: String? = null,
    val workspaceIcon: String? = null,
    val workspaceColor: String? = null,
    val workspaceType: String? = null,
    val members: List<WorkspaceMember>? = null,
    val settings: WorkspaceSettings? = null
)
