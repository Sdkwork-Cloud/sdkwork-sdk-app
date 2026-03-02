package com.sdkwork.app

data class CharacterCreateForm(
    val name: String? = null,
    val type: String? = null,
    val description: String? = null,
    val agentId: Int? = null
)
