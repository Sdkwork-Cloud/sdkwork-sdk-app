package com.sdkwork.app

data class AuditAppealForm(
    val reason: String? = null,
    val description: String? = null,
    val evidenceUrl: String? = null,
    val contactEmail: String? = null,
    val expectedAction: String? = null
)
