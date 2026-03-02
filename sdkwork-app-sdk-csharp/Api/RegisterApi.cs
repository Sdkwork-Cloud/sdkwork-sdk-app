using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class RegisterApi
    {
        private readonly HttpClient _client;

        public RegisterApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 用户注册
        /// </summary>
        public async Task<PlusApiResultUserInfoVO?> RegisterAsync(RegisterForm body)
        {
            return await _client.PostAsync<PlusApiResultUserInfoVO>(ApiPaths.AppPath("/auth/register"), body);
        }
    }
}
