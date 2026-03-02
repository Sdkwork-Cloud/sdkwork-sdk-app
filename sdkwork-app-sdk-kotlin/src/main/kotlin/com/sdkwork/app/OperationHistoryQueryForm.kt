package com.sdkwork.app

data class OperationHistoryQueryForm(
    val action: String? = null,
    val result: String? = null,
    val page: Int? = null,
    val size: Int? = null,
    val sortField: String? = null,
    val sortOrder: String? = null
)
