package com.sdkwork.app

data class ErrorTrackForm(
    val errorType: String? = null,
    val errorMessage: String? = null,
    val stackTrace: String? = null,
    val deviceId: String? = null,
    val userId: String? = null,
    val appVersion: String? = null,
    val deviceModel: String? = null,
    val osVersion: String? = null,
    val context: String? = null,
    val errorTime: String? = null
)
