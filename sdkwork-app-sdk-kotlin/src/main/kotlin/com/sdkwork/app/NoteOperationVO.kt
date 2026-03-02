package com.sdkwork.app

data class NoteOperationVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val success: Boolean? = null,
    val noteId: Int? = null,
    val uuid: String? = null,
    val title: String? = null,
    val operationType: String? = null,
    val operationTime: String? = null,
    val message: String? = null
)
