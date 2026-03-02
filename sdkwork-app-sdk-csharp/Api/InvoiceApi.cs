using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class InvoiceApi
    {
        private readonly HttpClient _client;

        public InvoiceApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 获取发票详情
        /// </summary>
        public async Task<PlusApiResultInvoiceDetailVO?> GetInvoiceAsync(string invoiceId)
        {
            return await _client.GetAsync<PlusApiResultInvoiceDetailVO>(ApiPaths.AppPath($"/invoice/{invoiceId}"));
        }

        /// <summary>
        /// 更新发票
        /// </summary>
        public async Task<PlusApiResultInvoiceVO?> UpdateInvoiceAsync(string invoiceId, InvoiceUpdateForm body)
        {
            return await _client.PutAsync<PlusApiResultInvoiceVO>(ApiPaths.AppPath($"/invoice/{invoiceId}"), body);
        }

        /// <summary>
        /// 创建发票
        /// </summary>
        public async Task<PlusApiResultInvoiceVO?> CreateInvoiceAsync(InvoiceCreateForm body)
        {
            return await _client.PostAsync<PlusApiResultInvoiceVO>(ApiPaths.AppPath("/invoice"), body);
        }

        /// <summary>
        /// 提交发票
        /// </summary>
        public async Task<PlusApiResultInvoiceVO?> SubmitAsync(string invoiceId)
        {
            return await _client.PostAsync<PlusApiResultInvoiceVO>(ApiPaths.AppPath($"/invoice/{invoiceId}/submit"), null);
        }

        /// <summary>
        /// 作废发票
        /// </summary>
        public async Task<PlusApiResultVoid?> CancelAsync(string invoiceId, InvoiceCancelForm body)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/invoice/{invoiceId}/cancel"), body);
        }

        /// <summary>
        /// 获取发票明细
        /// </summary>
        public async Task<PlusApiResultListInvoiceItemVO?> GetInvoiceItemsAsync(string invoiceId)
        {
            return await _client.GetAsync<PlusApiResultListInvoiceItemVO>(ApiPaths.AppPath($"/invoice/{invoiceId}/items"));
        }

        /// <summary>
        /// 获取发票统计
        /// </summary>
        public async Task<PlusApiResultInvoiceStatisticsVO?> GetInvoiceStatisticsAsync()
        {
            return await _client.GetAsync<PlusApiResultInvoiceStatisticsVO>(ApiPaths.AppPath("/invoice/statistics"));
        }

        /// <summary>
        /// 搜索发票
        /// </summary>
        public async Task<PlusApiResultPageInvoiceVO?> SearchInvoicesAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageInvoiceVO>(ApiPaths.AppPath("/invoice/search"), query);
        }

        /// <summary>
        /// 获取我的发票
        /// </summary>
        public async Task<PlusApiResultPageInvoiceVO?> GetMyInvoicesAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageInvoiceVO>(ApiPaths.AppPath("/invoice/my"), query);
        }
    }
}
