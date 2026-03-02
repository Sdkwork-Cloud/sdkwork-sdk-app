using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class SocialApi
    {
        private readonly HttpClient _client;

        public SocialApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 标记消息已读
        /// </summary>
        public async Task<PlusApiResultVoid?> MarkMessagesAsReadAsync(Dictionary<string, object>? query = null)
        {
            return await _client.PutAsync<PlusApiResultVoid>(ApiPaths.AppPath("/social/messages/read"), null, query);
        }

        /// <summary>
        /// 发送私信
        /// </summary>
        public async Task<PlusApiResultPrivateMessageVO?> SendMessageAsync(SendMessageForm body)
        {
            return await _client.PostAsync<PlusApiResultPrivateMessageVO>(ApiPaths.AppPath("/social/messages"), body);
        }

        /// <summary>
        /// 关注用户
        /// </summary>
        public async Task<PlusApiResultFollowVO?> FollowUserAsync(string userId)
        {
            return await _client.PostAsync<PlusApiResultFollowVO>(ApiPaths.AppPath($"/social/follow/{userId}"), null);
        }

        /// <summary>
        /// 取消关注
        /// </summary>
        public async Task<PlusApiResultVoid?> UnfollowUserAsync(string userId)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/social/follow/{userId}"));
        }

        /// <summary>
        /// 批量检查关注状态
        /// </summary>
        public async Task<PlusApiResultListFollowCheckVO?> BatchCheckFollowStatusAsync(BatchFollowCheckForm body)
        {
            return await _client.PostAsync<PlusApiResultListFollowCheckVO>(ApiPaths.AppPath("/social/follow/check/batch"), body);
        }

        /// <summary>
        /// 拉黑用户
        /// </summary>
        public async Task<PlusApiResultVoid?> BlockUserAsync(string userId)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/social/block/{userId}"), null);
        }

        /// <summary>
        /// 取消拉黑
        /// </summary>
        public async Task<PlusApiResultVoid?> UnblockUserAsync(string userId)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/social/block/{userId}"));
        }

        /// <summary>
        /// 获取关注统计
        /// </summary>
        public async Task<PlusApiResultFollowStatsVO?> GetFollowStatsAsync()
        {
            return await _client.GetAsync<PlusApiResultFollowStatsVO>(ApiPaths.AppPath("/social/stats"));
        }

        /// <summary>
        /// 获取未读消息数
        /// </summary>
        public async Task<PlusApiResultMessageUnreadCountVO?> GetUnreadMessageCountAsync()
        {
            return await _client.GetAsync<PlusApiResultMessageUnreadCountVO>(ApiPaths.AppPath("/social/messages/unread/count"));
        }

        /// <summary>
        /// 获取关注列表
        /// </summary>
        public async Task<PlusApiResultPageFollowUserVO?> GetFollowingListAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageFollowUserVO>(ApiPaths.AppPath("/social/following"), query);
        }

        /// <summary>
        /// 获取粉丝列表
        /// </summary>
        public async Task<PlusApiResultPageFollowUserVO?> GetFollowerListAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageFollowUserVO>(ApiPaths.AppPath("/social/followers"), query);
        }

        /// <summary>
        /// 检查关注状态
        /// </summary>
        public async Task<PlusApiResultFollowCheckVO?> CheckFollowStatusAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultFollowCheckVO>(ApiPaths.AppPath("/social/follow/check"), query);
        }

        /// <summary>
        /// 获取会话列表
        /// </summary>
        public async Task<PlusApiResultPageConversationVO?> GetConversationsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageConversationVO>(ApiPaths.AppPath("/social/conversations"), query);
        }

        /// <summary>
        /// 获取会话消息
        /// </summary>
        public async Task<PlusApiResultPagePrivateMessageVO?> GetConversationMessagesAsync(string userId, Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPagePrivateMessageVO>(ApiPaths.AppPath($"/social/conversations/{userId}/messages"), query);
        }

        /// <summary>
        /// 获取黑名单
        /// </summary>
        public async Task<PlusApiResultPageBlockedUserVO?> GetBlockedUsersAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageBlockedUserVO>(ApiPaths.AppPath("/social/blocks"), query);
        }

        /// <summary>
        /// 检查黑名单状态
        /// </summary>
        public async Task<PlusApiResultBlockCheckVO?> CheckBlockStatusAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultBlockCheckVO>(ApiPaths.AppPath("/social/block/check"), query);
        }

        /// <summary>
        /// 删除会话
        /// </summary>
        public async Task<PlusApiResultVoid?> DeleteConversationAsync(string userId)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/social/conversations/{userId}"));
        }
    }
}
