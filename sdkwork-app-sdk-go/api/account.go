package api

import (
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type AccountApi struct {
    client *sdkhttp.Client
}

func NewAccountApi(client *sdkhttp.Client) *AccountApi {
    return &AccountApi{client: client}
}

// 积分转账
func (a *AccountApi) Transfer(body sdktypes.PointsTransferForm) (sdktypes.PlusApiResultPointsTransferVO, error) {
    raw, err := a.client.Post(AppApiPath("/account/points/transfer"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPointsTransferVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPointsTransferVO](raw)
}

// 扣除Token
func (a *AccountApi) DeductToken(query map[string]interface{}) (sdktypes.PlusApiResultPointsAccountInfoVO, error) {
    raw, err := a.client.Post(AppApiPath("/account/points/token/deduct"), nil, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPointsAccountInfoVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPointsAccountInfoVO](raw)
}

// 积分兑换
func (a *AccountApi) Exchange(body sdktypes.PointsExchangeForm) (sdktypes.PlusApiResultPointsExchangeVO, error) {
    raw, err := a.client.Post(AppApiPath("/account/points/exchange"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPointsExchangeVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPointsExchangeVO](raw)
}

// 提现
func (a *AccountApi) Withdraw(body sdktypes.CashWithdrawForm) (sdktypes.PlusApiResultCashWithdrawVO, error) {
    raw, err := a.client.Post(AppApiPath("/account/cash/withdraw"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultCashWithdrawVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultCashWithdrawVO](raw)
}

// 转账
func (a *AccountApi) CreateTransfer(body sdktypes.CashTransferForm) (sdktypes.PlusApiResultCashTransferVO, error) {
    raw, err := a.client.Post(AppApiPath("/account/cash/transfer"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultCashTransferVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultCashTransferVO](raw)
}

// 充值
func (a *AccountApi) Recharge(body sdktypes.CashRechargeForm) (sdktypes.PlusApiResultCashRechargeVO, error) {
    raw, err := a.client.Post(AppApiPath("/account/cash/recharge"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultCashRechargeVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultCashRechargeVO](raw)
}

// 获取积分账户信息
func (a *AccountApi) GetPoints() (sdktypes.PlusApiResultPointsAccountInfoVO, error) {
    raw, err := a.client.Get(AppApiPath("/account/points"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPointsAccountInfoVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPointsAccountInfoVO](raw)
}

// 获取Token账户信息
func (a *AccountApi) GetToken() (sdktypes.PlusApiResultPointsAccountInfoVO, error) {
    raw, err := a.client.Get(AppApiPath("/account/points/token"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPointsAccountInfoVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPointsAccountInfoVO](raw)
}

// 获取交易历史
func (a *AccountApi) GetHistory(query map[string]interface{}) (sdktypes.PlusApiResultPageHistoryVO, error) {
    raw, err := a.client.Get(AppApiPath("/account/points/history"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageHistoryVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageHistoryVO](raw)
}

// 获取积分兑换现金比例
func (a *AccountApi) GetPointsToCashRate() (sdktypes.PlusApiResultBigDecimal, error) {
    raw, err := a.client.Get(AppApiPath("/account/points/exchange-rate"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBigDecimal
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBigDecimal](raw)
}

// 获取现金账户信息
func (a *AccountApi) GetCash() (sdktypes.PlusApiResultCashAccountInfoVO, error) {
    raw, err := a.client.Get(AppApiPath("/account/cash"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultCashAccountInfoVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultCashAccountInfoVO](raw)
}

// 获取交易历史
func (a *AccountApi) GetHistoryCash(query map[string]interface{}) (sdktypes.PlusApiResultPageHistoryVO, error) {
    raw, err := a.client.Get(AppApiPath("/account/cash/history"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageHistoryVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageHistoryVO](raw)
}
