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

        /// <summary>
        /// 用户注册
        /// </summary>
        public async Task<PlusApiResultUserInfoVO?> RegisterAsync(RegisterForm body)
        {
            return await _client.PostAsync<PlusApiResultUserInfoVO>(ApiPaths.AppPath("/auth/register"), body);
        }

        /// <summary>
        /// 刷新令牌
        /// </summary>
        public async Task<PlusApiResultLoginVO?> RefreshTokenAsync(TokenRefreshForm body)
        {
            return await _client.PostAsync<PlusApiResultLoginVO>(ApiPaths.AppPath("/auth/refresh"), body);
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
        /// 手机号验证码登录
        /// </summary>
        public async Task<PlusApiResultLoginVO?> PhoneLoginAsync(PhoneLoginForm body)
        {
            return await _client.PostAsync<PlusApiResultLoginVO>(ApiPaths.AppPath("/auth/phone/login"), body);
        }

        /// <summary>
        /// 重置密码
        /// </summary>
        public async Task<PlusApiResultVoid?> ResetPasswordAsync(PasswordResetForm body)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath("/auth/password/reset"), body);
        }

        /// <summary>
        /// Request password reset challenge
        /// </summary>
        public async Task<PlusApiResultVoid?> RequestPasswordResetChallengeAsync(PasswordResetRequestForm body)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath("/auth/password/reset/request"), body);
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
        public async Task<PlusApiResultLoginVO?> OauthLoginAsync(OAuthLoginForm body)
        {
            return await _client.PostAsync<PlusApiResultLoginVO>(ApiPaths.AppPath("/auth/oauth/login"), body);
        }

        /// <summary>
        /// 用户登出
        /// </summary>
        public async Task<PlusApiResultVoid?> LogoutAsync()
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath("/auth/logout"), null);
        }

        /// <summary>
        /// 用户登录
        /// </summary>
        public async Task<PlusApiResultLoginVO?> LoginAsync(LoginForm body)
        {
            return await _client.PostAsync<PlusApiResultLoginVO>(ApiPaths.AppPath("/auth/login"), body);
        }

        /// <summary>
        /// 检查二维码状态
        /// </summary>
        public async Task<PlusApiResultQrCodeStatusVO?> CheckQrCodeStatusAsync(string qrKey)
        {
            return await _client.GetAsync<PlusApiResultQrCodeStatusVO>(ApiPaths.AppPath($"/auth/qr/status/{qrKey}"));
        }

        /// <summary>
        /// 二维码统一入口
        /// </summary>
        public async Task QrCodeEntryAsync(string qrKey)
        {
            await _client.GetAsync<object>(ApiPaths.AppPath($"/auth/qr/entry/{qrKey}"));
        }
    }
}
