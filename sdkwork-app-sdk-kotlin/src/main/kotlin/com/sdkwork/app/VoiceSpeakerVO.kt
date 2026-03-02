package com.sdkwork.app

data class VoiceSpeakerVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val name: String? = null,
    val localName: String? = null,
    val code: String? = null,
    val faceImageUrl: String? = null,
    val faceVideoUrl: String? = null,
    val channel: String? = null,
    val channelName: String? = null,
    val product: String? = null,
    val gender: String? = null,
    val genderName: String? = null,
    val ageType: String? = null,
    val ageTypeName: String? = null,
    val type: String? = null,
    val typeName: String? = null,
    val models: List<String>? = null,
    val channelSpeakerId: String? = null,
    val version: String? = null,
    val isDefault: Boolean? = null,
    val status: String? = null,
    val statusName: String? = null,
    val description: String? = null,
    val tags: List<String>? = null
)
