package com.sdkwork.app

data class SensitiveWordsVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val hasSensitiveWords: Boolean? = null,
    val count: Int? = null,
    val words: List<WordHit>? = null,
    val processedText: String? = null,
    val riskLevel: String? = null
)
