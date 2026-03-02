package com.sdkwork.app

data class SharePosterForm(
    val shareType: String? = null,
    val shareId: String? = null,
    val template: String? = null,
    val backgroundColor: String? = null,
    val textColor: String? = null,
    val includeQrCode: Boolean? = null,
    val customText: String? = null
)
