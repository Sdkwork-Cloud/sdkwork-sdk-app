using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class AdvertApi
    {
        private readonly HttpClient _client;

        public AdvertApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 广告设置
        /// </summary>
        public async Task<PlusApiResultAdvertSettingsVO?> GetAdvertSettingsAsync()
        {
            return await _client.GetAsync<PlusApiResultAdvertSettingsVO>(ApiPaths.AppPath("/advert/settings"));
        }

        /// <summary>
        /// 更新广告设置
        /// </summary>
        public async Task<PlusApiResultVoid?> UpdateAdvertSettingsAsync(AdvertSettingsUpdateForm body)
        {
            return await _client.PutAsync<PlusApiResultVoid>(ApiPaths.AppPath("/advert/settings"), body);
        }

        /// <summary>
        /// 广告反馈
        /// </summary>
        public async Task<PlusApiResultVoid?> ReportAsync(string adId, AdvertReportForm body)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/advert/{adId}/report"), body);
        }

        /// <summary>
        /// 上报播放进度
        /// </summary>
        public async Task<PlusApiResultVoid?> TrackVideoProgressAsync(string adId, VideoProgressForm body)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/advert/{adId}/progress"), body);
        }

        /// <summary>
        /// 上报展示
        /// </summary>
        public async Task<PlusApiResultVoid?> TrackImpressionAsync(string adId, AdvertImpressionForm body)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/advert/{adId}/impression"), body);
        }

        /// <summary>
        /// 上报播放完成
        /// </summary>
        public async Task<PlusApiResultVoid?> TrackVideoCompleteAsync(string adId, VideoCompleteForm body)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/advert/{adId}/complete"), body);
        }

        /// <summary>
        /// 上报关闭
        /// </summary>
        public async Task<PlusApiResultVoid?> TrackCloseAsync(string adId, AdvertCloseForm body)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/advert/{adId}/close"), body);
        }

        /// <summary>
        /// 上报点击
        /// </summary>
        public async Task<PlusApiResultVoid?> TrackClickAsync(string adId, AdvertClickForm body)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/advert/{adId}/click"), body);
        }

        /// <summary>
        /// 屏蔽广告
        /// </summary>
        public async Task<PlusApiResultVoid?> BlockAsync(string adId, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/advert/{adId}/block"), null, query);
        }

        /// <summary>
        /// 验证奖励
        /// </summary>
        public async Task<PlusApiResultRewardVerifyVO?> VerifyRewardAsync(RewardVerifyForm body)
        {
            return await _client.PostAsync<PlusApiResultRewardVerifyVO>(ApiPaths.AppPath("/advert/rewarded/verify"), body);
        }

        /// <summary>
        /// 开屏广告
        /// </summary>
        public async Task<PlusApiResultSplashAdvertVO?> GetSplashAsync()
        {
            return await _client.GetAsync<PlusApiResultSplashAdvertVO>(ApiPaths.AppPath("/advert/splash"));
        }

        /// <summary>
        /// 激励视频广告
        /// </summary>
        public async Task<PlusApiResultRewardedAdvertVO?> GetRewardedAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultRewardedAdvertVO>(ApiPaths.AppPath("/advert/rewarded"), query);
        }

        /// <summary>
        /// 广告位列表
        /// </summary>
        public async Task<PlusApiResultListAdvertPositionVO?> ListAdvertPositionsAsync()
        {
            return await _client.GetAsync<PlusApiResultListAdvertPositionVO>(ApiPaths.AppPath("/advert/positions"));
        }

        /// <summary>
        /// 广告位详情
        /// </summary>
        public async Task<PlusApiResultAdvertPositionDetailVO?> GetAdvertPositionAsync(string positionId)
        {
            return await _client.GetAsync<PlusApiResultAdvertPositionDetailVO>(ApiPaths.AppPath($"/advert/positions/{positionId}"));
        }

        /// <summary>
        /// 获取位置广告
        /// </summary>
        public async Task<PlusApiResultListAdvertVO?> GetAdsByPositionAsync(string positionId, Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultListAdvertVO>(ApiPaths.AppPath($"/advert/positions/{positionId}/ads"), query);
        }

        /// <summary>
        /// 弹窗广告
        /// </summary>
        public async Task<PlusApiResultPopupAdvertVO?> GetPopupAsync()
        {
            return await _client.GetAsync<PlusApiResultPopupAdvertVO>(ApiPaths.AppPath("/advert/popup"));
        }

        /// <summary>
        /// 插屏广告
        /// </summary>
        public async Task<PlusApiResultInterstitialAdvertVO?> GetInterstitialAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultInterstitialAdvertVO>(ApiPaths.AppPath("/advert/interstitial"), query);
        }

        /// <summary>
        /// 信息流广告
        /// </summary>
        public async Task<PlusApiResultListFeedAdvertVO?> GetFeedAdvertsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultListFeedAdvertVO>(ApiPaths.AppPath("/advert/feed"), query);
        }

        /// <summary>
        /// 广告配置
        /// </summary>
        public async Task<PlusApiResultAdvertConfigVO?> GetAdvertConfigAsync()
        {
            return await _client.GetAsync<PlusApiResultAdvertConfigVO>(ApiPaths.AppPath("/advert/config"));
        }

        /// <summary>
        /// Banner广告
        /// </summary>
        public async Task<PlusApiResultListBannerAdvertVO?> GetBannerAdvertsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultListBannerAdvertVO>(ApiPaths.AppPath("/advert/banner"), query);
        }
    }
}
