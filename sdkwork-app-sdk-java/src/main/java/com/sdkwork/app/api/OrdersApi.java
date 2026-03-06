package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class OrdersApi {
    private final HttpClient client;
    
    public OrdersApi(HttpClient client) {
        this.client = client;
    }

    /** 获取订单列表 */
    public PlusApiResultPageOrderVO listOrders(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageOrderVO) client.get(ApiPaths.appPath("/orders"), params);
    }

    /** 创建订单 */
    public PlusApiResultOrderVO createOrder(OrderCreateForm body) throws Exception {
        return (PlusApiResultOrderVO) client.post(ApiPaths.appPath("/orders"), body);
    }

    /** 申请退款 */
    public PlusApiResultVoid applyRefund(String orderId, RefundApplyForm body) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/orders/" + orderId + "/refund"), body);
    }

    /** 订单支付 */
    public PlusApiResultPaymentParamsVO payOrder(String orderId, OrderPayForm body) throws Exception {
        return (PlusApiResultPaymentParamsVO) client.post(ApiPaths.appPath("/orders/" + orderId + "/pay"), body);
    }

    /** 确认收货 */
    public PlusApiResultVoid confirmReceipt(String orderId) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/orders/" + orderId + "/confirm"), null);
    }

    /** 取消订单 */
    public PlusApiResultVoid cancelOrder(String orderId, OrderCancelForm body) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/orders/" + orderId + "/cancel"), body);
    }

    /** 获取订单详情 */
    public PlusApiResultOrderDetailVO getOrderDetail(String orderId) throws Exception {
        return (PlusApiResultOrderDetailVO) client.get(ApiPaths.appPath("/orders/" + orderId + ""));
    }

    /** 删除订单 */
    public PlusApiResultVoid deleteOrder(String orderId) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/orders/" + orderId + ""));
    }

    /** 获取订单状态 */
    public PlusApiResultOrderStatusVO getOrderStatus(String orderId) throws Exception {
        return (PlusApiResultOrderStatusVO) client.get(ApiPaths.appPath("/orders/" + orderId + "/status"));
    }

    /** 查询订单是否支付成功 */
    public PlusApiResultOrderPaymentSuccessVO getOrderPaymentSuccess(String orderId) throws Exception {
        return (PlusApiResultOrderPaymentSuccessVO) client.get(ApiPaths.appPath("/orders/" + orderId + "/payment-success"));
    }

    /** 获取订单统计 */
    public PlusApiResultOrderStatisticsVO getOrderStatistics() throws Exception {
        return (PlusApiResultOrderStatisticsVO) client.get(ApiPaths.appPath("/orders/statistics"));
    }
}
