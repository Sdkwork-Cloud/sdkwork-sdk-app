package com.sdkwork.app

data class RolloutCheckVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val rolloutKey: String? = null,
    val canRollout: Boolean? = null,
    val reason: String? = null,
    val status: String? = null,
    val checkedAt: String? = null
)
