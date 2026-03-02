package com.sdkwork.app

data class FileSystemCopyForm(
    val targetParentId: String? = null,
    val targetDiskId: String? = null,
    val name: String? = null,
    val copyContent: Boolean? = null
)
