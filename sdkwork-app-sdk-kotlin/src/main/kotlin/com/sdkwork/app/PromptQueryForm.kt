package com.sdkwork.app

data class PromptQueryForm(
    val keyword: String? = null,
    val type: String? = null,
    val bizType: String? = null,
    val enabled: Boolean? = null,
    val model: String? = null,
    val isPublic: Boolean? = null,
    val isFavorite: Boolean? = null,
    val page: Int? = null,
    val size: Int? = null,
    val sortBy: String? = null,
    val sortDirection: String? = null
)
