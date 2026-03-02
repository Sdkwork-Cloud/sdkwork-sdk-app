package com.sdkwork.app

data class CollectionVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val collectionId: String? = null,
    val name: String? = null,
    val description: String? = null,
    val type: String? = null,
    val coverImage: String? = null,
    val isPublic: Boolean? = null,
    val isPinned: Boolean? = null,
    val itemCount: Int? = null,
    val viewCount: Int? = null,
    val favoriteCount: Int? = null,
    val parentId: Int? = null
)
