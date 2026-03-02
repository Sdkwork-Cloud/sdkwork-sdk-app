package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class AccountApi {
    private final HttpClient client;
    
    public AccountApi(HttpClient client) {
        this.client = client;
    }

    /** 积分转账 */
    public PlusApiResultPointsTransferVO transfer(PointsTransferForm body) throws Exception {
        return (PlusApiResultPointsTransferVO) client.post(ApiPaths.appPath("/account/points/transfer"), body);
    }

    /** 扣除Token */
    public PlusApiResultPointsAccountInfoVO deductToken(Map<String, Object> params) throws Exception {
        return (PlusApiResultPointsAccountInfoVO) client.post(ApiPaths.appPath("/account/points/token/deduct"), null, params);
    }

    /** 积分兑换 */
    public PlusApiResultPointsExchangeVO exchange(PointsExchangeForm body) throws Exception {
        return (PlusApiResultPointsExchangeVO) client.post(ApiPaths.appPath("/account/points/exchange"), body);
    }

    /** 提现 */
    public PlusApiResultCashWithdrawVO withdraw(CashWithdrawForm body) throws Exception {
        return (PlusApiResultCashWithdrawVO) client.post(ApiPaths.appPath("/account/cash/withdraw"), body);
    }

    /** 转账 */
    public PlusApiResultCashTransferVO createTransfer(CashTransferForm body) throws Exception {
        return (PlusApiResultCashTransferVO) client.post(ApiPaths.appPath("/account/cash/transfer"), body);
    }

    /** 充值 */
    public PlusApiResultCashRechargeVO recharge(CashRechargeForm body) throws Exception {
        return (PlusApiResultCashRechargeVO) client.post(ApiPaths.appPath("/account/cash/recharge"), body);
    }

    /** 获取积分账户信息 */
    public PlusApiResultPointsAccountInfoVO getPoints() throws Exception {
        return (PlusApiResultPointsAccountInfoVO) client.get(ApiPaths.appPath("/account/points"));
    }

    /** 获取Token账户信息 */
    public PlusApiResultPointsAccountInfoVO getToken() throws Exception {
        return (PlusApiResultPointsAccountInfoVO) client.get(ApiPaths.appPath("/account/points/token"));
    }

    /** 获取交易历史 */
    public PlusApiResultPageHistoryVO getHistory(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageHistoryVO) client.get(ApiPaths.appPath("/account/points/history"), params);
    }

    /** 获取现金账户信息 */
    public PlusApiResultCashAccountInfoVO getCash() throws Exception {
        return (PlusApiResultCashAccountInfoVO) client.get(ApiPaths.appPath("/account/cash"));
    }

    /** 获取交易历史 */
    public PlusApiResultPageHistoryVO getHistoryCash(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageHistoryVO) client.get(ApiPaths.appPath("/account/cash/history"), params);
    }
}
