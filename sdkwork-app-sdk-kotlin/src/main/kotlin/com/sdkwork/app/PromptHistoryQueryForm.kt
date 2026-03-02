package com.sdkwork.app

data class PromptHistoryQueryForm(
    val promptId: Int? = null,
    val keyword: String? = null,
    val model: String? = null,
    val success: Boolean? = null,
    val page: Int? = null,
    val size: Int? = null,
    val sortBy: String? = null,
    val sortDirection: String? = null
)
