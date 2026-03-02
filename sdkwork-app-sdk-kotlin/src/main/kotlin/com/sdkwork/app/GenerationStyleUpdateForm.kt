package com.sdkwork.app

data class GenerationStyleUpdateForm(
    val name: String? = null,
    val description: String? = null,
    val configParams: Map<String, Any>? = null
)
