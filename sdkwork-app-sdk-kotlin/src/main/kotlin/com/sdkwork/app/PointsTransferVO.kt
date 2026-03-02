package com.sdkwork.app

data class PointsTransferVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val transactionId: String? = null,
    val fromAccountId: String? = null,
    val toAccountId: String? = null,
    val points: Int? = null,
    val status: String? = null,
    val fromPointsAfter: Int? = null,
    val toPointsAfter: Int? = null
)
