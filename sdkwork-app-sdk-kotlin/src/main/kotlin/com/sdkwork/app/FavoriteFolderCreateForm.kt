package com.sdkwork.app

data class FavoriteFolderCreateForm(
    val folderName: String? = null,
    val name: String? = null,
    val parentFolderId: String? = null,
    val folderDescription: String? = null
)
