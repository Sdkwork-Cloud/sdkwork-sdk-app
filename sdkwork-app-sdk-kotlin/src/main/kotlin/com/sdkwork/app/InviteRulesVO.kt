package com.sdkwork.app

data class InviteRulesVO(
    val title: String? = null,
    val description: String? = null,
    val inviterReward: Int? = null,
    val inviteeReward: Int? = null,
    val rules: List<String>? = null
)
