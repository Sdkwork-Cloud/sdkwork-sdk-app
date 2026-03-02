package com.sdkwork.app

data class VipStatusVO(
    val isVip: Boolean? = null,
    val vipLevel: Int? = null,
    val expireTime: String? = null,
    val pointBalance: Int? = null
)
