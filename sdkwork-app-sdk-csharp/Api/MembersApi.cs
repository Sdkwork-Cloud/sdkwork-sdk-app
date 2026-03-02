using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class MembersApi
    {
        private readonly HttpClient _client;

        public MembersApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 获取组织成员
        /// </summary>
        public async Task<PlusApiResultPageMemberVO?> GetMembersByOrgAsync(string orgId, Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageMemberVO>(ApiPaths.AppPath($"/organization/{orgId}/members"), query);
        }
    }
}
