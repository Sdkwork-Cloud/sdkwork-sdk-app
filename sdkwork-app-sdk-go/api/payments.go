package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type PaymentsApi struct {
    client *sdkhttp.Client
}

func NewPaymentsApi(client *sdkhttp.Client) *PaymentsApi {
    return &PaymentsApi{client: client}
}

// 创建支付
func (a *PaymentsApi) CreatePayment(body sdktypes.PaymentCreateForm) (sdktypes.PlusApiResultPaymentVO, error) {
    raw, err := a.client.Post(AppApiPath("/payments"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPaymentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPaymentVO](raw)
}

// 关闭支付
func (a *PaymentsApi) ClosePayment(paymentId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/payments/%s/close", paymentId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 补单/对账
func (a *PaymentsApi) ReconcilePayment(body sdktypes.PaymentReconcileForm) (sdktypes.PlusApiResultPaymentStatusVO, error) {
    raw, err := a.client.Post(AppApiPath("/payments/reconcile"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPaymentStatusVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPaymentStatusVO](raw)
}

// 通用支付回调
func (a *PaymentsApi) PaymentCallback(provider string, body sdktypes.PaymentCallbackRequest) (sdktypes.PaymentCallbackResponse, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/payments/callback/%s", provider)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PaymentCallbackResponse
        return zero, err
    }
    return decodeResult[sdktypes.PaymentCallbackResponse](raw)
}

// 微信支付回调
func (a *PaymentsApi) WechatPayCallback(body string) (string, error) {
    raw, err := a.client.Post(AppApiPath("/payments/callback/wechat"), body, nil, nil, "")
    if err != nil {
        var zero string
        return zero, err
    }
    return decodeResult[string](raw)
}

// 支付宝回调
func (a *PaymentsApi) AlipayCallback(query map[string]interface{}) (string, error) {
    raw, err := a.client.Post(AppApiPath("/payments/callback/alipay"), nil, query, nil, "")
    if err != nil {
        var zero string
        return zero, err
    }
    return decodeResult[string](raw)
}

// 查询支付详情
func (a *PaymentsApi) GetPaymentDetail(paymentId string) (sdktypes.PlusApiResultPaymentStatusVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/payments/%s", paymentId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPaymentStatusVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPaymentStatusVO](raw)
}

// 查询支付状态
func (a *PaymentsApi) GetPaymentStatus(paymentId string) (sdktypes.PlusApiResultPaymentStatusVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/payments/%s/status", paymentId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPaymentStatusVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPaymentStatusVO](raw)
}

// 获取支付统计
func (a *PaymentsApi) GetPaymentStatistics() (sdktypes.PlusApiResultPaymentStatisticsVO, error) {
    raw, err := a.client.Get(AppApiPath("/payments/statistics"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPaymentStatisticsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPaymentStatisticsVO](raw)
}

// 获取支付记录
func (a *PaymentsApi) ListPaymentRecords(query map[string]interface{}) (sdktypes.PlusApiResultPagePaymentStatusVO, error) {
    raw, err := a.client.Get(AppApiPath("/payments/records"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPagePaymentStatusVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePaymentStatusVO](raw)
}

// 根据商户订单号查询支付状态
func (a *PaymentsApi) GetPaymentStatusByOutTradeNo(outTradeNo string) (sdktypes.PlusApiResultPaymentStatusVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/payments/outTradeNo/%s/status", outTradeNo)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPaymentStatusVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPaymentStatusVO](raw)
}

// 获取订单的支付记录
func (a *PaymentsApi) ListOrder(orderId string) (sdktypes.PlusApiResultListPaymentStatusVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/payments/order/%s", orderId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListPaymentStatusVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPaymentStatusVO](raw)
}

// 获取支付方式
func (a *PaymentsApi) ListPaymentMethods(query map[string]interface{}) (sdktypes.PlusApiResultListPaymentMethodVO, error) {
    raw, err := a.client.Get(AppApiPath("/payments/methods"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListPaymentMethodVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPaymentMethodVO](raw)
}
