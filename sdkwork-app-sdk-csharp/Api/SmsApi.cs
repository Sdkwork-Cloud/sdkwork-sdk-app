using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class SmsApi
    {
        private readonly HttpClient _client;

        public SmsApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 验证验证码
        /// </summary>
        public async Task<PlusApiResultVerifyResultVO?> VerifySmsCodeAsync(VerifyCodeCheckForm body)
        {
            return await _client.PostAsync<PlusApiResultVerifyResultVO>(ApiPaths.AppPath("/auth/sms/verify"), body);
        }

        /// <summary>
        /// 发送验证码
        /// </summary>
        public async Task<PlusApiResultVoid?> SendSmsCodeAsync(VerifyCodeSendForm body)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath("/auth/sms/send"), body);
        }
    }
}
