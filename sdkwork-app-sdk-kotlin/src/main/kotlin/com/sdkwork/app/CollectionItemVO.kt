package com.sdkwork.app

data class CollectionItemVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val itemId: String? = null,
    val collectionId: String? = null,
    val contentType: String? = null,
    val contentId: Int? = null,
    val title: String? = null,
    val description: String? = null,
    val coverImage: String? = null,
    val position: Int? = null,
    val isPinned: Boolean? = null,
    val tags: String? = null,
    val addedAt: String? = null
)
