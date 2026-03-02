using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class CartApi
    {
        private readonly HttpClient _client;

        public CartApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 更新购物车商品数量
        /// </summary>
        public async Task<PlusApiResultCartItemVO?> UpdateItemQuantityAsync(string itemId, UpdateCartItemForm body)
        {
            return await _client.PutAsync<PlusApiResultCartItemVO>(ApiPaths.AppPath($"/cart/items/{itemId}"), body);
        }

        /// <summary>
        /// 删除购物车商品
        /// </summary>
        public async Task<PlusApiResultVoid?> RemoveItemAsync(string itemId)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/cart/items/{itemId}"));
        }

        /// <summary>
        /// 更新商品选中状态
        /// </summary>
        public async Task<PlusApiResultVoid?> UpdateItemSelectionAsync(string itemId, Dictionary<string, object>? query = null)
        {
            return await _client.PutAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/cart/items/{itemId}/select"), null, query);
        }

        /// <summary>
        /// 批量更新选中状态
        /// </summary>
        public async Task<PlusApiResultVoid?> BatchUpdateSelectionAsync(BatchSelectForm body)
        {
            return await _client.PutAsync<PlusApiResultVoid>(ApiPaths.AppPath("/cart/items/select"), body);
        }

        /// <summary>
        /// 获取购物车商品列表
        /// </summary>
        public async Task<PlusApiResultListCartItemVO?> GetCartItemsAsync()
        {
            return await _client.GetAsync<PlusApiResultListCartItemVO>(ApiPaths.AppPath("/cart/items"));
        }

        /// <summary>
        /// 添加商品到购物车
        /// </summary>
        public async Task<PlusApiResultCartItemVO?> AddItemAsync(AddCartItemForm body)
        {
            return await _client.PostAsync<PlusApiResultCartItemVO>(ApiPaths.AppPath("/cart/items"), body);
        }

        /// <summary>
        /// 批量删除购物车商品
        /// </summary>
        public async Task<PlusApiResultVoid?> RemoveItemsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath("/cart/items"), query);
        }

        /// <summary>
        /// 获取当前用户购物车
        /// </summary>
        public async Task<PlusApiResultShoppingCartVO?> GetMyAsync()
        {
            return await _client.GetAsync<PlusApiResultShoppingCartVO>(ApiPaths.AppPath("/cart"));
        }

        /// <summary>
        /// 清空购物车
        /// </summary>
        public async Task<PlusApiResultVoid?> ClearAsync()
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath("/cart"));
        }

        /// <summary>
        /// 获取购物车统计
        /// </summary>
        public async Task<PlusApiResultCartStatisticsVO?> GetCartStatisticsAsync()
        {
            return await _client.GetAsync<PlusApiResultCartStatisticsVO>(ApiPaths.AppPath("/cart/statistics"));
        }

        /// <summary>
        /// 获取选中的商品列表
        /// </summary>
        public async Task<PlusApiResultListCartItemVO?> GetSelectedItemsAsync()
        {
            return await _client.GetAsync<PlusApiResultListCartItemVO>(ApiPaths.AppPath("/cart/items/selected"));
        }

        /// <summary>
        /// 检查商品是否在购物车中
        /// </summary>
        public async Task<PlusApiResultBoolean?> CheckItemInAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultBoolean>(ApiPaths.AppPath("/cart/check"), query);
        }
    }
}
