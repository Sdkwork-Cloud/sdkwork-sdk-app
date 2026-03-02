package com.sdkwork.app

data class DocumentOperationVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val success: Boolean? = null,
    val operationType: String? = null,
    val message: String? = null,
    val documentId: String? = null,
    val documentUuid: String? = null,
    val title: String? = null,
    val operationTime: String? = null
)
