using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class PaymentsApi
    {
        private readonly HttpClient _client;

        public PaymentsApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 创建支付
        /// </summary>
        public async Task<PlusApiResultPaymentVO?> CreatePaymentAsync(PaymentCreateForm body)
        {
            return await _client.PostAsync<PlusApiResultPaymentVO>(ApiPaths.AppPath("/payments"), body);
        }

        /// <summary>
        /// 关闭支付
        /// </summary>
        public async Task<PlusApiResultVoid?> ClosePaymentAsync(string paymentId)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/payments/{paymentId}/close"), null);
        }

        /// <summary>
        /// 通用支付回调
        /// </summary>
        public async Task<PaymentCallbackResponse?> PaymentCallbackAsync(string provider, PaymentCallbackRequest body)
        {
            return await _client.PostAsync<PaymentCallbackResponse>(ApiPaths.AppPath($"/payments/callback/{provider}"), body);
        }

        /// <summary>
        /// 微信支付回调
        /// </summary>
        public async Task<string?> WechatPayCallbackAsync(string body)
        {
            return await _client.PostAsync<string>(ApiPaths.AppPath("/payments/callback/wechat"), body);
        }

        /// <summary>
        /// 支付宝回调
        /// </summary>
        public async Task<string?> AlipayCallbackAsync(Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<string>(ApiPaths.AppPath("/payments/callback/alipay"), null, query);
        }

        /// <summary>
        /// 查询支付详情
        /// </summary>
        public async Task<PlusApiResultPaymentStatusVO?> GetPaymentDetailAsync(string paymentId)
        {
            return await _client.GetAsync<PlusApiResultPaymentStatusVO>(ApiPaths.AppPath($"/payments/{paymentId}"));
        }

        /// <summary>
        /// 查询支付状态
        /// </summary>
        public async Task<PlusApiResultPaymentStatusVO?> GetPaymentStatusAsync(string paymentId)
        {
            return await _client.GetAsync<PlusApiResultPaymentStatusVO>(ApiPaths.AppPath($"/payments/{paymentId}/status"));
        }

        /// <summary>
        /// 获取支付统计
        /// </summary>
        public async Task<PlusApiResultPaymentStatisticsVO?> GetPaymentStatisticsAsync()
        {
            return await _client.GetAsync<PlusApiResultPaymentStatisticsVO>(ApiPaths.AppPath("/payments/statistics"));
        }

        /// <summary>
        /// 获取支付记录
        /// </summary>
        public async Task<PlusApiResultPagePaymentStatusVO?> ListPaymentRecordsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPagePaymentStatusVO>(ApiPaths.AppPath("/payments/records"), query);
        }

        /// <summary>
        /// 根据商户订单号查询支付状态
        /// </summary>
        public async Task<PlusApiResultPaymentStatusVO?> GetPaymentStatusByOutTradeNoAsync(string outTradeNo)
        {
            return await _client.GetAsync<PlusApiResultPaymentStatusVO>(ApiPaths.AppPath($"/payments/outTradeNo/{outTradeNo}/status"));
        }

        /// <summary>
        /// 获取订单的支付记录
        /// </summary>
        public async Task<PlusApiResultListPaymentStatusVO?> ListOrderAsync(string orderId)
        {
            return await _client.GetAsync<PlusApiResultListPaymentStatusVO>(ApiPaths.AppPath($"/payments/order/{orderId}"));
        }

        /// <summary>
        /// 获取支付方式
        /// </summary>
        public async Task<PlusApiResultListPaymentMethodVO?> ListPaymentMethodsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultListPaymentMethodVO>(ApiPaths.AppPath("/payments/methods"), query);
        }
    }
}
