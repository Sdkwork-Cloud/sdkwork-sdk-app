package com.sdkwork.app

data class AssetDetailVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val assetId: String? = null,
    val assetName: String? = null,
    val assetType: String? = null,
    val fileType: String? = null,
    val fileTypeName: String? = null,
    val mimeType: String? = null,
    val size: Int? = null,
    val description: String? = null,
    val tags: List<String>? = null,
    val folderId: String? = null,
    val status: String? = null,
    val statusName: String? = null,
    val coverImage: ImageMediaResource? = null,
    val assets: List<AssetMediaResource>? = null,
    val primaryUrl: String? = null,
    val thumbnailUrl: String? = null,
    val diskId: String? = null,
    val path: String? = null,
    val versionId: String? = null,
    val downloadCount: Int? = null,
    val favorited: Boolean? = null,
    val author: String? = null,
    val extension: String? = null
)
