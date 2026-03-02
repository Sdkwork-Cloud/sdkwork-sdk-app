package com.sdkwork.app

data class CharacterVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val characterId: String? = null,
    val name: String? = null,
    val type: String? = null,
    val description: String? = null,
    val avatar: ImageMediaResource? = null,
    val status: String? = null,
    val agentId: Int? = null,
    val isPublic: Boolean? = null,
    val usageCount: Int? = null,
    val likeCount: Int? = null
)
