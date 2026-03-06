package com.sdkwork.app

data class NoteBatchOperationRequest(
    val type: String? = null,
    val index: Int? = null,
    val startIndex: Int? = null,
    val endIndex: Int? = null,
    val text: String? = null,
    val searchText: String? = null,
    val replaceText: String? = null
)
