package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class PaymentsApi {
    private final HttpClient client;
    
    public PaymentsApi(HttpClient client) {
        this.client = client;
    }

    /** 创建支付 */
    public PlusApiResultPaymentVO createPayment(PaymentCreateForm body) throws Exception {
        return (PlusApiResultPaymentVO) client.post(ApiPaths.appPath("/payments"), body);
    }

    /** 关闭支付 */
    public PlusApiResultVoid closePayment(String paymentId) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/payments/" + paymentId + "/close"), null);
    }

    /** 补单/对账 */
    public PlusApiResultPaymentStatusVO reconcilePayment(PaymentReconcileForm body) throws Exception {
        return (PlusApiResultPaymentStatusVO) client.post(ApiPaths.appPath("/payments/reconcile"), body);
    }

    /** 通用支付回调 */
    public PaymentCallbackResponse paymentCallback(String provider, PaymentCallbackRequest body) throws Exception {
        return (PaymentCallbackResponse) client.post(ApiPaths.appPath("/payments/callback/" + provider + ""), body);
    }

    /** 微信支付回调 */
    public String wechatPayCallback(String body) throws Exception {
        return (String) client.post(ApiPaths.appPath("/payments/callback/wechat"), body);
    }

    /** 支付宝回调 */
    public String alipayCallback(Map<String, Object> params) throws Exception {
        return (String) client.post(ApiPaths.appPath("/payments/callback/alipay"), null, params);
    }

    /** 查询支付详情 */
    public PlusApiResultPaymentStatusVO getPaymentDetail(String paymentId) throws Exception {
        return (PlusApiResultPaymentStatusVO) client.get(ApiPaths.appPath("/payments/" + paymentId + ""));
    }

    /** 查询支付状态 */
    public PlusApiResultPaymentStatusVO getPaymentStatus(String paymentId) throws Exception {
        return (PlusApiResultPaymentStatusVO) client.get(ApiPaths.appPath("/payments/" + paymentId + "/status"));
    }

    /** 获取支付统计 */
    public PlusApiResultPaymentStatisticsVO getPaymentStatistics() throws Exception {
        return (PlusApiResultPaymentStatisticsVO) client.get(ApiPaths.appPath("/payments/statistics"));
    }

    /** 获取支付记录 */
    public PlusApiResultPagePaymentStatusVO listPaymentRecords(Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePaymentStatusVO) client.get(ApiPaths.appPath("/payments/records"), params);
    }

    /** 根据商户订单号查询支付状态 */
    public PlusApiResultPaymentStatusVO getPaymentStatusByOutTradeNo(String outTradeNo) throws Exception {
        return (PlusApiResultPaymentStatusVO) client.get(ApiPaths.appPath("/payments/outTradeNo/" + outTradeNo + "/status"));
    }

    /** 获取订单的支付记录 */
    public PlusApiResultListPaymentStatusVO listOrder(String orderId) throws Exception {
        return (PlusApiResultListPaymentStatusVO) client.get(ApiPaths.appPath("/payments/order/" + orderId + ""));
    }

    /** 获取支付方式 */
    public PlusApiResultListPaymentMethodVO listPaymentMethods(Map<String, Object> params) throws Exception {
        return (PlusApiResultListPaymentMethodVO) client.get(ApiPaths.appPath("/payments/methods"), params);
    }
}
