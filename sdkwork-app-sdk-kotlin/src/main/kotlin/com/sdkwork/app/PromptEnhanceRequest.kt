package com.sdkwork.app

data class PromptEnhanceRequest(
    val prompt: String? = null,
    val scene: String? = null,
    val style: String? = null,
    val language: String? = null,
    val maxWords: Int? = null
)
