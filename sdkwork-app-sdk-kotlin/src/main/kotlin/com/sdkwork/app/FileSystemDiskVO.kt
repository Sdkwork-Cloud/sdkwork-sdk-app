package com.sdkwork.app

data class FileSystemDiskVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val diskId: String? = null,
    val diskUuid: String? = null,
    val name: String? = null,
    val type: String? = null,
    val owner: String? = null,
    val ownerId: String? = null,
    val totalSize: Int? = null,
    val usedSize: Int? = null,
    val remainingSize: Int? = null,
    val usageRate: Double? = null,
    val fileCount: Int? = null,
    val description: String? = null
)
