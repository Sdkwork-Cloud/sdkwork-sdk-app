package com.sdkwork.app

data class FileVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val fileId: String? = null,
    val fileName: String? = null,
    val fileSize: Int? = null,
    val fileType: String? = null,
    val extension: String? = null,
    val objectKey: String? = null,
    val path: String? = null,
    val diskId: String? = null,
    val status: String? = null,
    val uploadStatus: String? = null,
    val contentType: String? = null,
    val fileCategory: String? = null,
    val assetType: String? = null,
    val accessUrl: String? = null,
    val uploadTime: String? = null
)
