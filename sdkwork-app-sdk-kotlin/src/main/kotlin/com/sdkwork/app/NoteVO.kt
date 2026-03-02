package com.sdkwork.app

data class NoteVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val uuid: String? = null,
    val title: String? = null,
    val content: String? = null,
    val userId: Int? = null,
    val folderId: String? = null,
    val folderPath: String? = null,
    val tags: List<String>? = null,
    val accessScope: String? = null,
    val hasPassword: Boolean? = null,
    val coverImageUrl: String? = null,
    val status: String? = null,
    val summary: String? = null,
    val favorited: Boolean? = null,
    val wordCount: Int? = null
)
