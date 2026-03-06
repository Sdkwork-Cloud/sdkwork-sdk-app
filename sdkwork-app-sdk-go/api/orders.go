package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type OrdersApi struct {
    client *sdkhttp.Client
}

func NewOrdersApi(client *sdkhttp.Client) *OrdersApi {
    return &OrdersApi{client: client}
}

// 获取订单列表
func (a *OrdersApi) ListOrders(query map[string]interface{}) (sdktypes.PlusApiResultPageOrderVO, error) {
    raw, err := a.client.Get(AppApiPath("/orders"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageOrderVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageOrderVO](raw)
}

// 创建订单
func (a *OrdersApi) CreateOrder(body sdktypes.OrderCreateForm) (sdktypes.PlusApiResultOrderVO, error) {
    raw, err := a.client.Post(AppApiPath("/orders"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultOrderVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultOrderVO](raw)
}

// 申请退款
func (a *OrdersApi) ApplyRefund(orderId string, body sdktypes.RefundApplyForm) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/orders/%s/refund", orderId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 订单支付
func (a *OrdersApi) PayOrder(orderId string, body sdktypes.OrderPayForm) (sdktypes.PlusApiResultPaymentParamsVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/orders/%s/pay", orderId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPaymentParamsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPaymentParamsVO](raw)
}

// 确认收货
func (a *OrdersApi) ConfirmReceipt(orderId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/orders/%s/confirm", orderId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 取消订单
func (a *OrdersApi) CancelOrder(orderId string, body sdktypes.OrderCancelForm) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/orders/%s/cancel", orderId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 获取订单详情
func (a *OrdersApi) GetOrderDetail(orderId string) (sdktypes.PlusApiResultOrderDetailVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/orders/%s", orderId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultOrderDetailVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultOrderDetailVO](raw)
}

// 删除订单
func (a *OrdersApi) DeleteOrder(orderId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/orders/%s", orderId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 获取订单状态
func (a *OrdersApi) GetOrderStatus(orderId string) (sdktypes.PlusApiResultOrderStatusVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/orders/%s/status", orderId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultOrderStatusVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultOrderStatusVO](raw)
}

// 查询订单是否支付成功
func (a *OrdersApi) GetOrderPaymentSuccess(orderId string) (sdktypes.PlusApiResultOrderPaymentSuccessVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/orders/%s/payment-success", orderId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultOrderPaymentSuccessVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultOrderPaymentSuccessVO](raw)
}

// 获取订单统计
func (a *OrdersApi) GetOrderStatistics() (sdktypes.PlusApiResultOrderStatisticsVO, error) {
    raw, err := a.client.Get(AppApiPath("/orders/statistics"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultOrderStatisticsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultOrderStatisticsVO](raw)
}
