package com.sdkwork.app

data class ExportVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val taskId: String? = null,
    val fileUrl: String? = null,
    val fileName: String? = null,
    val fileSize: Int? = null,
    val status: String? = null,
    val format: String? = null,
    val exportCount: Int? = null,
    val expireTime: String? = null
)
