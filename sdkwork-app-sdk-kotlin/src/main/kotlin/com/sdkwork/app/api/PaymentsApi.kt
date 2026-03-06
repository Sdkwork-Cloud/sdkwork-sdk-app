package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class PaymentsApi(private val client: HttpClient) {

    /** 创建支付 */
    suspend fun createPayment(body: PaymentCreateForm): PlusApiResultPaymentVO? {
        return client.post(ApiPaths.appPath("/payments"), body) as? PlusApiResultPaymentVO
    }

    /** 关闭支付 */
    suspend fun closePayment(paymentId: String): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/payments/$paymentId/close"), null) as? PlusApiResultVoid
    }

    /** 补单/对账 */
    suspend fun reconcilePayment(body: PaymentReconcileForm): PlusApiResultPaymentStatusVO? {
        return client.post(ApiPaths.appPath("/payments/reconcile"), body) as? PlusApiResultPaymentStatusVO
    }

    /** 通用支付回调 */
    suspend fun paymentCallback(provider: String, body: PaymentCallbackRequest): PaymentCallbackResponse? {
        return client.post(ApiPaths.appPath("/payments/callback/$provider"), body) as? PaymentCallbackResponse
    }

    /** 微信支付回调 */
    suspend fun wechatPayCallback(body: String): String? {
        return client.post(ApiPaths.appPath("/payments/callback/wechat"), body) as? String
    }

    /** 支付宝回调 */
    suspend fun alipayCallback(params: Map<String, Any>? = null): String? {
        return client.post(ApiPaths.appPath("/payments/callback/alipay"), null, params) as? String
    }

    /** 查询支付详情 */
    suspend fun getPaymentDetail(paymentId: String): PlusApiResultPaymentStatusVO? {
        return client.get(ApiPaths.appPath("/payments/$paymentId")) as? PlusApiResultPaymentStatusVO
    }

    /** 查询支付状态 */
    suspend fun getPaymentStatus(paymentId: String): PlusApiResultPaymentStatusVO? {
        return client.get(ApiPaths.appPath("/payments/$paymentId/status")) as? PlusApiResultPaymentStatusVO
    }

    /** 获取支付统计 */
    suspend fun getPaymentStatistics(): PlusApiResultPaymentStatisticsVO? {
        return client.get(ApiPaths.appPath("/payments/statistics")) as? PlusApiResultPaymentStatisticsVO
    }

    /** 获取支付记录 */
    suspend fun listPaymentRecords(params: Map<String, Any>? = null): PlusApiResultPagePaymentStatusVO? {
        return client.get(ApiPaths.appPath("/payments/records"), params) as? PlusApiResultPagePaymentStatusVO
    }

    /** 根据商户订单号查询支付状态 */
    suspend fun getPaymentStatusByOutTradeNo(outTradeNo: String): PlusApiResultPaymentStatusVO? {
        return client.get(ApiPaths.appPath("/payments/outTradeNo/$outTradeNo/status")) as? PlusApiResultPaymentStatusVO
    }

    /** 获取订单的支付记录 */
    suspend fun listOrder(orderId: String): PlusApiResultListPaymentStatusVO? {
        return client.get(ApiPaths.appPath("/payments/order/$orderId")) as? PlusApiResultListPaymentStatusVO
    }

    /** 获取支付方式 */
    suspend fun listPaymentMethods(params: Map<String, Any>? = null): PlusApiResultListPaymentMethodVO? {
        return client.get(ApiPaths.appPath("/payments/methods"), params) as? PlusApiResultListPaymentMethodVO
    }
}
