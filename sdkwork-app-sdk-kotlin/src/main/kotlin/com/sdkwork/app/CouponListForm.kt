package com.sdkwork.app

data class CouponListForm(
    val type: String? = null,
    val status: String? = null,
    val keyword: String? = null,
    val pageNum: Int? = null,
    val pageSize: Int? = null
)
