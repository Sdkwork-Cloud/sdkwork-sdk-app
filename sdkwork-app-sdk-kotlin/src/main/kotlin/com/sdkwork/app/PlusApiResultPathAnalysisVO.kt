package com.sdkwork.app

data class PlusApiResultPathAnalysisVO(
    val data: PathAnalysisVO? = null,
    val code: String? = null,
    val msg: String? = null,
    val requestId: String? = null,
    val ip: String? = null,
    val hostname: String? = null,
    val errorName: String? = null
)
