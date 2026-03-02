package com.sdkwork.app

data class SensitiveWordListVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val listId: String? = null,
    val name: String? = null,
    val description: String? = null,
    val type: String? = null,
    val wordCount: Int? = null,
    val categories: List<String>? = null,
    val version: String? = null,
    val enabled: Boolean? = null
)
