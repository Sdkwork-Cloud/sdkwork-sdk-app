package com.sdkwork.app

data class FavoriteBatchCheckForm(
    val favoriteType: String? = null,
    val targetIds: List<String>? = null,
    val items: List<CheckItem>? = null
)
