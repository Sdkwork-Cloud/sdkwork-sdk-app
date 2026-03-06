using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class RtcApi
    {
        private readonly HttpClient _client;

        public RtcApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Create RTC room
        /// </summary>
        public async Task<PlusApiResultMapStringObject?> CreateRoomAsync(CreateRoomRequest? body = null)
        {
            return await _client.PostAsync<PlusApiResultMapStringObject>(ApiPaths.AppPath("/rtc/rooms"), body);
        }

        /// <summary>
        /// Create RTC room token
        /// </summary>
        public async Task<PlusApiResultMapStringObject?> CreateRoomTokenAsync(string roomId)
        {
            return await _client.PostAsync<PlusApiResultMapStringObject>(ApiPaths.AppPath($"/rtc/rooms/{roomId}/token"), null);
        }

        /// <summary>
        /// End RTC room
        /// </summary>
        public async Task<PlusApiResultVoid?> EndRoomAsync(string roomId)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/rtc/rooms/{roomId}/end"), null);
        }

        /// <summary>
        /// Get RTC room
        /// </summary>
        public async Task<PlusApiResultMapStringObject?> GetRoomAsync(string roomId)
        {
            return await _client.GetAsync<PlusApiResultMapStringObject>(ApiPaths.AppPath($"/rtc/rooms/{roomId}"));
        }

        /// <summary>
        /// List RTC records
        /// </summary>
        public async Task<PlusApiResultListMapStringObject?> ListRecordsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultListMapStringObject>(ApiPaths.AppPath("/rtc/records"), query);
        }
    }
}
