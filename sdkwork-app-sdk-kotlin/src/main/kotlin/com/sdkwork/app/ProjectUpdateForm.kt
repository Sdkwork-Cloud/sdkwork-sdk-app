package com.sdkwork.app

data class ProjectUpdateForm(
    val projectId: String? = null,
    val projectName: String? = null,
    val projectDescription: String? = null,
    val projectIcon: String? = null,
    val projectColor: String? = null,
    val projectTags: List<String>? = null,
    val settings: ProjectSettings? = null
)
