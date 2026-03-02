package com.sdkwork.app

data class FavoriteFolderUpdateForm(
    val folderId: String? = null,
    val folderName: String? = null,
    val parentFolderId: String? = null,
    val folderDescription: String? = null
)
