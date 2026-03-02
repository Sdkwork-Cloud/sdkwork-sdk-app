package com.sdkwork.app

data class PrivacySettings(
    val publicProfile: Boolean? = null,
    val allowSearch: Boolean? = null,
    val allowFriendRequest: Boolean? = null,
    val allowStrangerMessage: Boolean? = null,
    val locationShare: Boolean? = null
)
