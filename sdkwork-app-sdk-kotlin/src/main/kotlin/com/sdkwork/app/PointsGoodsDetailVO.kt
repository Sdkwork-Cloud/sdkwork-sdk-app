package com.sdkwork.app

data class PointsGoodsDetailVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: String? = null,
    val name: String? = null,
    val description: String? = null,
    val images: List<String>? = null,
    val category: String? = null,
    val points: Int? = null,
    val originalPoints: Int? = null,
    val stock: Int? = null,
    val exchangeable: Boolean? = null,
    val limitPerUser: Int? = null,
    val myExchangedCount: Int? = null,
    val exchangeNote: String? = null,
    val validUntil: String? = null,
    val usageInstructions: String? = null
)
