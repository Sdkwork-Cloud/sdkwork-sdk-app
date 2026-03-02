package com.sdkwork.app

data class VipPurchaseVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val orderId: String? = null,
    val packId: Int? = null,
    val packName: String? = null,
    val amount: Double? = null,
    val durationDays: Int? = null,
    val targetLevelId: Int? = null,
    val targetLevelName: String? = null,
    val status: String? = null
)
