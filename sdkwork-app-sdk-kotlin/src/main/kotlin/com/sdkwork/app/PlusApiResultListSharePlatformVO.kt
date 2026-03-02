package com.sdkwork.app

data class PlusApiResultListSharePlatformVO(
    val data: List<SharePlatformVO>? = null,
    val code: String? = null,
    val msg: String? = null,
    val requestId: String? = null,
    val ip: String? = null,
    val hostname: String? = null,
    val errorName: String? = null
)
