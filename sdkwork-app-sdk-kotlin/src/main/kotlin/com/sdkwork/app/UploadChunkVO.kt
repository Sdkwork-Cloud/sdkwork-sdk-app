package com.sdkwork.app

data class UploadChunkVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val uploadId: String? = null,
    val chunkIndex: Int? = null,
    val chunkSize: Int? = null,
    val status: String? = null,
    val success: Boolean? = null,
    val errorMsg: String? = null,
    val chunkMd5: String? = null,
    val uploadedSize: Int? = null,
    val remainingChunks: Int? = null,
    val progress: Int? = null
)
