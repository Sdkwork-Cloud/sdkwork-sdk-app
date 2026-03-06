package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class OrdersApi(private val client: HttpClient) {

    /** 获取订单列表 */
    suspend fun listOrders(params: Map<String, Any>? = null): PlusApiResultPageOrderVO? {
        return client.get(ApiPaths.appPath("/orders"), params) as? PlusApiResultPageOrderVO
    }

    /** 创建订单 */
    suspend fun createOrder(body: OrderCreateForm): PlusApiResultOrderVO? {
        return client.post(ApiPaths.appPath("/orders"), body) as? PlusApiResultOrderVO
    }

    /** 申请退款 */
    suspend fun applyRefund(orderId: String, body: RefundApplyForm): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/orders/$orderId/refund"), body) as? PlusApiResultVoid
    }

    /** 订单支付 */
    suspend fun payOrder(orderId: String, body: OrderPayForm): PlusApiResultPaymentParamsVO? {
        return client.post(ApiPaths.appPath("/orders/$orderId/pay"), body) as? PlusApiResultPaymentParamsVO
    }

    /** 确认收货 */
    suspend fun confirmReceipt(orderId: String): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/orders/$orderId/confirm"), null) as? PlusApiResultVoid
    }

    /** 取消订单 */
    suspend fun cancelOrder(orderId: String, body: OrderCancelForm): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/orders/$orderId/cancel"), body) as? PlusApiResultVoid
    }

    /** 获取订单详情 */
    suspend fun getOrderDetail(orderId: String): PlusApiResultOrderDetailVO? {
        return client.get(ApiPaths.appPath("/orders/$orderId")) as? PlusApiResultOrderDetailVO
    }

    /** 删除订单 */
    suspend fun deleteOrder(orderId: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/orders/$orderId")) as? PlusApiResultVoid
    }

    /** 获取订单状态 */
    suspend fun getOrderStatus(orderId: String): PlusApiResultOrderStatusVO? {
        return client.get(ApiPaths.appPath("/orders/$orderId/status")) as? PlusApiResultOrderStatusVO
    }

    /** 查询订单是否支付成功 */
    suspend fun getOrderPaymentSuccess(orderId: String): PlusApiResultOrderPaymentSuccessVO? {
        return client.get(ApiPaths.appPath("/orders/$orderId/payment-success")) as? PlusApiResultOrderPaymentSuccessVO
    }

    /** 获取订单统计 */
    suspend fun getOrderStatistics(): PlusApiResultOrderStatisticsVO? {
        return client.get(ApiPaths.appPath("/orders/statistics")) as? PlusApiResultOrderStatisticsVO
    }
}
