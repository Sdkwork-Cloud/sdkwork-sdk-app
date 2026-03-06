using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class AgentApi
    {
        private readonly HttpClient _client;

        public AgentApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Get agent
        /// </summary>
        public async Task<PlusApiResultMapStringObject?> GetAsync(string agentId)
        {
            return await _client.GetAsync<PlusApiResultMapStringObject>(ApiPaths.AppPath($"/agents/{agentId}"));
        }

        /// <summary>
        /// Update agent
        /// </summary>
        public async Task<PlusApiResultMapStringObject?> UpdateAsync(string agentId, UpdateRequest? body = null)
        {
            return await _client.PutAsync<PlusApiResultMapStringObject>(ApiPaths.AppPath($"/agents/{agentId}"), body);
        }

        /// <summary>
        /// Delete agent
        /// </summary>
        public async Task<PlusApiResultVoid?> DeleteAsync(string agentId)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/agents/{agentId}"));
        }

        /// <summary>
        /// List agents
        /// </summary>
        public async Task<PlusApiResultMapStringObject?> ListAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultMapStringObject>(ApiPaths.AppPath("/agents"), query);
        }

        /// <summary>
        /// Create agent
        /// </summary>
        public async Task<PlusApiResultMapStringObject?> CreateAsync(CreateRequest? body = null)
        {
            return await _client.PostAsync<PlusApiResultMapStringObject>(ApiPaths.AppPath("/agents"), body);
        }

        /// <summary>
        /// List sessions
        /// </summary>
        public async Task<PlusApiResultListMapStringObject?> ListSessionsAsync(string agentId)
        {
            return await _client.GetAsync<PlusApiResultListMapStringObject>(ApiPaths.AppPath($"/agents/{agentId}/sessions"));
        }

        /// <summary>
        /// Create session
        /// </summary>
        public async Task<PlusApiResultMapStringObject?> CreateSessionAsync(string agentId, CreateSessionRequest? body = null)
        {
            return await _client.PostAsync<PlusApiResultMapStringObject>(ApiPaths.AppPath($"/agents/{agentId}/sessions"), body);
        }

        /// <summary>
        /// Reset agent
        /// </summary>
        public async Task<PlusApiResultVoid?> ResetAsync(string agentId)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/agents/{agentId}/reset"), null);
        }

        /// <summary>
        /// List session messages
        /// </summary>
        public async Task<PlusApiResultListMapStringObject?> ListSessionMessagesAsync(string sessionId)
        {
            return await _client.GetAsync<PlusApiResultListMapStringObject>(ApiPaths.AppPath($"/agents/sessions/{sessionId}/messages"));
        }

        /// <summary>
        /// Send session message
        /// </summary>
        public async Task<PlusApiResultMapStringObject?> SendSessionMessageAsync(string sessionId, SendSessionMessageRequest? body = null)
        {
            return await _client.PostAsync<PlusApiResultMapStringObject>(ApiPaths.AppPath($"/agents/sessions/{sessionId}/messages"), body);
        }

        /// <summary>
        /// Clear session
        /// </summary>
        public async Task<PlusApiResultVoid?> ClearSessionAsync(string sessionId)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/agents/sessions/{sessionId}/clear"), null);
        }

        /// <summary>
        /// Agent stats
        /// </summary>
        public async Task<PlusApiResultMapStringObject?> StatsAsync(string agentId)
        {
            return await _client.GetAsync<PlusApiResultMapStringObject>(ApiPaths.AppPath($"/agents/{agentId}/stats"));
        }

        /// <summary>
        /// Delete session
        /// </summary>
        public async Task<PlusApiResultVoid?> DeleteSessionAsync(string sessionId)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/agents/sessions/{sessionId}"));
        }
    }
}
