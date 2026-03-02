using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class PasswordApi
    {
        private readonly HttpClient _client;

        public PasswordApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 修改密码
        /// </summary>
        public async Task<PlusApiResultVoid?> ChangeAsync(PasswordChangeForm body)
        {
            return await _client.PutAsync<PlusApiResultVoid>(ApiPaths.AppPath("/user/password"), body);
        }

        /// <summary>
        /// 重置密码
        /// </summary>
        public async Task<PlusApiResultVoid?> ResetAsync(PasswordResetForm body)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath("/auth/password/reset"), body);
        }
    }
}
