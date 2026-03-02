package com.sdkwork.app

data class FavoriteAddForm(
    val favoriteType: String? = null,
    val type: String? = null,
    val targetId: String? = null,
    val favoriteName: String? = null,
    val favoriteDescription: String? = null,
    val folderId: String? = null,
    val tags: String? = null
)
