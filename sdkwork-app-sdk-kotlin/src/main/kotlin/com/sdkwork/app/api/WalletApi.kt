package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class WalletApi(private val client: HttpClient) {

    /** 钱包提现 */
    suspend fun withdraw(body: WalletWithdrawalForm): PlusApiResultWalletOperationResultVO? {
        return client.post(ApiPaths.appPath("/wallet/withdrawals"), body) as? PlusApiResultWalletOperationResultVO
    }

    /** 钱包转账 */
    suspend fun transfer(body: WalletTransferForm): PlusApiResultWalletOperationResultVO? {
        return client.post(ApiPaths.appPath("/wallet/transfers"), body) as? PlusApiResultWalletOperationResultVO
    }

    /** 钱包充值 */
    suspend fun topup(body: WalletTopupForm): PlusApiResultWalletOperationResultVO? {
        return client.post(ApiPaths.appPath("/wallet/topups"), body) as? PlusApiResultWalletOperationResultVO
    }

    /** 钱包兑换 */
    suspend fun exchange(body: WalletExchangeForm): PlusApiResultWalletOperationResultVO? {
        return client.post(ApiPaths.appPath("/wallet/exchanges"), body) as? PlusApiResultWalletOperationResultVO
    }

    /** 钱包总览 */
    suspend fun getOverview(): PlusApiResultWalletOverviewVO? {
        return client.get(ApiPaths.appPath("/wallet")) as? PlusApiResultWalletOverviewVO
    }

    /** 钱包流水分页 */
    suspend fun listTransactions(params: Map<String, Any>? = null): PlusApiResultPageHistoryVO? {
        return client.get(ApiPaths.appPath("/wallet/transactions"), params) as? PlusApiResultPageHistoryVO
    }

    /** 交易详情 */
    suspend fun getTransaction(transactionId: String): PlusApiResultHistoryVO? {
        return client.get(ApiPaths.appPath("/wallet/transactions/$transactionId")) as? PlusApiResultHistoryVO
    }

    /** 按请求号查询操作状态 */
    suspend fun getOperationStatus(requestNo: String, params: Map<String, Any>? = null): PlusApiResultWalletOperationStatusVO? {
        return client.get(ApiPaths.appPath("/wallet/operations/$requestNo"), params) as? PlusApiResultWalletOperationStatusVO
    }

    /** 资产账户列表 */
    suspend fun listAccounts(): PlusApiResultListWalletAssetAccountVO? {
        return client.get(ApiPaths.appPath("/wallet/accounts")) as? PlusApiResultListWalletAssetAccountVO
    }
}
