package com.sdkwork.app

data class VoiceSpeakerCreateForm(
    val name: String? = null,
    val localName: String? = null,
    val code: String? = null,
    val faceImageUrl: String? = null,
    val channel: String? = null,
    val product: String? = null,
    val gender: String? = null,
    val ageType: String? = null,
    val type: String? = null,
    val models: List<String>? = null,
    val channelSpeakerId: String? = null,
    val version: String? = null,
    val description: String? = null,
    val tags: List<String>? = null
)
