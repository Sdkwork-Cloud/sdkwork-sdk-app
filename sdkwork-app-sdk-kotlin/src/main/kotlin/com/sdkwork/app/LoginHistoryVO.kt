package com.sdkwork.app

data class LoginHistoryVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: String? = null,
    val loginTime: String? = null,
    val ipAddress: String? = null,
    val location: String? = null,
    val device: String? = null,
    val browser: String? = null,
    val os: String? = null,
    val loginMethod: String? = null,
    val status: String? = null,
    val result: String? = null,
    val failureReason: String? = null
)
