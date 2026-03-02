package com.sdkwork.app

data class FavoriteFolderVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val folderId: String? = null,
    val folderName: String? = null,
    val parentFolderId: String? = null,
    val folderDescription: String? = null,
    val subFolders: List<FavoriteFolderVO>? = null,
    val favoriteItems: List<FavoriteItemVO>? = null,
    val createTime: String? = null,
    val updateTime: String? = null,
    val favoriteCount: Int? = null
)
