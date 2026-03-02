package com.sdkwork.app

data class AchievementVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: String? = null,
    val name: String? = null,
    val description: String? = null,
    val icon: String? = null,
    val level: String? = null,
    val status: String? = null,
    val unlockedAt: String? = null,
    val progress: Int? = null,
    val target: Int? = null,
    val type: String? = null,
    val points: Int? = null,
    val sort: Int? = null
)
