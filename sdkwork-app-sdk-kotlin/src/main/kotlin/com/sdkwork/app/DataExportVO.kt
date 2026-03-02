package com.sdkwork.app

data class DataExportVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val taskId: String? = null,
    val status: String? = null,
    val downloadUrl: String? = null,
    val fileSize: String? = null,
    val estimatedCompletionTime: String? = null,
    val progress: Int? = null,
    val errorMessage: String? = null
)
