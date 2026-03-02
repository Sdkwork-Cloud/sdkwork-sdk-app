package com.sdkwork.app

data class PopupAdvertVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val advertId: String? = null,
    val advertName: String? = null,
    val advertType: String? = null,
    val positionId: String? = null,
    val creativeUrl: String? = null,
    val landingUrl: String? = null,
    val priority: Int? = null,
    val enabled: Boolean? = null,
    val startTime: String? = null,
    val endTime: String? = null,
    val clickCount: Int? = null,
    val impressionCount: Int? = null,
    val popupSize: String? = null,
    val displayDuration: Int? = null,
    val closeButtonEnabled: Boolean? = null,
    val popupPosition: String? = null
)
