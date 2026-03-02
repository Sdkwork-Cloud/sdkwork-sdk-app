package com.sdkwork.app

data class MaintenanceNoticeVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val noticeId: String? = null,
    val title: String? = null,
    val content: String? = null,
    val startTime: String? = null,
    val endTime: String? = null,
    val status: String? = null,
    val maintenanceType: String? = null,
    val affectedServices: String? = null,
    val contactInfo: String? = null,
    val isEmergency: Boolean? = null
)
