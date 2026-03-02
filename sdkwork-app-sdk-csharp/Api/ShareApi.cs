using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class ShareApi
    {
        private readonly HttpClient _client;

        public ShareApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 更新分享设置
        /// </summary>
        public async Task<PlusApiResultShareRecordVO?> UpdateShareSettingsAsync(string shareId, ShareUpdateForm body)
        {
            return await _client.PutAsync<PlusApiResultShareRecordVO>(ApiPaths.AppPath($"/share/{shareId}"), body);
        }

        /// <summary>
        /// 取消分享
        /// </summary>
        public async Task<PlusApiResultVoid?> CancelAsync(string shareId)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/share/{shareId}"));
        }

        /// <summary>
        /// 创建分享
        /// </summary>
        public async Task<PlusApiResultShareCreateVO?> CreateShareAsync(ShareCreateForm body)
        {
            return await _client.PostAsync<PlusApiResultShareCreateVO>(ApiPaths.AppPath("/share"), body);
        }

        /// <summary>
        /// 访问分享
        /// </summary>
        public async Task<PlusApiResultVoid?> VisitAsync(string shareCode, ShareVisitForm body)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/share/{shareCode}/visit"), body);
        }

        /// <summary>
        /// 验证分享密码
        /// </summary>
        public async Task<PlusApiResultShareVerifyVO?> VerifySharePasswordAsync(string shareCode, ShareVerifyForm body)
        {
            return await _client.PostAsync<PlusApiResultShareVerifyVO>(ApiPaths.AppPath($"/share/{shareCode}/verify"), body);
        }

        /// <summary>
        /// 上报分享
        /// </summary>
        public async Task<PlusApiResultVoid?> TrackAsync(ShareTrackForm body)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath("/share/track"), body);
        }

        /// <summary>
        /// 生成分享海报
        /// </summary>
        public async Task<PlusApiResultSharePosterVO?> GenerateSharePosterAsync(SharePosterForm body)
        {
            return await _client.PostAsync<PlusApiResultSharePosterVO>(ApiPaths.AppPath("/share/poster"), body);
        }

        /// <summary>
        /// 领取邀请奖励
        /// </summary>
        public async Task<PlusApiResultInviteRewardClaimVO?> ClaimInviteRewardAsync(string rewardId)
        {
            return await _client.PostAsync<PlusApiResultInviteRewardClaimVO>(ApiPaths.AppPath($"/share/invite/rewards/{rewardId}/claim"), null);
        }

        /// <summary>
        /// 生成邀请链接
        /// </summary>
        public async Task<PlusApiResultInviteLinkVO?> GenerateInviteLinkAsync(InviteLinkForm body)
        {
            return await _client.PostAsync<PlusApiResultInviteLinkVO>(ApiPaths.AppPath("/share/invite/link"), body);
        }

        /// <summary>
        /// 获取访问记录
        /// </summary>
        public async Task<PlusApiResultPageShareVisitorVO?> GetShareVisitorsAsync(string shareId, Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageShareVisitorVO>(ApiPaths.AppPath($"/share/{shareId}/visitors"), query);
        }

        /// <summary>
        /// 获取分享统计
        /// </summary>
        public async Task<PlusApiResultShareStatisticsVO?> GetShareStatisticsAsync(string shareId)
        {
            return await _client.GetAsync<PlusApiResultShareStatisticsVO>(ApiPaths.AppPath($"/share/{shareId}/statistics"));
        }

        /// <summary>
        /// 获取分享信息
        /// </summary>
        public async Task<PlusApiResultShareInfoVO?> GetShareInfoAsync(string shareCode, Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultShareInfoVO>(ApiPaths.AppPath($"/share/{shareCode}"), query);
        }

        /// <summary>
        /// 获取分享平台配置
        /// </summary>
        public async Task<PlusApiResultListSharePlatformVO?> GetSharePlatformsAsync()
        {
            return await _client.GetAsync<PlusApiResultListSharePlatformVO>(ApiPaths.AppPath("/share/platforms"));
        }

        /// <summary>
        /// 获取我的分享
        /// </summary>
        public async Task<PlusApiResultPageShareRecordVO?> ListMySharesAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageShareRecordVO>(ApiPaths.AppPath("/share/my-shares"), query);
        }

        /// <summary>
        /// 获取邀请记录
        /// </summary>
        public async Task<PlusApiResultPageInviteRecordVO?> GetInviteRecordsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageInviteRecordVO>(ApiPaths.AppPath("/share/invite/records"), query);
        }

        /// <summary>
        /// 获取邀请信息
        /// </summary>
        public async Task<PlusApiResultInviteInfoVO?> GetInviteInfoAsync()
        {
            return await _client.GetAsync<PlusApiResultInviteInfoVO>(ApiPaths.AppPath("/share/invite/info"));
        }

        /// <summary>
        /// 批量取消分享
        /// </summary>
        public async Task<PlusApiResultVoid?> BatchCancelSharesAsync()
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath("/share/batch"));
        }
    }
}
