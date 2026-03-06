using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class ProductsApi
    {
        private readonly HttpClient _client;

        public ProductsApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 更新商品属性
        /// </summary>
        public async Task<PlusApiResultProductAttributeVO?> UpdateProductAttributeAsync(string productId, string attributeId, ProductAttributeUpdateRequest body)
        {
            return await _client.PutAsync<PlusApiResultProductAttributeVO>(ApiPaths.AppPath($"/products/{productId}/attributes/{attributeId}"), body);
        }

        /// <summary>
        /// 删除商品属性
        /// </summary>
        public async Task<PlusApiResultVoid?> DeleteProductAttributeAsync(string productId, string attributeId)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/products/{productId}/attributes/{attributeId}"));
        }

        /// <summary>
        /// 更新商品分类
        /// </summary>
        public async Task<PlusApiResultProductCategoryVO?> UpdateProductCategoryAsync(string categoryId, ProductCategoryUpdateRequest body)
        {
            return await _client.PutAsync<PlusApiResultProductCategoryVO>(ApiPaths.AppPath($"/products/categories/{categoryId}"), body);
        }

        /// <summary>
        /// 删除商品分类
        /// </summary>
        public async Task<PlusApiResultVoid?> DeleteProductCategoryAsync(string categoryId)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/products/categories/{categoryId}"));
        }

        /// <summary>
        /// 获取商品属性
        /// </summary>
        public async Task<PlusApiResultListProductAttributeVO?> ListProductAttributesAsync(string productId)
        {
            return await _client.GetAsync<PlusApiResultListProductAttributeVO>(ApiPaths.AppPath($"/products/{productId}/attributes"));
        }

        /// <summary>
        /// 创建商品属性
        /// </summary>
        public async Task<PlusApiResultProductAttributeVO?> CreateProductAttributeAsync(string productId, ProductAttributeCreateRequest body)
        {
            return await _client.PostAsync<PlusApiResultProductAttributeVO>(ApiPaths.AppPath($"/products/{productId}/attributes"), body);
        }

        /// <summary>
        /// 获取商品分类列表
        /// </summary>
        public async Task<PlusApiResultListProductCategoryVO?> ListProductCategoriesAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultListProductCategoryVO>(ApiPaths.AppPath("/products/categories"), query);
        }

        /// <summary>
        /// 创建商品分类
        /// </summary>
        public async Task<PlusApiResultProductCategoryVO?> CreateProductCategoryAsync(ProductCategoryCreateRequest body)
        {
            return await _client.PostAsync<PlusApiResultProductCategoryVO>(ApiPaths.AppPath("/products/categories"), body);
        }

        /// <summary>
        /// 获取商品列表
        /// </summary>
        public async Task<PlusApiResultPageProductVO?> GetProductsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageProductVO>(ApiPaths.AppPath("/products"), query);
        }

        /// <summary>
        /// 获取商品详情
        /// </summary>
        public async Task<PlusApiResultProductDetailVO?> GetProductDetailAsync(string productId)
        {
            return await _client.GetAsync<PlusApiResultProductDetailVO>(ApiPaths.AppPath($"/products/{productId}"));
        }

        /// <summary>
        /// 获取商品库存
        /// </summary>
        public async Task<PlusApiResultInteger?> GetProductStockAsync(string productId)
        {
            return await _client.GetAsync<PlusApiResultInteger>(ApiPaths.AppPath($"/products/{productId}/stock"));
        }

        /// <summary>
        /// 获取商品统计
        /// </summary>
        public async Task<PlusApiResultProductStatisticsVO?> GetProductStatisticsAsync(string productId)
        {
            return await _client.GetAsync<PlusApiResultProductStatisticsVO>(ApiPaths.AppPath($"/products/{productId}/statistics"));
        }

        /// <summary>
        /// 获取SPU详情
        /// </summary>
        public async Task<PlusApiResultProductDetailVO?> GetSpuDetailAsync(string productId)
        {
            return await _client.GetAsync<PlusApiResultProductDetailVO>(ApiPaths.AppPath($"/products/{productId}/spu"));
        }

        /// <summary>
        /// 获取商品SKU列表
        /// </summary>
        public async Task<PlusApiResultListSkuVO?> GetProductSkusAsync(string productId, Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultListSkuVO>(ApiPaths.AppPath($"/products/{productId}/skus"), query);
        }

        /// <summary>
        /// 检查商品库存
        /// </summary>
        public async Task<PlusApiResultBoolean?> CheckProductStockAsync(string productId, Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultBoolean>(ApiPaths.AppPath($"/products/{productId}/check-stock"), query);
        }

        /// <summary>
        /// 搜索商品
        /// </summary>
        public async Task<PlusApiResultPageProductVO?> SearchAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageProductVO>(ApiPaths.AppPath("/products/search"), query);
        }

        /// <summary>
        /// 获取最新商品
        /// </summary>
        public async Task<PlusApiResultListProductVO?> GetLatestAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultListProductVO>(ApiPaths.AppPath("/products/latest"), query);
        }

        /// <summary>
        /// 获取热门商品
        /// </summary>
        public async Task<PlusApiResultListProductVO?> GetHotAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultListProductVO>(ApiPaths.AppPath("/products/hot"), query);
        }

        /// <summary>
        /// 按编码获取商品
        /// </summary>
        public async Task<PlusApiResultProductVO?> GetProductByCodeAsync(string code)
        {
            return await _client.GetAsync<PlusApiResultProductVO>(ApiPaths.AppPath($"/products/code/{code}"));
        }

        /// <summary>
        /// 按分类获取商品
        /// </summary>
        public async Task<PlusApiResultPageProductVO?> GetProductsByCategoryAsync(string categoryId, Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageProductVO>(ApiPaths.AppPath($"/products/category/{categoryId}"), query);
        }

        /// <summary>
        /// 获取分类属性
        /// </summary>
        public async Task<PlusApiResultListProductAttributeVO?> ListCategoryAttributesAsync(string categoryId)
        {
            return await _client.GetAsync<PlusApiResultListProductAttributeVO>(ApiPaths.AppPath($"/products/categories/{categoryId}/attributes"));
        }

        /// <summary>
        /// 获取商品分类树
        /// </summary>
        public async Task<PlusApiResultListProductCategoryVO?> GetProductCategoryTreeAsync()
        {
            return await _client.GetAsync<PlusApiResultListProductCategoryVO>(ApiPaths.AppPath("/products/categories/tree"));
        }
    }
}
