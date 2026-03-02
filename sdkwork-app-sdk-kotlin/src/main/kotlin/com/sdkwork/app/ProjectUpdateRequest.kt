package com.sdkwork.app

data class ProjectUpdateRequest(
    val name: String? = null,
    val description: String? = null,
    val type: String? = null,
    val tags: List<String>? = null,
    val isPublic: Boolean? = null
)
