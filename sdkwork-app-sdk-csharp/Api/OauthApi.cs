using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class OauthApi
    {
        private readonly HttpClient _client;

        public OauthApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// OAuth授权URL
        /// </summary>
        public async Task<PlusApiResultOAuthUrlVO?> GetOauthUrlAsync(OAuthAuthUrlForm body)
        {
            return await _client.PostAsync<PlusApiResultOAuthUrlVO>(ApiPaths.AppPath("/auth/oauth/url"), body);
        }

        /// <summary>
        /// OAuth登录
        /// </summary>
        public async Task<PlusApiResultLoginVO?> LoginAsync(OAuthLoginForm body)
        {
            return await _client.PostAsync<PlusApiResultLoginVO>(ApiPaths.AppPath("/auth/oauth/login"), body);
        }
    }
}
