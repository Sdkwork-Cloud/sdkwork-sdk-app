package com.sdkwork.app

data class CharacterDetailVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val characterId: String? = null,
    val name: String? = null,
    val type: String? = null,
    val description: String? = null,
    val avatar: ImageMediaResource? = null,
    val threeViewImage: ImageMediaResource? = null,
    val gridShotsImage: ImageMediaResource? = null,
    val avatarVideo: VideoMediaResource? = null,
    val status: String? = null,
    val agentId: Int? = null,
    val personality: String? = null,
    val background: String? = null,
    val interactionSettings: String? = null,
    val version: String? = null,
    val isPublic: Boolean? = null,
    val usageCount: Int? = null,
    val likeCount: Int? = null,
    val lastUsedAt: String? = null
)
