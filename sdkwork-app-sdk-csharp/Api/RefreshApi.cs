using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class RefreshApi
    {
        private readonly HttpClient _client;

        public RefreshApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 刷新令牌
        /// </summary>
        public async Task<PlusApiResultLoginVO?> TokenAsync(TokenRefreshForm body)
        {
            return await _client.PostAsync<PlusApiResultLoginVO>(ApiPaths.AppPath("/auth/refresh"), body);
        }
    }
}
