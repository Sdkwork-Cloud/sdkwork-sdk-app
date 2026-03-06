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
        /// 处理好友申请
        /// </summary>
        public async Task<PlusApiResultFriendRequestVO?> ProcessFriendRequestAsync(string requestId, FriendRequestProcessForm body)
        {
            return await _client.PutAsync<PlusApiResultFriendRequestVO>(ApiPaths.AppPath($"/social/friend-requests/{requestId}/process"), body);
        }

        /// <summary>
        /// 更新联系人分组
        /// </summary>
        public async Task<PlusApiResultContactGroupVO?> UpdateContactGroupAsync(string groupId, ContactGroupUpdateForm body)
        {
            return await _client.PutAsync<PlusApiResultContactGroupVO>(ApiPaths.AppPath($"/social/contact-groups/{groupId}"), body);
        }

        /// <summary>
        /// 删除联系人分组
        /// </summary>
        public async Task<PlusApiResultVoid?> DeleteContactGroupAsync(string groupId)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/social/contact-groups/{groupId}"));
        }

        /// <summary>
        /// 发送私信
        /// </summary>
        public async Task<PlusApiResultPrivateMessageVO?> SendMessageAsync(SendMessageForm body)
        {
            return await _client.PostAsync<PlusApiResultPrivateMessageVO>(ApiPaths.AppPath("/social/messages"), body);
        }

        /// <summary>
        /// 获取好友申请列表
        /// </summary>
        public async Task<PlusApiResultListFriendRequestVO?> ListFriendRequestsAsync()
        {
            return await _client.GetAsync<PlusApiResultListFriendRequestVO>(ApiPaths.AppPath("/social/friend-requests"));
        }

        /// <summary>
        /// 发送好友申请
        /// </summary>
        public async Task<PlusApiResultFriendRequestVO?> SendFriendRequestAsync(FriendRequestCreateForm body)
        {
            return await _client.PostAsync<PlusApiResultFriendRequestVO>(ApiPaths.AppPath("/social/friend-requests"), body);
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
        /// 获取联系人分组
        /// </summary>
        public async Task<PlusApiResultListContactGroupVO?> ListContactGroupsAsync()
        {
            return await _client.GetAsync<PlusApiResultListContactGroupVO>(ApiPaths.AppPath("/social/contact-groups"));
        }

        /// <summary>
        /// 创建联系人分组
        /// </summary>
        public async Task<PlusApiResultContactGroupVO?> CreateContactGroupAsync(ContactGroupCreateForm body)
        {
            return await _client.PostAsync<PlusApiResultContactGroupVO>(ApiPaths.AppPath("/social/contact-groups"), body);
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
        /// 更新好友备注
        /// </summary>
        public async Task<PlusApiResultVoid?> UpdateFriendRemarkAsync(string contactId, FriendRemarkUpdateForm body)
        {
            return await _client.PatchAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/social/contacts/{contactId}/remark"), body);
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
        /// 获取联系人列表
        /// </summary>
        public async Task<PlusApiResultListContactFriendVO?> ListContactsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultListContactFriendVO>(ApiPaths.AppPath("/social/contacts"), query);
        }

        /// <summary>
        /// 获取联系人详情
        /// </summary>
        public async Task<PlusApiResultContactFriendVO?> GetContactDetailAsync(string contactId)
        {
            return await _client.GetAsync<PlusApiResultContactFriendVO>(ApiPaths.AppPath($"/social/contacts/{contactId}"));
        }

        /// <summary>
        /// 删除联系人
        /// </summary>
        public async Task<PlusApiResultVoid?> DeleteContactAsync(string contactId)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/social/contacts/{contactId}"));
        }

        /// <summary>
        /// 获取联系人统计
        /// </summary>
        public async Task<PlusApiResultContactStatsVO?> GetContactStatsAsync()
        {
            return await _client.GetAsync<PlusApiResultContactStatsVO>(ApiPaths.AppPath("/social/contacts/stats"));
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
