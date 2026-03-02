package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class AccountApi(private val client: HttpClient) {

    /** 积分转账 */
    suspend fun transfer(body: PointsTransferForm): PlusApiResultPointsTransferVO? {
        return client.post(ApiPaths.appPath("/account/points/transfer"), body) as? PlusApiResultPointsTransferVO
    }

    /** 扣除Token */
    suspend fun deductToken(params: Map<String, Any>? = null): PlusApiResultPointsAccountInfoVO? {
        return client.post(ApiPaths.appPath("/account/points/token/deduct"), null, params) as? PlusApiResultPointsAccountInfoVO
    }

    /** 积分兑换 */
    suspend fun exchange(body: PointsExchangeForm): PlusApiResultPointsExchangeVO? {
        return client.post(ApiPaths.appPath("/account/points/exchange"), body) as? PlusApiResultPointsExchangeVO
    }

    /** 提现 */
    suspend fun withdraw(body: CashWithdrawForm): PlusApiResultCashWithdrawVO? {
        return client.post(ApiPaths.appPath("/account/cash/withdraw"), body) as? PlusApiResultCashWithdrawVO
    }

    /** 转账 */
    suspend fun createTransfer(body: CashTransferForm): PlusApiResultCashTransferVO? {
        return client.post(ApiPaths.appPath("/account/cash/transfer"), body) as? PlusApiResultCashTransferVO
    }

    /** 充值 */
    suspend fun recharge(body: CashRechargeForm): PlusApiResultCashRechargeVO? {
        return client.post(ApiPaths.appPath("/account/cash/recharge"), body) as? PlusApiResultCashRechargeVO
    }

    /** 获取积分账户信息 */
    suspend fun getPoints(): PlusApiResultPointsAccountInfoVO? {
        return client.get(ApiPaths.appPath("/account/points")) as? PlusApiResultPointsAccountInfoVO
    }

    /** 获取Token账户信息 */
    suspend fun getToken(): PlusApiResultPointsAccountInfoVO? {
        return client.get(ApiPaths.appPath("/account/points/token")) as? PlusApiResultPointsAccountInfoVO
    }

    /** 获取交易历史 */
    suspend fun getHistory(params: Map<String, Any>? = null): PlusApiResultPageHistoryVO? {
        return client.get(ApiPaths.appPath("/account/points/history"), params) as? PlusApiResultPageHistoryVO
    }

    /** 获取现金账户信息 */
    suspend fun getCash(): PlusApiResultCashAccountInfoVO? {
        return client.get(ApiPaths.appPath("/account/cash")) as? PlusApiResultCashAccountInfoVO
    }

    /** 获取交易历史 */
    suspend fun getHistoryCash(params: Map<String, Any>? = null): PlusApiResultPageHistoryVO? {
        return client.get(ApiPaths.appPath("/account/cash/history"), params) as? PlusApiResultPageHistoryVO
    }
}
