using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class ChatApi
    {
        private readonly HttpClient _client;

        public ChatApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 获取会话详情
        /// </summary>
        public async Task<PlusApiResultChatSessionDetailVO?> GetSessionDetailAsync(string sessionId)
        {
            return await _client.GetAsync<PlusApiResultChatSessionDetailVO>(ApiPaths.AppPath($"/chat/sessions/{sessionId}"));
        }

        /// <summary>
        /// 更新会话
        /// </summary>
        public async Task<PlusApiResultVoid?> UpdateSessionAsync(string sessionId, ChatSessionUpdateForm body)
        {
            return await _client.PutAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/chat/sessions/{sessionId}"), body);
        }

        /// <summary>
        /// 删除会话
        /// </summary>
        public async Task<PlusApiResultVoid?> DeleteSessionAsync(string sessionId)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/chat/sessions/{sessionId}"));
        }

        /// <summary>
        /// 获取会话列表
        /// </summary>
        public async Task<PlusApiResultPageChatSessionVO?> ListSessionsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageChatSessionVO>(ApiPaths.AppPath("/chat/sessions"), query);
        }

        /// <summary>
        /// 创建对话会话
        /// </summary>
        public async Task<PlusApiResultChatSessionVO?> CreateSessionAsync(ChatSessionCreateForm body)
        {
            return await _client.PostAsync<PlusApiResultChatSessionVO>(ApiPaths.AppPath("/chat/sessions"), body);
        }

        /// <summary>
        /// 停止生成
        /// </summary>
        public async Task<PlusApiResultVoid?> StopGenerationAsync(string sessionId)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/chat/sessions/{sessionId}/stop"), null);
        }

        /// <summary>
        /// 获取消息历史
        /// </summary>
        public async Task<PlusApiResultPageChatMessageVO?> GetMessageHistoryAsync(string sessionId, Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageChatMessageVO>(ApiPaths.AppPath($"/chat/sessions/{sessionId}/messages"), query);
        }

        /// <summary>
        /// 发送消息
        /// </summary>
        public async Task<PlusApiResultChatMessageVO?> SendMessageAsync(string sessionId, ChatMessageSendForm body)
        {
            return await _client.PostAsync<PlusApiResultChatMessageVO>(ApiPaths.AppPath($"/chat/sessions/{sessionId}/messages"), body);
        }

        /// <summary>
        /// 重新生成
        /// </summary>
        public async Task<PlusApiResultChatMessageVO?> RegenerateMessageAsync(string sessionId, string messageId)
        {
            return await _client.PostAsync<PlusApiResultChatMessageVO>(ApiPaths.AppPath($"/chat/sessions/{sessionId}/messages/{messageId}/regenerate"), null);
        }

        /// <summary>
        /// 收藏消息
        /// </summary>
        public async Task<PlusApiResultVoid?> FavoriteMessageAsync(string sessionId, string messageId)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/chat/sessions/{sessionId}/messages/{messageId}/favorite"), null);
        }

        /// <summary>
        /// 取消收藏消息
        /// </summary>
        public async Task<PlusApiResultVoid?> UnfavoriteMessageAsync(string sessionId, string messageId)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/chat/sessions/{sessionId}/messages/{messageId}/favorite"));
        }

        /// <summary>
        /// 流式发送消息
        /// </summary>
        public async Task SendMessageStreamAsync(string sessionId, ChatMessageSendForm body)
        {
            await _client.PostAsync<object>(ApiPaths.AppPath($"/chat/sessions/{sessionId}/messages/stream"), body);
        }

        /// <summary>
        /// 导出对话
        /// </summary>
        public async Task<PlusApiResultExportVO?> ExportConversationAsync(string sessionId, ChatExportForm body)
        {
            return await _client.PostAsync<PlusApiResultExportVO>(ApiPaths.AppPath($"/chat/sessions/{sessionId}/export"), body);
        }

        /// <summary>
        /// 复制对话
        /// </summary>
        public async Task<PlusApiResultChatSessionVO?> CopySessionAsync(string sessionId)
        {
            return await _client.PostAsync<PlusApiResultChatSessionVO>(ApiPaths.AppPath($"/chat/sessions/{sessionId}/copy"), null);
        }
    }
}
