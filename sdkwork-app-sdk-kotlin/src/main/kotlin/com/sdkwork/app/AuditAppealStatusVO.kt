package com.sdkwork.app

data class AuditAppealStatusVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val appealId: String? = null,
    val recordId: String? = null,
    val currentStatus: String? = null,
    val statusDescription: String? = null,
    val progress: Int? = null,
    val estimatedCompleteTime: String? = null,
    val result: String? = null,
    val canAddEvidence: Boolean? = null,
    val canCancel: Boolean? = null
)
