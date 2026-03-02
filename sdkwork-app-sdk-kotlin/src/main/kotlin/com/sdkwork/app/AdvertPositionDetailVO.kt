package com.sdkwork.app

data class AdvertPositionDetailVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val positionId: String? = null,
    val positionName: String? = null,
    val positionType: String? = null,
    val description: String? = null,
    val priority: Int? = null,
    val enabled: Boolean? = null,
    val adverts: List<AdvertVO>? = null
)
