package com.sdkwork.app

data class DriveItemVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val itemId: String? = null,
    val itemUuid: String? = null,
    val itemName: String? = null,
    val fileType: String? = null,
    val directory: Boolean? = null,
    val assetType: String? = null,
    val mimeType: String? = null,
    val extension: String? = null,
    val size: Int? = null,
    val parentId: String? = null,
    val path: String? = null,
    val objectKey: String? = null,
    val status: String? = null,
    val resource: FileMediaResource? = null,
    val coverImage: ImageMediaResource? = null
)
