package com.sdkwork.app

data class PromptVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val title: String? = null,
    val content: String? = null,
    val type: String? = null,
    val bizType: String? = null,
    val description: String? = null,
    val cateId: Int? = null,
    val enabled: Boolean? = null,
    val sort: Int? = null,
    val parameters: Map<String, Any>? = null,
    val creator: String? = null,
    val model: String? = null,
    val tags: TagsContent? = null,
    val usageCount: Int? = null,
    val avgResponseTime: Int? = null,
    val version: String? = null,
    val isPublic: Boolean? = null,
    val isFavorite: Boolean? = null,
    val favoriteCount: Int? = null,
    val lastUsedAt: String? = null
)
