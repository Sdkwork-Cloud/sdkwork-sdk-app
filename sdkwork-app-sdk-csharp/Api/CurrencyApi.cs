using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class CurrencyApi
    {
        private readonly HttpClient _client;

        public CurrencyApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 创建货币
        /// </summary>
        public async Task<PlusApiResultCurrencyVO?> CreateCurrencyAsync(CurrencyCreateForm body)
        {
            return await _client.PostAsync<PlusApiResultCurrencyVO>(ApiPaths.AppPath("/currency"), body);
        }

        /// <summary>
        /// 禁用货币
        /// </summary>
        public async Task<PlusApiResultCurrencyVO?> DeactivateAsync(string currencyId)
        {
            return await _client.PostAsync<PlusApiResultCurrencyVO>(ApiPaths.AppPath($"/currency/{currencyId}/deactivate"), null);
        }

        /// <summary>
        /// 启用货币
        /// </summary>
        public async Task<PlusApiResultCurrencyVO?> ActivateAsync(string currencyId)
        {
            return await _client.PostAsync<PlusApiResultCurrencyVO>(ApiPaths.AppPath($"/currency/{currencyId}/activate"), null);
        }

        /// <summary>
        /// 创建汇率
        /// </summary>
        public async Task<PlusApiResultExchangeRateVO?> CreateExchangeRateAsync(ExchangeRateCreateForm body)
        {
            return await _client.PostAsync<PlusApiResultExchangeRateVO>(ApiPaths.AppPath("/currency/rate"), body);
        }

        /// <summary>
        /// 货币兑换计算
        /// </summary>
        public async Task<PlusApiResultCurrencyConvertVO?> ConvertAsync(CurrencyConvertForm body)
        {
            return await _client.PostAsync<PlusApiResultCurrencyConvertVO>(ApiPaths.AppPath("/currency/convert"), body);
        }

        /// <summary>
        /// 获取货币详情
        /// </summary>
        public async Task<PlusApiResultCurrencyVO?> GetCurrencyAsync(string currencyId)
        {
            return await _client.GetAsync<PlusApiResultCurrencyVO>(ApiPaths.AppPath($"/currency/{currencyId}"));
        }

        /// <summary>
        /// 获取货币类型列表
        /// </summary>
        public async Task<PlusApiResultListCurrencyTypeVO?> GetCurrencyTypesAsync()
        {
            return await _client.GetAsync<PlusApiResultListCurrencyTypeVO>(ApiPaths.AppPath("/currency/types"));
        }

        /// <summary>
        /// 获取最新汇率
        /// </summary>
        public async Task<PlusApiResultExchangeRateVO?> GetLatestRateAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultExchangeRateVO>(ApiPaths.AppPath("/currency/rate/latest"), query);
        }

        /// <summary>
        /// 获取汇率历史
        /// </summary>
        public async Task<PlusApiResultListExchangeRateVO?> GetRateHistoryAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultListExchangeRateVO>(ApiPaths.AppPath("/currency/rate/history"), query);
        }

        /// <summary>
        /// 获取货币列表
        /// </summary>
        public async Task<PlusApiResultPageCurrencyVO?> GetCurrencyListAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageCurrencyVO>(ApiPaths.AppPath("/currency/list"), query);
        }

        /// <summary>
        /// 根据代码获取货币
        /// </summary>
        public async Task<PlusApiResultCurrencyVO?> GetCurrencyByCodeAsync(string code)
        {
            return await _client.GetAsync<PlusApiResultCurrencyVO>(ApiPaths.AppPath($"/currency/code/{code}"));
        }

        /// <summary>
        /// 获取启用的货币
        /// </summary>
        public async Task<PlusApiResultListCurrencyVO?> GetActiveCurrenciesAsync()
        {
            return await _client.GetAsync<PlusApiResultListCurrencyVO>(ApiPaths.AppPath("/currency/active"));
        }
    }
}
