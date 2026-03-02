package com.sdkwork.app

data class ExperimentEventForm(
    val experimentKey: String? = null,
    val eventType: String? = null,
    val eventData: Any? = null
)
