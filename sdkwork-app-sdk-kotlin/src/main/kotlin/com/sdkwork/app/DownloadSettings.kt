package com.sdkwork.app

data class DownloadSettings(
    val downloadPath: String? = null,
    val wifiOnly: Boolean? = null,
    val autoDownload: Boolean? = null,
    val maxConcurrent: Int? = null
)
