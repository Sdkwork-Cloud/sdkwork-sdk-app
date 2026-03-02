package com.sdkwork.app

data class UploadInitForm(
    val fileName: String? = null,
    val fileSize: Int? = null,
    val fileMd5: String? = null,
    val fileType: String? = null,
    val uploadType: String? = null,
    val chunkSize: Int? = null,
    val totalChunks: Int? = null,
    val storagePath: String? = null,
    val businessType: String? = null,
    val businessId: String? = null
)
