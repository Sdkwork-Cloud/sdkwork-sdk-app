package com.sdkwork.app

data class GlobalSearchVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val projects: List<ProjectSearchResult>? = null,
    val assets: List<AssetSearchResult>? = null,
    val notes: List<NoteSearchResult>? = null,
    val users: List<UserSearchResult>? = null
)
