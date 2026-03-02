using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class MemberApi
    {
        private readonly HttpClient _client;

        public MemberApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 获取成员详情
        /// </summary>
        public async Task<PlusApiResultMemberVO?> GetMemberAsync(string memberId)
        {
            return await _client.GetAsync<PlusApiResultMemberVO>(ApiPaths.AppPath($"/organization/member/{memberId}"));
        }
    }
}
