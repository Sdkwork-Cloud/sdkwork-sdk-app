package com.sdkwork.app

data class PlusApiErrorResult(
    val code: Int? = null,
    val msg: String? = null,
    val data: Any? = null,
    val timestamp: String? = null,
    val traceId: String? = null
)
