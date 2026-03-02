package com.sdkwork.app

data class VipPackVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val name: String? = null,
    val description: String? = null,
    val price: Double? = null,
    val originalPrice: Double? = null,
    val pointAmount: Int? = null,
    val vipDurationDays: Int? = null,
    val levelName: String? = null,
    val sortWeight: Int? = null,
    val recommended: Boolean? = null,
    val tags: List<String>? = null
)
