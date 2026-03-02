package com.sdkwork.app

data class WorkspaceVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val workspaceId: String? = null,
    val workspaceName: String? = null,
    val workspaceDescription: String? = null,
    val workspaceIcon: String? = null,
    val workspaceColor: String? = null,
    val workspaceType: String? = null,
    val creatorId: String? = null,
    val creatorName: String? = null,
    val createTime: String? = null,
    val updateTime: String? = null,
    val memberCount: Int? = null,
    val projectCount: Int? = null,
    val status: String? = null,
    val isPublic: Boolean? = null,
    val userRole: String? = null,
    val userPermissions: List<String>? = null,
    val settings: WorkspaceSettings? = null
)
