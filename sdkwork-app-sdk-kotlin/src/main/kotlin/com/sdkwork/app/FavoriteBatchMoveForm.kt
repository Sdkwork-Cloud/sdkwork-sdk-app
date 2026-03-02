package com.sdkwork.app

data class FavoriteBatchMoveForm(
    val favoriteIds: List<String>? = null,
    val targetFolderId: String? = null,
    val folderId: String? = null
)
