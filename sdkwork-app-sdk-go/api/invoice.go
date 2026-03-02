package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type InvoiceApi struct {
    client *sdkhttp.Client
}

func NewInvoiceApi(client *sdkhttp.Client) *InvoiceApi {
    return &InvoiceApi{client: client}
}

// 获取发票详情
func (a *InvoiceApi) GetInvoice(invoiceId string) (sdktypes.PlusApiResultInvoiceDetailVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/invoice/%s", invoiceId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultInvoiceDetailVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultInvoiceDetailVO](raw)
}

// 更新发票
func (a *InvoiceApi) UpdateInvoice(invoiceId string, body sdktypes.InvoiceUpdateForm) (sdktypes.PlusApiResultInvoiceVO, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/invoice/%s", invoiceId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultInvoiceVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultInvoiceVO](raw)
}

// 创建发票
func (a *InvoiceApi) CreateInvoice(body sdktypes.InvoiceCreateForm) (sdktypes.PlusApiResultInvoiceVO, error) {
    raw, err := a.client.Post(AppApiPath("/invoice"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultInvoiceVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultInvoiceVO](raw)
}

// 提交发票
func (a *InvoiceApi) Submit(invoiceId string) (sdktypes.PlusApiResultInvoiceVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/invoice/%s/submit", invoiceId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultInvoiceVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultInvoiceVO](raw)
}

// 作废发票
func (a *InvoiceApi) Cancel(invoiceId string, body sdktypes.InvoiceCancelForm) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/invoice/%s/cancel", invoiceId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 获取发票明细
func (a *InvoiceApi) GetInvoiceItems(invoiceId string) (sdktypes.PlusApiResultListInvoiceItemVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/invoice/%s/items", invoiceId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListInvoiceItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListInvoiceItemVO](raw)
}

// 获取发票统计
func (a *InvoiceApi) GetInvoiceStatistics() (sdktypes.PlusApiResultInvoiceStatisticsVO, error) {
    raw, err := a.client.Get(AppApiPath("/invoice/statistics"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultInvoiceStatisticsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultInvoiceStatisticsVO](raw)
}

// 搜索发票
func (a *InvoiceApi) SearchInvoices(query map[string]interface{}) (sdktypes.PlusApiResultPageInvoiceVO, error) {
    raw, err := a.client.Get(AppApiPath("/invoice/search"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageInvoiceVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageInvoiceVO](raw)
}

// 获取我的发票
func (a *InvoiceApi) GetMyInvoices(query map[string]interface{}) (sdktypes.PlusApiResultPageInvoiceVO, error) {
    raw, err := a.client.Get(AppApiPath("/invoice/my"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageInvoiceVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageInvoiceVO](raw)
}
