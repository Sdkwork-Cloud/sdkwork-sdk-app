using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class PhoneApi
    {
        private readonly HttpClient _client;

        public PhoneApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 手机号验证码登录
        /// </summary>
        public async Task<PlusApiResultLoginVO?> LoginAsync(PhoneLoginForm body)
        {
            return await _client.PostAsync<PlusApiResultLoginVO>(ApiPaths.AppPath("/auth/phone/login"), body);
        }
    }
}
