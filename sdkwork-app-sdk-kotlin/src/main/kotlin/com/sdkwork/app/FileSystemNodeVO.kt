package com.sdkwork.app

data class FileSystemNodeVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val nodeId: String? = null,
    val nodeUuid: String? = null,
    val name: String? = null,
    val type: String? = null,
    val directory: Boolean? = null,
    val diskId: String? = null,
    val parentId: String? = null,
    val path: String? = null,
    val relativePath: String? = null,
    val objectKey: String? = null,
    val size: Int? = null,
    val mimeType: String? = null,
    val extension: String? = null,
    val assetType: String? = null,
    val status: String? = null,
    val description: String? = null,
    val tags: List<String>? = null,
    val versionId: String? = null,
    val uploadStatus: String? = null
)
