package com.sdkwork.app

data class ProjectVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val projectId: String? = null,
    val projectName: String? = null,
    val projectDescription: String? = null,
    val projectType: String? = null,
    val projectIcon: String? = null,
    val projectColor: String? = null,
    val projectTags: List<String>? = null,
    val workspaceId: String? = null,
    val workspaceName: String? = null,
    val creatorId: String? = null,
    val creatorName: String? = null,
    val createTime: String? = null,
    val updateTime: String? = null,
    val memberCount: Int? = null,
    val fileCount: Int? = null,
    val status: String? = null,
    val isPublic: Boolean? = null,
    val userPermissions: List<String>? = null
)
