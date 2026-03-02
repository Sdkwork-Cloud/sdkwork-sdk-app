package com.sdkwork.app

data class GenerationStyleCreateForm(
    val name: String? = null,
    val description: String? = null,
    val type: String? = null,
    val configParams: Map<String, Any>? = null,
    val isPublic: Boolean? = null
)
