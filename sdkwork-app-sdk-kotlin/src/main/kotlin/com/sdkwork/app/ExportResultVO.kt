package com.sdkwork.app

data class ExportResultVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val exportId: String? = null,
    val reportType: String? = null,
    val status: String? = null,
    val downloadUrl: String? = null,
    val fileSize: Int? = null,
    val completedAt: String? = null,
    val errorMessage: String? = null
)
