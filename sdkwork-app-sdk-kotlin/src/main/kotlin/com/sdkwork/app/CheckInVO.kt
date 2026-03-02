package com.sdkwork.app

data class CheckInVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val success: Boolean? = null,
    val checkInDate: String? = null,
    val consecutiveDays: Int? = null,
    val points: Int? = null,
    val extraRewards: Map<String, Any>? = null,
    val checkedInToday: Boolean? = null,
    val message: String? = null
)
