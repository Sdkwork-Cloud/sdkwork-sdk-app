package com.sdkwork.app

data class RecentProjectVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: String? = null,
    val name: String? = null,
    val description: String? = null,
    val icon: String? = null,
    val cover: String? = null,
    val type: String? = null,
    val status: String? = null,
    val url: String? = null,
    val createTime: String? = null,
    val updateTime: String? = null,
    val memberCount: Int? = null,
    val fileCount: Int? = null,
    val size: Int? = null,
    val tags: List<String>? = null,
    val isPublic: Boolean? = null,
    val isFavorite: Boolean? = null
)
