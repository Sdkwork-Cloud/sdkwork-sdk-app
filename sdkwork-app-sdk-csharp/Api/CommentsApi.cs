using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class CommentsApi
    {
        private readonly HttpClient _client;

        public CommentsApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 发表评论
        /// </summary>
        public async Task<PlusApiResultCommentVO?> CreateCommentAsync(CommentCreateForm body)
        {
            return await _client.PostAsync<PlusApiResultCommentVO>(ApiPaths.AppPath("/comments"), body);
        }

        /// <summary>
        /// 回复评论
        /// </summary>
        public async Task<PlusApiResultCommentVO?> ReplyCommentAsync(string commentId, CommentReplyForm body)
        {
            return await _client.PostAsync<PlusApiResultCommentVO>(ApiPaths.AppPath($"/comments/{commentId}/reply"), body);
        }

        /// <summary>
        /// 置顶评论
        /// </summary>
        public async Task<PlusApiResultCommentVO?> PinCommentAsync(string commentId)
        {
            return await _client.PostAsync<PlusApiResultCommentVO>(ApiPaths.AppPath($"/comments/{commentId}/pin"), null);
        }

        /// <summary>
        /// 取消置顶
        /// </summary>
        public async Task<PlusApiResultCommentVO?> UnpinCommentAsync(string commentId)
        {
            return await _client.DeleteAsync<PlusApiResultCommentVO>(ApiPaths.AppPath($"/comments/{commentId}/pin"));
        }

        /// <summary>
        /// 点赞评论
        /// </summary>
        public async Task<PlusApiResultCommentVO?> LikeCommentAsync(string commentId)
        {
            return await _client.PostAsync<PlusApiResultCommentVO>(ApiPaths.AppPath($"/comments/{commentId}/like"), null);
        }

        /// <summary>
        /// 取消点赞
        /// </summary>
        public async Task<PlusApiResultCommentVO?> UnlikeCommentAsync(string commentId)
        {
            return await _client.DeleteAsync<PlusApiResultCommentVO>(ApiPaths.AppPath($"/comments/{commentId}/like"));
        }

        /// <summary>
        /// 获取评论详情
        /// </summary>
        public async Task<PlusApiResultCommentDetailVO?> GetCommentDetailAsync(string commentId)
        {
            return await _client.GetAsync<PlusApiResultCommentDetailVO>(ApiPaths.AppPath($"/comments/{commentId}"));
        }

        /// <summary>
        /// 删除评论
        /// </summary>
        public async Task<PlusApiResultVoid?> DeleteCommentAsync(string commentId)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/comments/{commentId}"));
        }

        /// <summary>
        /// 获取回复列表
        /// </summary>
        public async Task<PlusApiResultPageCommentVO?> GetRepliesAsync(string commentId, Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageCommentVO>(ApiPaths.AppPath($"/comments/{commentId}/replies"), query);
        }

        /// <summary>
        /// 获取评论统计
        /// </summary>
        public async Task<PlusApiResultCommentStatisticsVO?> GetCommentStatisticsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultCommentStatisticsVO>(ApiPaths.AppPath("/comments/statistics"), query);
        }

        /// <summary>
        /// 获取我的评论
        /// </summary>
        public async Task<PlusApiResultPageCommentVO?> GetMyAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageCommentVO>(ApiPaths.AppPath("/comments/my"), query);
        }

        /// <summary>
        /// 获取评论列表
        /// </summary>
        public async Task<PlusApiResultPageCommentVO?> GetCommentsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageCommentVO>(ApiPaths.AppPath("/comments/list"), query);
        }
    }
}
