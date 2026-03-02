using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class VipApi
    {
        private readonly HttpClient _client;

        public VipApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 购买VIP
        /// </summary>
        public async Task<PlusApiResultVipPurchaseVO?> PurchaseAsync(VipPurchaseForm body)
        {
            return await _client.PostAsync<PlusApiResultVipPurchaseVO>(ApiPaths.AppPath("/vip/purchase"), body);
        }

        /// <summary>
        /// 升级VIP
        /// </summary>
        public async Task<PlusApiResultVipPurchaseVO?> UpgradeAsync(VipUpgradeForm body)
        {
            return await _client.PostAsync<PlusApiResultVipPurchaseVO>(ApiPaths.AppPath("/vip/purchase/upgrade"), body);
        }

        /// <summary>
        /// 续费VIP
        /// </summary>
        public async Task<PlusApiResultVipPurchaseVO?> RenewAsync(VipRenewForm body)
        {
            return await _client.PostAsync<PlusApiResultVipPurchaseVO>(ApiPaths.AppPath("/vip/purchase/renew"), body);
        }

        /// <summary>
        /// 使用加速特权
        /// </summary>
        public async Task<PlusApiResultVoid?> UseSpeedUpPrivilegeAsync(SpeedUpForm body)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath("/vip/privilege/speed-up"), body);
        }

        /// <summary>
        /// 领取每日奖励
        /// </summary>
        public async Task<PlusApiResultVipDailyRewardVO?> ClaimDailyRewardAsync()
        {
            return await _client.PostAsync<PlusApiResultVipDailyRewardVO>(ApiPaths.AppPath("/vip/points/daily-reward"), null);
        }

        /// <summary>
        /// 邀请好友
        /// </summary>
        public async Task<PlusApiResultVipInviteVO?> InviteFriendAsync(VipInviteForm body)
        {
            return await _client.PostAsync<PlusApiResultVipInviteVO>(ApiPaths.AppPath("/vip/invite"), body);
        }

        /// <summary>
        /// 领取优惠券
        /// </summary>
        public async Task<PlusApiResultVoid?> ClaimCouponAsync(string couponId)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/vip/coupons/{couponId}/claim"), null);
        }

        /// <summary>
        /// 获取VIP状态
        /// </summary>
        public async Task<PlusApiResultVipStatusVO?> GetVipStatusAsync()
        {
            return await _client.GetAsync<PlusApiResultVipStatusVO>(ApiPaths.AppPath("/vip/status"));
        }

        /// <summary>
        /// 获取特权使用情况
        /// </summary>
        public async Task<PlusApiResultVipPrivilegeUsageVO?> GetPrivilegeUsageAsync()
        {
            return await _client.GetAsync<PlusApiResultVipPrivilegeUsageVO>(ApiPaths.AppPath("/vip/privilege/usage"));
        }

        /// <summary>
        /// 获取积分明细
        /// </summary>
        public async Task<PlusApiResultListVipPointsHistoryVO?> GetPointsHistoryAsync()
        {
            return await _client.GetAsync<PlusApiResultListVipPointsHistoryVO>(ApiPaths.AppPath("/vip/points/history"));
        }

        /// <summary>
        /// 获取每日奖励状态
        /// </summary>
        public async Task<PlusApiResultVipDailyRewardStatusVO?> GetDailyRewardStatusAsync()
        {
            return await _client.GetAsync<PlusApiResultVipDailyRewardStatusVO>(ApiPaths.AppPath("/vip/points/daily-reward/status"));
        }

        /// <summary>
        /// 获取积分余额
        /// </summary>
        public async Task<PlusApiResultLong?> GetPointsBalanceAsync()
        {
            return await _client.GetAsync<PlusApiResultLong>(ApiPaths.AppPath("/vip/points/balance"));
        }

        /// <summary>
        /// 获取套餐分组列表
        /// </summary>
        public async Task<PlusApiResultListVipPackGroupVO?> ListPackGroupsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultListVipPackGroupVO>(ApiPaths.AppPath("/vip/pack-groups"), query);
        }

        /// <summary>
        /// 获取分组详情
        /// </summary>
        public async Task<PlusApiResultVipPackGroupDetailVO?> GetPackGroupDetailAsync(string groupId)
        {
            return await _client.GetAsync<PlusApiResultVipPackGroupDetailVO>(ApiPaths.AppPath($"/vip/pack-groups/{groupId}"));
        }

        /// <summary>
        /// 获取分组套餐
        /// </summary>
        public async Task<PlusApiResultListVipPackVO?> ListPacksByGroupAsync(string groupId)
        {
            return await _client.GetAsync<PlusApiResultListVipPackVO>(ApiPaths.AppPath($"/vip/pack-groups/{groupId}/packs"));
        }

        /// <summary>
        /// 获取所有套餐
        /// </summary>
        public async Task<PlusApiResultListVipPackVO?> ListAllPacksAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultListVipPackVO>(ApiPaths.AppPath("/vip/pack-groups/packs"), query);
        }

        /// <summary>
        /// 获取套餐详情
        /// </summary>
        public async Task<PlusApiResultVipPackDetailVO?> GetPackDetailAsync(string packId)
        {
            return await _client.GetAsync<PlusApiResultVipPackDetailVO>(ApiPaths.AppPath($"/vip/pack-groups/packs/{packId}"));
        }

        /// <summary>
        /// 对比套餐
        /// </summary>
        public async Task<PlusApiResultListVipPackGroupVO?> ComparePacksAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultListVipPackGroupVO>(ApiPaths.AppPath("/vip/pack-groups/compare"), query);
        }

        /// <summary>
        /// 获取VIP等级列表
        /// </summary>
        public async Task<PlusApiResultListVipLevelVO?> ListVipLevelsAsync()
        {
            return await _client.GetAsync<PlusApiResultListVipLevelVO>(ApiPaths.AppPath("/vip/levels"));
        }

        /// <summary>
        /// 获取邀请规则
        /// </summary>
        public async Task<PlusApiResultInviteRulesVO?> GetInviteRulesAsync()
        {
            return await _client.GetAsync<PlusApiResultInviteRulesVO>(ApiPaths.AppPath("/vip/invite/rules"));
        }

        /// <summary>
        /// 获取邀请记录
        /// </summary>
        public async Task<PlusApiResultListVipInviteRecordVO?> GetInviteRecordsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultListVipInviteRecordVO>(ApiPaths.AppPath("/vip/invite/records"), query);
        }

        /// <summary>
        /// 获取邀请信息
        /// </summary>
        public async Task<PlusApiResultVipInviteInfoVO?> GetInviteInfoAsync()
        {
            return await _client.GetAsync<PlusApiResultVipInviteInfoVO>(ApiPaths.AppPath("/vip/invite/info"));
        }

        /// <summary>
        /// 获取VIP信息
        /// </summary>
        public async Task<PlusApiResultVipInfoVO?> GetVipInfoAsync()
        {
            return await _client.GetAsync<PlusApiResultVipInfoVO>(ApiPaths.AppPath("/vip/info"));
        }

        /// <summary>
        /// 获取VIP优惠券
        /// </summary>
        public async Task<PlusApiResultListVipCouponVO?> ListVipCouponsAsync()
        {
            return await _client.GetAsync<PlusApiResultListVipCouponVO>(ApiPaths.AppPath("/vip/coupons"));
        }

        /// <summary>
        /// 获取我的优惠券
        /// </summary>
        public async Task<PlusApiResultListVipCouponVO?> ListMyCouponsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultListVipCouponVO>(ApiPaths.AppPath("/vip/coupons/my"), query);
        }

        /// <summary>
        /// 检查VIP状态
        /// </summary>
        public async Task<PlusApiResultBoolean?> CheckVipStatusAsync()
        {
            return await _client.GetAsync<PlusApiResultBoolean>(ApiPaths.AppPath("/vip/check"));
        }

        /// <summary>
        /// 获取VIP权益
        /// </summary>
        public async Task<PlusApiResultListVipBenefitVO?> ListVipBenefitsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultListVipBenefitVO>(ApiPaths.AppPath("/vip/benefits"), query);
        }
    }
}
