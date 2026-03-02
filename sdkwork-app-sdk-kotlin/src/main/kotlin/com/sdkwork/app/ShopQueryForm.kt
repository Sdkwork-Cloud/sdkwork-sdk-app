package com.sdkwork.app

data class ShopQueryForm(
    val page: Int? = null,
    val size: Int? = null,
    val keyword: String? = null,
    val status: String? = null
)
