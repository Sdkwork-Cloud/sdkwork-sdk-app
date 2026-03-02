using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class QrApi
    {
        private readonly HttpClient _client;

        public QrApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 生成登录二维码
        /// </summary>
        public async Task<PlusApiResultQrCodeVO?> GenerateQrCodeAsync()
        {
            return await _client.PostAsync<PlusApiResultQrCodeVO>(ApiPaths.AppPath("/auth/qr/generate"), null);
        }

        /// <summary>
        /// 确认二维码登录
        /// </summary>
        public async Task<PlusApiResultVoid?> ConfirmQrCodeLoginAsync(QrCodeConfirmForm body)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath("/auth/qr/confirm"), body);
        }

        /// <summary>
        /// 检查二维码状态
        /// </summary>
        public async Task<PlusApiResultQrCodeStatusVO?> CheckQrCodeStatusAsync(string qrKey)
        {
            return await _client.GetAsync<PlusApiResultQrCodeStatusVO>(ApiPaths.AppPath($"/auth/qr/status/{qrKey}"));
        }
    }
}
