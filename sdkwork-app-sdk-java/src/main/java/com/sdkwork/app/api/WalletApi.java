package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class WalletApi {
    private final HttpClient client;
    
    public WalletApi(HttpClient client) {
        this.client = client;
    }

    /** 钱包提现 */
    public PlusApiResultWalletOperationResultVO withdraw(WalletWithdrawalForm body) throws Exception {
        return (PlusApiResultWalletOperationResultVO) client.post(ApiPaths.appPath("/wallet/withdrawals"), body);
    }

    /** 钱包转账 */
    public PlusApiResultWalletOperationResultVO transfer(WalletTransferForm body) throws Exception {
        return (PlusApiResultWalletOperationResultVO) client.post(ApiPaths.appPath("/wallet/transfers"), body);
    }

    /** 钱包充值 */
    public PlusApiResultWalletOperationResultVO topup(WalletTopupForm body) throws Exception {
        return (PlusApiResultWalletOperationResultVO) client.post(ApiPaths.appPath("/wallet/topups"), body);
    }

    /** 钱包兑换 */
    public PlusApiResultWalletOperationResultVO exchange(WalletExchangeForm body) throws Exception {
        return (PlusApiResultWalletOperationResultVO) client.post(ApiPaths.appPath("/wallet/exchanges"), body);
    }

    /** 钱包总览 */
    public PlusApiResultWalletOverviewVO getOverview() throws Exception {
        return (PlusApiResultWalletOverviewVO) client.get(ApiPaths.appPath("/wallet"));
    }

    /** 钱包流水分页 */
    public PlusApiResultPageHistoryVO listTransactions(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageHistoryVO) client.get(ApiPaths.appPath("/wallet/transactions"), params);
    }

    /** 交易详情 */
    public PlusApiResultHistoryVO getTransaction(String transactionId) throws Exception {
        return (PlusApiResultHistoryVO) client.get(ApiPaths.appPath("/wallet/transactions/" + transactionId + ""));
    }

    /** 按请求号查询操作状态 */
    public PlusApiResultWalletOperationStatusVO getOperationStatus(String requestNo, Map<String, Object> params) throws Exception {
        return (PlusApiResultWalletOperationStatusVO) client.get(ApiPaths.appPath("/wallet/operations/" + requestNo + ""), params);
    }

    /** 资产账户列表 */
    public PlusApiResultListWalletAssetAccountVO listAccounts() throws Exception {
        return (PlusApiResultListWalletAssetAccountVO) client.get(ApiPaths.appPath("/wallet/accounts"));
    }
}
