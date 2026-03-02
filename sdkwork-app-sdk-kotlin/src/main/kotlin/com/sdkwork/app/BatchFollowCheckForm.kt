package com.sdkwork.app

data class BatchFollowCheckForm(
    val userIds: List<String>? = null,
    val checkType: String? = null
)
