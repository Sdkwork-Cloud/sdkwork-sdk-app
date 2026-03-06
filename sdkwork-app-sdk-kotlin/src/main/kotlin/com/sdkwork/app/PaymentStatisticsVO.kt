package com.sdkwork.app

data class PaymentStatisticsVO(
    val totalPayments: Int? = null,
    val pendingPayments: Int? = null,
    val successPayments: Int? = null,
    val failedPayments: Int? = null,
    val closedPayments: Int? = null,
    val timeoutPayments: Int? = null
)
