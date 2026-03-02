package com.sdkwork.app

data class DataExportForm(
    val format: String? = null,
    val dataType: String? = null,
    val includeMedia: Boolean? = null,
    val startTime: String? = null,
    val endTime: String? = null,
    val email: String? = null
)
