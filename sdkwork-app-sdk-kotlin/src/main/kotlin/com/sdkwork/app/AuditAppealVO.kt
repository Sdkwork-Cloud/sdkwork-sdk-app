package com.sdkwork.app

data class AuditAppealVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val appealId: String? = null,
    val recordId: String? = null,
    val reason: String? = null,
    val description: String? = null,
    val evidenceUrl: String? = null,
    val status: String? = null,
    val result: String? = null,
    val comment: String? = null,
    val submitTime: String? = null,
    val processTime: String? = null
)
