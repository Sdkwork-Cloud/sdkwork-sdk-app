package com.sdkwork.app

data class CheckInRecordVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val date: String? = null,
    val checkedIn: Boolean? = null,
    val isMakeUp: Boolean? = null,
    val points: Int? = null,
    val consecutiveDays: Int? = null,
    val extraRewards: Map<String, Any>? = null
)
