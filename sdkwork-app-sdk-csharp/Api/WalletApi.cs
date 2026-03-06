using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class WalletApi
    {
        private readonly HttpClient _client;

        public WalletApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 钱包提现
        /// </summary>
        public async Task<PlusApiResultWalletOperationResultVO?> WithdrawAsync(WalletWithdrawalForm body)
        {
            return await _client.PostAsync<PlusApiResultWalletOperationResultVO>(ApiPaths.AppPath("/wallet/withdrawals"), body);
        }

        /// <summary>
        /// 钱包转账
        /// </summary>
        public async Task<PlusApiResultWalletOperationResultVO?> TransferAsync(WalletTransferForm body)
        {
            return await _client.PostAsync<PlusApiResultWalletOperationResultVO>(ApiPaths.AppPath("/wallet/transfers"), body);
        }

        /// <summary>
        /// 钱包充值
        /// </summary>
        public async Task<PlusApiResultWalletOperationResultVO?> TopupAsync(WalletTopupForm body)
        {
            return await _client.PostAsync<PlusApiResultWalletOperationResultVO>(ApiPaths.AppPath("/wallet/topups"), body);
        }

        /// <summary>
        /// 钱包兑换
        /// </summary>
        public async Task<PlusApiResultWalletOperationResultVO?> ExchangeAsync(WalletExchangeForm body)
        {
            return await _client.PostAsync<PlusApiResultWalletOperationResultVO>(ApiPaths.AppPath("/wallet/exchanges"), body);
        }

        /// <summary>
        /// 钱包总览
        /// </summary>
        public async Task<PlusApiResultWalletOverviewVO?> GetOverviewAsync()
        {
            return await _client.GetAsync<PlusApiResultWalletOverviewVO>(ApiPaths.AppPath("/wallet"));
        }

        /// <summary>
        /// 钱包流水分页
        /// </summary>
        public async Task<PlusApiResultPageHistoryVO?> ListTransactionsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageHistoryVO>(ApiPaths.AppPath("/wallet/transactions"), query);
        }

        /// <summary>
        /// 交易详情
        /// </summary>
        public async Task<PlusApiResultHistoryVO?> GetTransactionAsync(string transactionId)
        {
            return await _client.GetAsync<PlusApiResultHistoryVO>(ApiPaths.AppPath($"/wallet/transactions/{transactionId}"));
        }

        /// <summary>
        /// 按请求号查询操作状态
        /// </summary>
        public async Task<PlusApiResultWalletOperationStatusVO?> GetOperationStatusAsync(string requestNo, Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultWalletOperationStatusVO>(ApiPaths.AppPath($"/wallet/operations/{requestNo}"), query);
        }

        /// <summary>
        /// 资产账户列表
        /// </summary>
        public async Task<PlusApiResultListWalletAssetAccountVO?> ListAccountsAsync()
        {
            return await _client.GetAsync<PlusApiResultListWalletAssetAccountVO>(ApiPaths.AppPath("/wallet/accounts"));
        }
    }
}
