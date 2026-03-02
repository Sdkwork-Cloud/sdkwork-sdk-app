package com.sdkwork.app

data class BatchCancelShareForm(
    val shareIds: List<String>? = null,
    val reason: String? = null
)
