using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class LoginApi
    {
        private readonly HttpClient _client;

        public LoginApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 用户登录
        /// </summary>
        public async Task<PlusApiResultLoginVO?> LoginAsync(LoginForm body)
        {
            return await _client.PostAsync<PlusApiResultLoginVO>(ApiPaths.AppPath("/auth/login"), body);
        }
    }
}
