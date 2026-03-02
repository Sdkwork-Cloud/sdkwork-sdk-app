using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class ProfileApi
    {
        private readonly HttpClient _client;

        public ProfileApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 获取用户信息
        /// </summary>
        public async Task<PlusApiResultUserProfileVO?> GetUserAsync()
        {
            return await _client.GetAsync<PlusApiResultUserProfileVO>(ApiPaths.AppPath("/user/profile"));
        }

        /// <summary>
        /// 更新用户信息
        /// </summary>
        public async Task<PlusApiResultUserProfileVO?> UpdateUserAsync(UserProfileUpdateForm body)
        {
            return await _client.PutAsync<PlusApiResultUserProfileVO>(ApiPaths.AppPath("/user/profile"), body);
        }
    }
}
