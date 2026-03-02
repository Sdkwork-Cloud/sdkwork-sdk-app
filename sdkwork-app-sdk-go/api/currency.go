package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type CurrencyApi struct {
    client *sdkhttp.Client
}

func NewCurrencyApi(client *sdkhttp.Client) *CurrencyApi {
    return &CurrencyApi{client: client}
}

// 创建货币
func (a *CurrencyApi) CreateCurrency(body sdktypes.CurrencyCreateForm) (sdktypes.PlusApiResultCurrencyVO, error) {
    raw, err := a.client.Post(AppApiPath("/currency"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultCurrencyVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultCurrencyVO](raw)
}

// 禁用货币
func (a *CurrencyApi) Deactivate(currencyId string) (sdktypes.PlusApiResultCurrencyVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/currency/%s/deactivate", currencyId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultCurrencyVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultCurrencyVO](raw)
}

// 启用货币
func (a *CurrencyApi) Activate(currencyId string) (sdktypes.PlusApiResultCurrencyVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/currency/%s/activate", currencyId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultCurrencyVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultCurrencyVO](raw)
}

// 创建汇率
func (a *CurrencyApi) CreateExchangeRate(body sdktypes.ExchangeRateCreateForm) (sdktypes.PlusApiResultExchangeRateVO, error) {
    raw, err := a.client.Post(AppApiPath("/currency/rate"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultExchangeRateVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultExchangeRateVO](raw)
}

// 货币兑换计算
func (a *CurrencyApi) Convert(body sdktypes.CurrencyConvertForm) (sdktypes.PlusApiResultCurrencyConvertVO, error) {
    raw, err := a.client.Post(AppApiPath("/currency/convert"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultCurrencyConvertVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultCurrencyConvertVO](raw)
}

// 获取货币详情
func (a *CurrencyApi) GetCurrency(currencyId string) (sdktypes.PlusApiResultCurrencyVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/currency/%s", currencyId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultCurrencyVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultCurrencyVO](raw)
}

// 获取货币类型列表
func (a *CurrencyApi) GetCurrencyTypes() (sdktypes.PlusApiResultListCurrencyTypeVO, error) {
    raw, err := a.client.Get(AppApiPath("/currency/types"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListCurrencyTypeVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListCurrencyTypeVO](raw)
}

// 获取最新汇率
func (a *CurrencyApi) GetLatestRate(query map[string]interface{}) (sdktypes.PlusApiResultExchangeRateVO, error) {
    raw, err := a.client.Get(AppApiPath("/currency/rate/latest"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultExchangeRateVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultExchangeRateVO](raw)
}

// 获取汇率历史
func (a *CurrencyApi) GetRateHistory(query map[string]interface{}) (sdktypes.PlusApiResultListExchangeRateVO, error) {
    raw, err := a.client.Get(AppApiPath("/currency/rate/history"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListExchangeRateVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListExchangeRateVO](raw)
}

// 获取货币列表
func (a *CurrencyApi) GetCurrencyList(query map[string]interface{}) (sdktypes.PlusApiResultPageCurrencyVO, error) {
    raw, err := a.client.Get(AppApiPath("/currency/list"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageCurrencyVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageCurrencyVO](raw)
}

// 根据代码获取货币
func (a *CurrencyApi) GetCurrencyByCode(code string) (sdktypes.PlusApiResultCurrencyVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/currency/code/%s", code)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultCurrencyVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultCurrencyVO](raw)
}

// 获取启用的货币
func (a *CurrencyApi) GetActiveCurrencies() (sdktypes.PlusApiResultListCurrencyVO, error) {
    raw, err := a.client.Get(AppApiPath("/currency/active"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListCurrencyVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListCurrencyVO](raw)
}
