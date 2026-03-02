using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class AddressApi
    {
        private readonly HttpClient _client;

        public AddressApi(HttpClient client)
        {
            _client = client;
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
        public async Task<PlusApiResultUserAddressVO?> SetDefaultAsync(string addressId)
        {
            return await _client.PutAsync<PlusApiResultUserAddressVO>(ApiPaths.AppPath($"/user/address/{addressId}/default"), null);
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
        /// 获取默认地址
        /// </summary>
        public async Task<PlusApiResultUserAddressVO?> GetDefaultAsync()
        {
            return await _client.GetAsync<PlusApiResultUserAddressVO>(ApiPaths.AppPath("/user/address/default"));
        }
    }
}
