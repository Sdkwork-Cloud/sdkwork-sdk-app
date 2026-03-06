using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class AgentMemoryApi
    {
        private readonly HttpClient _client;

        public AgentMemoryApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// List memories
        /// </summary>
        public async Task<PlusApiResultListMapStringObject?> ListAsync(string agentId, Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultListMapStringObject>(ApiPaths.AppPath($"/agents/{agentId}/memory"), query);
        }

        /// <summary>
        /// Create memory
        /// </summary>
        public async Task<PlusApiResultMapStringObject?> CreateAsync(string agentId, CreatePostRequest? body = null)
        {
            return await _client.PostAsync<PlusApiResultMapStringObject>(ApiPaths.AppPath($"/agents/{agentId}/memory"), body);
        }

        /// <summary>
        /// Summarize session
        /// </summary>
        public async Task<PlusApiResultMapStringObject?> SummarizeSessionAsync(string agentId, string sessionId)
        {
            return await _client.PostAsync<PlusApiResultMapStringObject>(ApiPaths.AppPath($"/agents/{agentId}/memory/sessions/{sessionId}/summarize"), null);
        }

        /// <summary>
        /// List knowledge
        /// </summary>
        public async Task<PlusApiResultListMapStringObject?> ListKnowledgeAsync(string agentId)
        {
            return await _client.GetAsync<PlusApiResultListMapStringObject>(ApiPaths.AppPath($"/agents/{agentId}/memory/knowledge"));
        }

        /// <summary>
        /// Create knowledge
        /// </summary>
        public async Task<PlusApiResultMapStringObject?> CreateKnowledgeAsync(string agentId, CreateKnowledgeRequest? body = null)
        {
            return await _client.PostAsync<PlusApiResultMapStringObject>(ApiPaths.AppPath($"/agents/{agentId}/memory/knowledge"), body);
        }

        /// <summary>
        /// Consolidate memories
        /// </summary>
        public async Task<PlusApiResultMapStringObject?> ConsolidateAsync(string agentId)
        {
            return await _client.PostAsync<PlusApiResultMapStringObject>(ApiPaths.AppPath($"/agents/{agentId}/memory/consolidate"), null);
        }

        /// <summary>
        /// Memory stats
        /// </summary>
        public async Task<PlusApiResultMapStringObject?> StatsAsync(string agentId)
        {
            return await _client.GetAsync<PlusApiResultMapStringObject>(ApiPaths.AppPath($"/agents/{agentId}/memory/stats"));
        }

        /// <summary>
        /// List session history
        /// </summary>
        public async Task<PlusApiResultListMapStringObject?> ListSessionHistoryAsync(string agentId, string sessionId, Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultListMapStringObject>(ApiPaths.AppPath($"/agents/{agentId}/memory/sessions/{sessionId}/history"), query);
        }

        /// <summary>
        /// Search memories
        /// </summary>
        public async Task<PlusApiResultListMapStringObject?> SearchAsync(string agentId, Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultListMapStringObject>(ApiPaths.AppPath($"/agents/{agentId}/memory/search"), query);
        }

        /// <summary>
        /// Get knowledge
        /// </summary>
        public async Task<PlusApiResultMapStringObject?> GetKnowledgeAsync(string agentId, string documentId)
        {
            return await _client.GetAsync<PlusApiResultMapStringObject>(ApiPaths.AppPath($"/agents/{agentId}/memory/knowledge/{documentId}"));
        }

        /// <summary>
        /// Delete knowledge
        /// </summary>
        public async Task<PlusApiResultMapStringObject?> DeleteKnowledgeAsync(string agentId, string documentId)
        {
            return await _client.DeleteAsync<PlusApiResultMapStringObject>(ApiPaths.AppPath($"/agents/{agentId}/memory/knowledge/{documentId}"));
        }

        /// <summary>
        /// List knowledge chunks
        /// </summary>
        public async Task<PlusApiResultListMapStringObject?> ListKnowledgeChunksAsync(string agentId, string documentId)
        {
            return await _client.GetAsync<PlusApiResultListMapStringObject>(ApiPaths.AppPath($"/agents/{agentId}/memory/knowledge/{documentId}/chunks"));
        }

        /// <summary>
        /// Knowledge stats
        /// </summary>
        public async Task<PlusApiResultMapStringObject?> KnowledgeStatsAsync(string agentId)
        {
            return await _client.GetAsync<PlusApiResultMapStringObject>(ApiPaths.AppPath($"/agents/{agentId}/memory/knowledge/stats"));
        }

        /// <summary>
        /// Search knowledge
        /// </summary>
        public async Task<PlusApiResultListMapStringObject?> SearchKnowledgeAsync(string agentId, Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultListMapStringObject>(ApiPaths.AppPath($"/agents/{agentId}/memory/knowledge/search"), query);
        }

        /// <summary>
        /// Delete memory
        /// </summary>
        public async Task<PlusApiResultMapStringObject?> DeleteAsync(string agentId, string memoryId)
        {
            return await _client.DeleteAsync<PlusApiResultMapStringObject>(ApiPaths.AppPath($"/agents/{agentId}/memory/{memoryId}"));
        }

        /// <summary>
        /// Clear session memories
        /// </summary>
        public async Task<PlusApiResultMapStringObject?> ClearSessionAsync(string agentId, string sessionId)
        {
            return await _client.DeleteAsync<PlusApiResultMapStringObject>(ApiPaths.AppPath($"/agents/{agentId}/memory/sessions/{sessionId}"));
        }
    }
}
