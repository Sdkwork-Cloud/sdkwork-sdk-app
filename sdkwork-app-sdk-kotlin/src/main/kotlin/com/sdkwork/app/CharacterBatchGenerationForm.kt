package com.sdkwork.app

data class CharacterBatchGenerationForm(
    val characters: List<CharacterItem>? = null,
    val model: String? = null
)
