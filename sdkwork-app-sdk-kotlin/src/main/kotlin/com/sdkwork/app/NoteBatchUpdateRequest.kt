package com.sdkwork.app

data class NoteBatchUpdateRequest(
    val requests: List<NoteBatchOperationRequest>? = null,
    val strict: Boolean? = null
)
