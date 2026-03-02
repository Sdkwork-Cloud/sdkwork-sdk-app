package com.sdkwork.app

data class ThirdPartyBindForm(
    val platform: String? = null,
    val code: String? = null,
    val thirdPartyUserId: String? = null,
    val thirdPartyUserName: String? = null,
    val thirdPartyAvatar: String? = null,
    val accessToken: String? = null,
    val refreshToken: String? = null,
    val expireTime: String? = null
)
