package com.sdkwork.app

data class RecommendationVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: String? = null,
    val type: String? = null,
    val title: String? = null,
    val description: String? = null,
    val icon: String? = null,
    val image: String? = null,
    val url: String? = null,
    val rating: Double? = null,
    val hotScore: Int? = null,
    val reason: String? = null,
    val scenarios: List<String>? = null,
    val tags: List<String>? = null,
    val isFree: Boolean? = null,
    val price: String? = null,
    val priority: Int? = null
)
