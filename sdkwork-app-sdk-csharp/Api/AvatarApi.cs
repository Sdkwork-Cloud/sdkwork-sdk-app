using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class AvatarApi
    {
        private readonly HttpClient _client;

        public AvatarApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 上传头像
        /// </summary>
        public async Task<PlusApiResultMapStringString?> UploadAsync(UploadAvatarRequest? body = null)
        {
            return await _client.PostAsync<PlusApiResultMapStringString>(ApiPaths.AppPath("/user/avatar"), body);
        }
    }
}
