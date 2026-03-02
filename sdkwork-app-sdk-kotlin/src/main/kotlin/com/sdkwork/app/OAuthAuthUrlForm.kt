package com.sdkwork.app

data class OAuthAuthUrlForm(
    val provider: String? = null,
    val redirectUri: String? = null,
    val scope: String? = null,
    val state: String? = null
)
