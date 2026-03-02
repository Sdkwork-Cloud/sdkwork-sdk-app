using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class AccountApi
    {
        private readonly HttpClient _client;

        public AccountApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 积分转账
        /// </summary>
        public async Task<PlusApiResultPointsTransferVO?> TransferAsync(PointsTransferForm body)
        {
            return await _client.PostAsync<PlusApiResultPointsTransferVO>(ApiPaths.AppPath("/account/points/transfer"), body);
        }

        /// <summary>
        /// 扣除Token
        /// </summary>
        public async Task<PlusApiResultPointsAccountInfoVO?> DeductTokenAsync(Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPointsAccountInfoVO>(ApiPaths.AppPath("/account/points/token/deduct"), null, query);
        }

        /// <summary>
        /// 积分兑换
        /// </summary>
        public async Task<PlusApiResultPointsExchangeVO?> ExchangeAsync(PointsExchangeForm body)
        {
            return await _client.PostAsync<PlusApiResultPointsExchangeVO>(ApiPaths.AppPath("/account/points/exchange"), body);
        }

        /// <summary>
        /// 提现
        /// </summary>
        public async Task<PlusApiResultCashWithdrawVO?> WithdrawAsync(CashWithdrawForm body)
        {
            return await _client.PostAsync<PlusApiResultCashWithdrawVO>(ApiPaths.AppPath("/account/cash/withdraw"), body);
        }

        /// <summary>
        /// 转账
        /// </summary>
        public async Task<PlusApiResultCashTransferVO?> CreateTransferAsync(CashTransferForm body)
        {
            return await _client.PostAsync<PlusApiResultCashTransferVO>(ApiPaths.AppPath("/account/cash/transfer"), body);
        }

        /// <summary>
        /// 充值
        /// </summary>
        public async Task<PlusApiResultCashRechargeVO?> RechargeAsync(CashRechargeForm body)
        {
            return await _client.PostAsync<PlusApiResultCashRechargeVO>(ApiPaths.AppPath("/account/cash/recharge"), body);
        }

        /// <summary>
        /// 获取积分账户信息
        /// </summary>
        public async Task<PlusApiResultPointsAccountInfoVO?> GetPointsAsync()
        {
            return await _client.GetAsync<PlusApiResultPointsAccountInfoVO>(ApiPaths.AppPath("/account/points"));
        }

        /// <summary>
        /// 获取Token账户信息
        /// </summary>
        public async Task<PlusApiResultPointsAccountInfoVO?> GetTokenAsync()
        {
            return await _client.GetAsync<PlusApiResultPointsAccountInfoVO>(ApiPaths.AppPath("/account/points/token"));
        }

        /// <summary>
        /// 获取交易历史
        /// </summary>
        public async Task<PlusApiResultPageHistoryVO?> GetHistoryAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageHistoryVO>(ApiPaths.AppPath("/account/points/history"), query);
        }

        /// <summary>
        /// 获取现金账户信息
        /// </summary>
        public async Task<PlusApiResultCashAccountInfoVO?> GetCashAsync()
        {
            return await _client.GetAsync<PlusApiResultCashAccountInfoVO>(ApiPaths.AppPath("/account/cash"));
        }

        /// <summary>
        /// 获取交易历史
        /// </summary>
        public async Task<PlusApiResultPageHistoryVO?> GetHistoryCashAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageHistoryVO>(ApiPaths.AppPath("/account/cash/history"), query);
        }
    }
}
