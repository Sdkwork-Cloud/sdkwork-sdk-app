using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class OrdersApi
    {
        private readonly HttpClient _client;

        public OrdersApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 获取订单列表
        /// </summary>
        public async Task<PlusApiResultPageOrderVO?> ListOrdersAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageOrderVO>(ApiPaths.AppPath("/orders"), query);
        }

        /// <summary>
        /// 创建订单
        /// </summary>
        public async Task<PlusApiResultOrderVO?> CreateOrderAsync(OrderCreateForm body)
        {
            return await _client.PostAsync<PlusApiResultOrderVO>(ApiPaths.AppPath("/orders"), body);
        }

        /// <summary>
        /// 申请退款
        /// </summary>
        public async Task<PlusApiResultVoid?> ApplyRefundAsync(string orderId, RefundApplyForm body)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/orders/{orderId}/refund"), body);
        }

        /// <summary>
        /// 订单支付
        /// </summary>
        public async Task<PlusApiResultPaymentParamsVO?> PayOrderAsync(string orderId, OrderPayForm body)
        {
            return await _client.PostAsync<PlusApiResultPaymentParamsVO>(ApiPaths.AppPath($"/orders/{orderId}/pay"), body);
        }

        /// <summary>
        /// 确认收货
        /// </summary>
        public async Task<PlusApiResultVoid?> ConfirmReceiptAsync(string orderId)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/orders/{orderId}/confirm"), null);
        }

        /// <summary>
        /// 取消订单
        /// </summary>
        public async Task<PlusApiResultVoid?> CancelOrderAsync(string orderId, OrderCancelForm body)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/orders/{orderId}/cancel"), body);
        }

        /// <summary>
        /// 获取订单详情
        /// </summary>
        public async Task<PlusApiResultOrderDetailVO?> GetOrderDetailAsync(string orderId)
        {
            return await _client.GetAsync<PlusApiResultOrderDetailVO>(ApiPaths.AppPath($"/orders/{orderId}"));
        }

        /// <summary>
        /// 删除订单
        /// </summary>
        public async Task<PlusApiResultVoid?> DeleteOrderAsync(string orderId)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/orders/{orderId}"));
        }

        /// <summary>
        /// 获取订单状态
        /// </summary>
        public async Task<PlusApiResultOrderStatusVO?> GetOrderStatusAsync(string orderId)
        {
            return await _client.GetAsync<PlusApiResultOrderStatusVO>(ApiPaths.AppPath($"/orders/{orderId}/status"));
        }

        /// <summary>
        /// 获取订单统计
        /// </summary>
        public async Task<PlusApiResultOrderStatisticsVO?> GetOrderStatisticsAsync()
        {
            return await _client.GetAsync<PlusApiResultOrderStatisticsVO>(ApiPaths.AppPath("/orders/statistics"));
        }
    }
}
