package com.sdkwork.app

data class PromptCreateForm(
    val title: String? = null,
    val content: String? = null,
    val type: String? = null,
    val bizType: String? = null,
    val description: String? = null,
    val cateId: Int? = null,
    val sort: Int? = null,
    val parameters: Map<String, Any>? = null,
    val model: String? = null,
    val isPublic: Boolean? = null
)
