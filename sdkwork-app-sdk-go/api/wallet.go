package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type WalletApi struct {
    client *sdkhttp.Client
}

func NewWalletApi(client *sdkhttp.Client) *WalletApi {
    return &WalletApi{client: client}
}

// 钱包提现
func (a *WalletApi) Withdraw(body sdktypes.WalletWithdrawalForm) (sdktypes.PlusApiResultWalletOperationResultVO, error) {
    raw, err := a.client.Post(AppApiPath("/wallet/withdrawals"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultWalletOperationResultVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultWalletOperationResultVO](raw)
}

// 钱包转账
func (a *WalletApi) Transfer(body sdktypes.WalletTransferForm) (sdktypes.PlusApiResultWalletOperationResultVO, error) {
    raw, err := a.client.Post(AppApiPath("/wallet/transfers"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultWalletOperationResultVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultWalletOperationResultVO](raw)
}

// 钱包充值
func (a *WalletApi) Topup(body sdktypes.WalletTopupForm) (sdktypes.PlusApiResultWalletOperationResultVO, error) {
    raw, err := a.client.Post(AppApiPath("/wallet/topups"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultWalletOperationResultVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultWalletOperationResultVO](raw)
}

// 钱包兑换
func (a *WalletApi) Exchange(body sdktypes.WalletExchangeForm) (sdktypes.PlusApiResultWalletOperationResultVO, error) {
    raw, err := a.client.Post(AppApiPath("/wallet/exchanges"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultWalletOperationResultVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultWalletOperationResultVO](raw)
}

// 钱包总览
func (a *WalletApi) GetOverview() (sdktypes.PlusApiResultWalletOverviewVO, error) {
    raw, err := a.client.Get(AppApiPath("/wallet"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultWalletOverviewVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultWalletOverviewVO](raw)
}

// 钱包流水分页
func (a *WalletApi) ListTransactions(query map[string]interface{}) (sdktypes.PlusApiResultPageHistoryVO, error) {
    raw, err := a.client.Get(AppApiPath("/wallet/transactions"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageHistoryVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageHistoryVO](raw)
}

// 交易详情
func (a *WalletApi) GetTransaction(transactionId string) (sdktypes.PlusApiResultHistoryVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/wallet/transactions/%s", transactionId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultHistoryVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultHistoryVO](raw)
}

// 按请求号查询操作状态
func (a *WalletApi) GetOperationStatus(requestNo string, query map[string]interface{}) (sdktypes.PlusApiResultWalletOperationStatusVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/wallet/operations/%s", requestNo)), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultWalletOperationStatusVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultWalletOperationStatusVO](raw)
}

// 资产账户列表
func (a *WalletApi) ListAccounts() (sdktypes.PlusApiResultListWalletAssetAccountVO, error) {
    raw, err := a.client.Get(AppApiPath("/wallet/accounts"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListWalletAssetAccountVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListWalletAssetAccountVO](raw)
}
