using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class LogoutApi
    {
        private readonly HttpClient _client;

        public LogoutApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 用户登出
        /// </summary>
        public async Task<PlusApiResultVoid?> LogoutAsync()
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath("/auth/logout"), null);
        }
    }
}
