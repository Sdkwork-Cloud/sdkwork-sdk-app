package com.sdkwork.app

data class TrendingItemVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: String? = null,
    val name: String? = null,
    val description: String? = null,
    val icon: String? = null,
    val cover: String? = null,
    val type: String? = null,
    val url: String? = null,
    val hotScore: Int? = null,
    val rating: Double? = null,
    val downloads: Int? = null,
    val favorites: Int? = null,
    val comments: Int? = null,
    val author: String? = null,
    val tags: List<String>? = null,
    val price: String? = null,
    val isFree: Boolean? = null,
    val updateTime: String? = null
)
