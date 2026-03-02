package com.sdkwork.app

data class ExperimentFeedbackForm(
    val experimentKey: String? = null,
    val feedbackType: String? = null,
    val feedbackContent: String? = null,
    val rating: Int? = null
)
