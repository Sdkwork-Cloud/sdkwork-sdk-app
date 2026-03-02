package com.sdkwork.app

data class PointsGoodsVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: String? = null,
    val name: String? = null,
    val image: String? = null,
    val category: String? = null,
    val points: Int? = null,
    val originalPoints: Int? = null,
    val stock: Int? = null,
    val exchangeable: Boolean? = null,
    val limitPerUser: Int? = null,
    val exchangedCount: Int? = null,
    val tags: List<String>? = null,
    val sortWeight: Int? = null
)
