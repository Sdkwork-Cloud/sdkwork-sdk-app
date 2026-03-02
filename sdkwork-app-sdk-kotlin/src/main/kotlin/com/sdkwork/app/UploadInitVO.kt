package com.sdkwork.app

data class UploadInitVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val uploadId: String? = null,
    val fileName: String? = null,
    val fileSize: Int? = null,
    val chunkSize: Int? = null,
    val totalChunks: Int? = null,
    val storagePath: String? = null,
    val uploadUrl: String? = null,
    val uploadParams: Any? = null,
    val uploadedChunks: List<Int>? = null,
    val expireTime: Int? = null,
    val supportResume: Boolean? = null,
    val uploadType: String? = null
)
