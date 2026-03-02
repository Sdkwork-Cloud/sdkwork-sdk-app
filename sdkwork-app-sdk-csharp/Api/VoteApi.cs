using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class VoteApi
    {
        private readonly HttpClient _client;

        public VoteApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 投票
        /// </summary>
        public async Task<PlusApiResultVoteVO?> VoteAsync(VoteForm body)
        {
            return await _client.PostAsync<PlusApiResultVoteVO>(ApiPaths.AppPath("/vote"), body);
        }

        /// <summary>
        /// 取消投票
        /// </summary>
        public async Task<PlusApiResultVoid?> CancelAsync(Dictionary<string, object>? query = null)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath("/vote"), query);
        }

        /// <summary>
        /// 切换投票
        /// </summary>
        public async Task<PlusApiResultVoteVO?> ToggleAsync(VoteForm body)
        {
            return await _client.PostAsync<PlusApiResultVoteVO>(ApiPaths.AppPath("/vote/toggle"), body);
        }

        /// <summary>
        /// 点赞
        /// </summary>
        public async Task<PlusApiResultVoteVO?> LikeAsync(Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultVoteVO>(ApiPaths.AppPath("/vote/like"), null, query);
        }

        /// <summary>
        /// 点踩
        /// </summary>
        public async Task<PlusApiResultVoteVO?> DislikeAsync(Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultVoteVO>(ApiPaths.AppPath("/vote/dislike"), null, query);
        }

        /// <summary>
        /// 获取投票详情
        /// </summary>
        public async Task<PlusApiResultVoteDetailVO?> GetVoteDetailAsync(string voteId)
        {
            return await _client.GetAsync<PlusApiResultVoteDetailVO>(ApiPaths.AppPath($"/vote/{voteId}"));
        }

        /// <summary>
        /// 获取热门内容
        /// </summary>
        public async Task<PlusApiResultListLong?> GetTopLikedContentAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultListLong>(ApiPaths.AppPath("/vote/top-liked"), query);
        }

        /// <summary>
        /// 获取投票状态
        /// </summary>
        public async Task<PlusApiResultVoteStatusVO?> GetVoteStatusAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultVoteStatusVO>(ApiPaths.AppPath("/vote/status"), query);
        }

        /// <summary>
        /// 获取投票统计
        /// </summary>
        public async Task<PlusApiResultVoteStatisticsVO?> GetVoteStatisticsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultVoteStatisticsVO>(ApiPaths.AppPath("/vote/statistics"), query);
        }

        /// <summary>
        /// 获取我的投票历史
        /// </summary>
        public async Task<PlusApiResultPageVoteDetailVO?> GetMyVotesAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageVoteDetailVO>(ApiPaths.AppPath("/vote/my-votes"), query);
        }
    }
}
