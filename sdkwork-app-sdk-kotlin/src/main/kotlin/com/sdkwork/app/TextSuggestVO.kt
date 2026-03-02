package com.sdkwork.app

data class TextSuggestVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val originalText: String? = null,
    val suggestedText: String? = null,
    val replacementCount: Int? = null,
    val positions: List<ReplacementPosition>? = null,
    val alternativeSuggestions: List<String>? = null
)
