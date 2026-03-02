package com.sdkwork.app

data class DocumentBatchUpdateRequest(
    val requests: List<DocumentBatchOperationRequest>? = null,
    val strict: Boolean? = null
)
