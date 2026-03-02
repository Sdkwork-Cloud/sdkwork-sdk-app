using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class AuthApi
    {
        private readonly HttpClient _client;

        public AuthApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Request password reset challenge
        /// </summary>
        public async Task<PlusApiResultVoid?> RequestPasswordResetChallengeAsync(PasswordResetRequestForm body)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath("/auth/password/reset/request"), body);
        }
    }
}
