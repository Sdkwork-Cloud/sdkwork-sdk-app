package com.sdkwork.app

data class CharacterListVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val characters: List<CharacterItem>? = null,
    val total: Int? = null,
    val page: Int? = null,
    val size: Int? = null
)
