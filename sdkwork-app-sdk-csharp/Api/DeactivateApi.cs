using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class DeactivateApi
    {
        private readonly HttpClient _client;

        public DeactivateApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 注销账号
        /// </summary>
        public async Task<PlusApiResultVoid?> AccountAsync(AccountDeactivateForm body)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath("/user/deactivate"), body);
        }
    }
}
