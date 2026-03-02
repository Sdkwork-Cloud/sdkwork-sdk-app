using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class BindApi
    {
        private readonly HttpClient _client;

        public BindApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 绑定第三方账号
        /// </summary>
        public async Task<PlusApiResultVoid?> ThirdPartyAccountAsync(string platform, ThirdPartyBindForm body)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/user/bind/{platform}"), body);
        }

        /// <summary>
        /// 解绑第三方账号
        /// </summary>
        public async Task<PlusApiResultVoid?> UnbindThirdPartyAccountAsync(string platform)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/user/bind/{platform}"));
        }
    }
}
