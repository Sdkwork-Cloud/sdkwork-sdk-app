using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class UserApi
    {
        private readonly HttpClient _client;

        public UserApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 获取用户设置
        /// </summary>
        public async Task<PlusApiResultUserSettingsVO?> GetUserSettingsAsync()
        {
            return await _client.GetAsync<PlusApiResultUserSettingsVO>(ApiPaths.AppPath("/user/settings"));
        }

        /// <summary>
        /// 更新用户设置
        /// </summary>
        public async Task<PlusApiResultUserSettingsVO?> UpdateUserSettingsAsync(UserSettingsUpdateForm body)
        {
            return await _client.PutAsync<PlusApiResultUserSettingsVO>(ApiPaths.AppPath("/user/settings"), body);
        }

        /// <summary>
        /// 获取用户信息
        /// </summary>
        public async Task<PlusApiResultUserProfileVO?> GetUserProfileAsync()
        {
            return await _client.GetAsync<PlusApiResultUserProfileVO>(ApiPaths.AppPath("/user/profile"));
        }

        /// <summary>
        /// 更新用户信息
        /// </summary>
        public async Task<PlusApiResultUserProfileVO?> UpdateUserProfileAsync(UserProfileUpdateForm body)
        {
            return await _client.PutAsync<PlusApiResultUserProfileVO>(ApiPaths.AppPath("/user/profile"), body);
        }

        /// <summary>
        /// 修改密码
        /// </summary>
        public async Task<PlusApiResultVoid?> ChangePasswordAsync(PasswordChangeForm body)
        {
            return await _client.PutAsync<PlusApiResultVoid>(ApiPaths.AppPath("/user/password"), body);
        }

        /// <summary>
        /// 获取地址详情
        /// </summary>
        public async Task<PlusApiResultUserAddressVO?> GetAddressDetailAsync(string addressId)
        {
            return await _client.GetAsync<PlusApiResultUserAddressVO>(ApiPaths.AppPath($"/user/address/{addressId}"));
        }

        /// <summary>
        /// 更新地址
        /// </summary>
        public async Task<PlusApiResultUserAddressVO?> UpdateAddressAsync(string addressId, UserAddressUpdateForm body)
        {
            return await _client.PutAsync<PlusApiResultUserAddressVO>(ApiPaths.AppPath($"/user/address/{addressId}"), body);
        }

        /// <summary>
        /// 删除地址
        /// </summary>
        public async Task<PlusApiResultVoid?> DeleteAddressAsync(string addressId)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/user/address/{addressId}"));
        }

        /// <summary>
        /// 设置默认地址
        /// </summary>
        public async Task<PlusApiResultUserAddressVO?> SetDefaultAddressAsync(string addressId)
        {
            return await _client.PutAsync<PlusApiResultUserAddressVO>(ApiPaths.AppPath($"/user/address/{addressId}/default"), null);
        }

        /// <summary>
        /// 注销账号
        /// </summary>
        public async Task<PlusApiResultVoid?> DeactivateAccountAsync(AccountDeactivateForm body)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath("/user/deactivate"), body);
        }

        /// <summary>
        /// 绑定第三方账号
        /// </summary>
        public async Task<PlusApiResultVoid?> BindThirdPartyAccountAsync(string platform, ThirdPartyBindForm body)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/user/bind/{platform}"), body);
        }

        /// <summary>
        /// 解绑第三方账号
        /// </summary>
        public async Task<PlusApiResultVoid?> UnbindThirdPartyAccountAsync(string platform)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/user/bind/{platform}"));
        }

        /// <summary>
        /// 上传头像
        /// </summary>
        public async Task<PlusApiResultMapStringString?> UploadAvatarAsync(UploadAvatarRequest? body = null)
        {
            return await _client.PostAsync<PlusApiResultMapStringString>(ApiPaths.AppPath("/user/avatar"), body);
        }

        /// <summary>
        /// 获取地址列表
        /// </summary>
        public async Task<PlusApiResultListUserAddressVO?> ListAddressesAsync()
        {
            return await _client.GetAsync<PlusApiResultListUserAddressVO>(ApiPaths.AppPath("/user/address"));
        }

        /// <summary>
        /// 创建地址
        /// </summary>
        public async Task<PlusApiResultUserAddressVO?> CreateAddressAsync(UserAddressCreateForm body)
        {
            return await _client.PostAsync<PlusApiResultUserAddressVO>(ApiPaths.AppPath("/user/address"), body);
        }

        /// <summary>
        /// 获取登录历史
        /// </summary>
        public async Task<PlusApiResultPageMapStringObject?> GetLoginHistoryAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageMapStringObject>(ApiPaths.AppPath("/user/history/login"), query);
        }

        /// <summary>
        /// 获取生成历史
        /// </summary>
        public async Task<PlusApiResultPageMapStringObject?> GetGenerationHistoryAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageMapStringObject>(ApiPaths.AppPath("/user/history/generations"), query);
        }

        /// <summary>
        /// 获取默认地址
        /// </summary>
        public async Task<PlusApiResultUserAddressVO?> GetDefaultAddressAsync()
        {
            return await _client.GetAsync<PlusApiResultUserAddressVO>(ApiPaths.AppPath("/user/address/default"));
        }
    }
}
