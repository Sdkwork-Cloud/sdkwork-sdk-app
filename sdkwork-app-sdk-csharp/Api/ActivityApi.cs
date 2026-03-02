using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class ActivityApi
    {
        private readonly HttpClient _client;

        public ActivityApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 参与活动
        /// </summary>
        public async Task<PlusApiResultActivityJoinVO?> JoinAsync(string activityId, ActivityJoinForm body)
        {
            return await _client.PostAsync<PlusApiResultActivityJoinVO>(ApiPaths.AppPath($"/activity/{activityId}/join"), body);
        }

        /// <summary>
        /// 领取任务奖励
        /// </summary>
        public async Task<PlusApiResultTaskRewardVO?> ClaimTaskRewardAsync(string taskId)
        {
            return await _client.PostAsync<PlusApiResultTaskRewardVO>(ApiPaths.AppPath($"/activity/tasks/{taskId}/claim"), null);
        }

        /// <summary>
        /// 兑换商品
        /// </summary>
        public async Task<PlusApiResultPointsExchangeVO?> ExchangeGoodsAsync(string goodsId, PointsExchangeForm body)
        {
            return await _client.PostAsync<PlusApiResultPointsExchangeVO>(ApiPaths.AppPath($"/activity/points-store/goods/{goodsId}/exchange"), body);
        }

        /// <summary>
        /// 抽奖
        /// </summary>
        public async Task<PlusApiResultLotteryDrawVO?> DrawLotteryAsync(string lotteryId)
        {
            return await _client.PostAsync<PlusApiResultLotteryDrawVO>(ApiPaths.AppPath($"/activity/lottery/{lotteryId}/draw"), null);
        }

        /// <summary>
        /// 领取奖品
        /// </summary>
        public async Task<PlusApiResultPrizeClaimVO?> ClaimPrizeAsync(string prizeId)
        {
            return await _client.PostAsync<PlusApiResultPrizeClaimVO>(ApiPaths.AppPath($"/activity/lottery/prizes/{prizeId}/claim"), null);
        }

        /// <summary>
        /// 每日签到
        /// </summary>
        public async Task<PlusApiResultCheckInVO?> CheckInAsync()
        {
            return await _client.PostAsync<PlusApiResultCheckInVO>(ApiPaths.AppPath("/activity/check-in"), null);
        }

        /// <summary>
        /// 补签
        /// </summary>
        public async Task<PlusApiResultCheckInMakeUpVO?> MakeUpCheckInAsync(CheckInMakeUpForm body)
        {
            return await _client.PostAsync<PlusApiResultCheckInMakeUpVO>(ApiPaths.AppPath("/activity/check-in/make-up"), body);
        }

        /// <summary>
        /// 获取活动详情
        /// </summary>
        public async Task<PlusApiResultActivityDetailVO?> GetActivityDetailAsync(string activityId)
        {
            return await _client.GetAsync<PlusApiResultActivityDetailVO>(ApiPaths.AppPath($"/activity/{activityId}"));
        }

        /// <summary>
        /// 获取任务列表
        /// </summary>
        public async Task<PlusApiResultListTaskVO?> ListTasksAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultListTaskVO>(ApiPaths.AppPath("/activity/tasks"), query);
        }

        /// <summary>
        /// 获取参与记录
        /// </summary>
        public async Task<PlusApiResultPageActivityRecordVO?> GetActivityRecordsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageActivityRecordVO>(ApiPaths.AppPath("/activity/records"), query);
        }

        /// <summary>
        /// 获取排行榜
        /// </summary>
        public async Task<PlusApiResultRankingVO?> GetRankingAsync(string type, Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultRankingVO>(ApiPaths.AppPath($"/activity/rankings/{type}"), query);
        }

        /// <summary>
        /// 获取我的排名
        /// </summary>
        public async Task<PlusApiResultRankInfoVO?> GetMyRankAsync(string type, Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultRankInfoVO>(ApiPaths.AppPath($"/activity/rankings/{type}/my-rank"), query);
        }

        /// <summary>
        /// 获取积分商品
        /// </summary>
        public async Task<PlusApiResultPagePointsGoodsVO?> ListPointsGoodsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPagePointsGoodsVO>(ApiPaths.AppPath("/activity/points-store/goods"), query);
        }

        /// <summary>
        /// 获取商品详情
        /// </summary>
        public async Task<PlusApiResultPointsGoodsDetailVO?> GetPointsGoodsDetailAsync(string goodsId)
        {
            return await _client.GetAsync<PlusApiResultPointsGoodsDetailVO>(ApiPaths.AppPath($"/activity/points-store/goods/{goodsId}"));
        }

        /// <summary>
        /// 获取兑换记录
        /// </summary>
        public async Task<PlusApiResultPagePointsExchangeRecordVO?> GetExchangeRecordsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPagePointsExchangeRecordVO>(ApiPaths.AppPath("/activity/points-store/exchange-records"), query);
        }

        /// <summary>
        /// 获取抽奖详情
        /// </summary>
        public async Task<PlusApiResultLotteryDetailVO?> GetLotteryDetailAsync(string lotteryId)
        {
            return await _client.GetAsync<PlusApiResultLotteryDetailVO>(ApiPaths.AppPath($"/activity/lottery/{lotteryId}"));
        }

        /// <summary>
        /// 获取中奖记录
        /// </summary>
        public async Task<PlusApiResultPageLotteryPrizeVO?> GetMyPrizesAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageLotteryPrizeVO>(ApiPaths.AppPath("/activity/lottery/my-prizes"), query);
        }

        /// <summary>
        /// 获取抽奖列表
        /// </summary>
        public async Task<PlusApiResultListLotteryActivityVO?> ListLotteryActivitiesAsync()
        {
            return await _client.GetAsync<PlusApiResultListLotteryActivityVO>(ApiPaths.AppPath("/activity/lottery/list"));
        }

        /// <summary>
        /// 获取活动列表
        /// </summary>
        public async Task<PlusApiResultPageActivityVO?> ListActivitiesAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageActivityVO>(ApiPaths.AppPath("/activity/list"), query);
        }

        /// <summary>
        /// 获取签到状态
        /// </summary>
        public async Task<PlusApiResultCheckInStatusVO?> GetCheckInStatusAsync()
        {
            return await _client.GetAsync<PlusApiResultCheckInStatusVO>(ApiPaths.AppPath("/activity/check-in/status"));
        }

        /// <summary>
        /// 获取签到记录
        /// </summary>
        public async Task<PlusApiResultListCheckInRecordVO?> GetCheckInRecordsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultListCheckInRecordVO>(ApiPaths.AppPath("/activity/check-in/records"), query);
        }
    }
}
