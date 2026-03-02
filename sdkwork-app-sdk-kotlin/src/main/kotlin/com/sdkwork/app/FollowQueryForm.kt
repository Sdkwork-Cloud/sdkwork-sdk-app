package com.sdkwork.app

data class FollowQueryForm(
    val page: Int? = null,
    val size: Int? = null,
    val queryType: String? = null,
    val userId: String? = null,
    val keyword: String? = null
)
