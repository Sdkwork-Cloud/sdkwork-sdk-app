package com.sdkwork.app

data class FavoriteQueryForm(
    val favoriteType: String? = null,
    val type: String? = null,
    val folderId: String? = null,
    val keyword: String? = null,
    val sortField: String? = null,
    val sortDirection: String? = null,
    val page: Int? = null,
    val size: Int? = null
)
