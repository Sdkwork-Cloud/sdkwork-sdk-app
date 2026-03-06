using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class CouponsApi
    {
        private readonly HttpClient _client;

        public CouponsApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 领取优惠券
        /// </summary>
        public async Task<PlusApiResultUserCouponVO?> ReceiveCouponAsync(string couponId)
        {
            return await _client.PostAsync<PlusApiResultUserCouponVO>(ApiPaths.AppPath($"/coupons/{couponId}/receive"), null);
        }

        /// <summary>
        /// 积分兑换优惠券
        /// </summary>
        public async Task<PlusApiResultUserCouponVO?> ExchangeCouponByPointsAsync(string couponId, CouponPointsExchangeForm body)
        {
            return await _client.PostAsync<PlusApiResultUserCouponVO>(ApiPaths.AppPath($"/coupons/{couponId}/exchange/points"), body);
        }

        /// <summary>
        /// 兑换优惠券
        /// </summary>
        public async Task<PlusApiResultUserCouponVO?> RedeemCouponAsync(CouponRedeemForm body)
        {
            return await _client.PostAsync<PlusApiResultUserCouponVO>(ApiPaths.AppPath("/coupons/redeem"), body);
        }

        /// <summary>
        /// 使用优惠券
        /// </summary>
        public async Task<PlusApiResultUserCouponVO?> UseCouponAsync(string userCouponId, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultUserCouponVO>(ApiPaths.AppPath($"/coupons/my/{userCouponId}/use"), null, query);
        }

        /// <summary>
        /// 回滚积分兑换优惠券
        /// </summary>
        public async Task<PlusApiResultUserCouponVO?> RollbackPointsExchangeCouponAsync(string userCouponId, CouponRollbackForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultUserCouponVO>(ApiPaths.AppPath($"/coupons/my/{userCouponId}/rollback"), body);
        }

        /// <summary>
        /// 取消使用优惠券
        /// </summary>
        public async Task<PlusApiResultUserCouponVO?> CancelUseCouponAsync(string userCouponId)
        {
            return await _client.PostAsync<PlusApiResultUserCouponVO>(ApiPaths.AppPath($"/coupons/my/{userCouponId}/cancel"), null);
        }

        /// <summary>
        /// 获取可领取优惠券列表
        /// </summary>
        public async Task<PlusApiResultPageCouponVO?> ListCouponsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageCouponVO>(ApiPaths.AppPath("/coupons"), query);
        }

        /// <summary>
        /// 获取优惠券详情
        /// </summary>
        public async Task<PlusApiResultCouponVO?> GetCouponDetailAsync(string couponId)
        {
            return await _client.GetAsync<PlusApiResultCouponVO>(ApiPaths.AppPath($"/coupons/{couponId}"));
        }

        /// <summary>
        /// 获取优惠券统计
        /// </summary>
        public async Task<PlusApiResultCouponStatisticsVO?> GetStatisticsAsync()
        {
            return await _client.GetAsync<PlusApiResultCouponStatisticsVO>(ApiPaths.AppPath("/coupons/statistics"));
        }

        /// <summary>
        /// 获取我的优惠券列表
        /// </summary>
        public async Task<PlusApiResultPageUserCouponVO?> GetMyAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageUserCouponVO>(ApiPaths.AppPath("/coupons/my"), query);
        }

        /// <summary>
        /// 获取用户优惠券详情
        /// </summary>
        public async Task<PlusApiResultUserCouponVO?> GetUserCouponDetailAsync(string userCouponId)
        {
            return await _client.GetAsync<PlusApiResultUserCouponVO>(ApiPaths.AppPath($"/coupons/my/{userCouponId}"));
        }

        /// <summary>
        /// 获取可用优惠券列表
        /// </summary>
        public async Task<PlusApiResultPageUserCouponVO?> GetAvailableAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageUserCouponVO>(ApiPaths.AppPath("/coupons/my/available"), query);
        }
    }
}
