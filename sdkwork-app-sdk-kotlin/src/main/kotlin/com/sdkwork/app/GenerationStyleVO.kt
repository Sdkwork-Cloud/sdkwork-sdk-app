package com.sdkwork.app

data class GenerationStyleVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val styleId: String? = null,
    val name: String? = null,
    val description: String? = null,
    val type: String? = null,
    val isPublic: Boolean? = null,
    val status: String? = null,
    val usageCount: Int? = null,
    val coverImageUrl: String? = null
)
