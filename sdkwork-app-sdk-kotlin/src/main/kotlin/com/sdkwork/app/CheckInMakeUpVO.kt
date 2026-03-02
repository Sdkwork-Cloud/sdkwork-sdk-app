package com.sdkwork.app

data class CheckInMakeUpVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val success: Boolean? = null,
    val date: String? = null,
    val costPoints: Int? = null,
    val remainingPoints: Int? = null,
    val consecutiveDays: Int? = null,
    val message: String? = null
)
