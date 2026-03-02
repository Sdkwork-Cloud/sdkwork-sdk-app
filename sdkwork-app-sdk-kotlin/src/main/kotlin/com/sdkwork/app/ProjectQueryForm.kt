package com.sdkwork.app

data class ProjectQueryForm(
    val workspaceId: String? = null,
    val keyword: String? = null,
    val projectName: String? = null,
    val type: String? = null,
    val projectTags: List<String>? = null,
    val status: String? = null,
    val creatorId: String? = null,
    val startTime: String? = null,
    val endTime: String? = null,
    val sortField: String? = null,
    val sortDirection: String? = null,
    val page: Int? = null,
    val size: Int? = null
)
