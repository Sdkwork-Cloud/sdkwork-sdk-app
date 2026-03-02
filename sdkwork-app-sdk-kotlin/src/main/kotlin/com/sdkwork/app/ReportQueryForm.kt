package com.sdkwork.app

data class ReportQueryForm(
    val type: String? = null,
    val status: String? = null,
    val page: Int? = null,
    val size: Int? = null
)
