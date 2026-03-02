package com.sdkwork.app

data class ProjectCreateForm(
    val workspaceId: String? = null,
    val projectName: String? = null,
    val projectDescription: String? = null,
    val projectType: String? = null,
    val projectIcon: String? = null,
    val projectColor: String? = null,
    val projectTags: List<String>? = null,
    val members: List<ProjectMember>? = null,
    val settings: ProjectSettings? = null
)
