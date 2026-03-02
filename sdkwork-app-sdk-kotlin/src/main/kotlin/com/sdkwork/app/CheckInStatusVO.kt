package com.sdkwork.app

data class CheckInStatusVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val checkedInToday: Boolean? = null,
    val consecutiveDays: Int? = null,
    val monthlyCheckInCount: Int? = null,
    val monthlyCheckInDates: List<String>? = null,
    val missedDates: List<String>? = null,
    val todayReward: CheckInReward? = null,
    val tomorrowReward: CheckInReward? = null,
    val makeUpCost: Int? = null,
    val remainingMakeUpCount: Int? = null
)
