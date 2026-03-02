package com.sdkwork.app

data class CharacterGenerationVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val taskId: String? = null,
    val characterId: String? = null,
    val name: String? = null,
    val description: String? = null,
    val imageUrl: String? = null,
    val thumbnailUrl: String? = null,
    val style: String? = null,
    val status: String? = null,
    val completedAt: String? = null
)
