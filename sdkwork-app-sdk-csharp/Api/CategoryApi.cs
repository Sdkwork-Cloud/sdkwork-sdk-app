using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class CategoryApi
    {
        private readonly HttpClient _client;

        public CategoryApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 获取分类详情
        /// </summary>
        public async Task<PlusApiResultCategoryDetailVO?> GetCategoryDetailAsync(string categoryId)
        {
            return await _client.GetAsync<PlusApiResultCategoryDetailVO>(ApiPaths.AppPath($"/category/{categoryId}"));
        }

        /// <summary>
        /// 更新分类
        /// </summary>
        public async Task<PlusApiResultCategoryVO?> UpdateCategoryAsync(string categoryId, CategoryUpdateForm body)
        {
            return await _client.PutAsync<PlusApiResultCategoryVO>(ApiPaths.AppPath($"/category/{categoryId}"), body);
        }

        /// <summary>
        /// 删除分类
        /// </summary>
        public async Task<PlusApiResultVoid?> DeleteCategoryAsync(string categoryId)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/category/{categoryId}"));
        }

        /// <summary>
        /// 更新分类状态
        /// </summary>
        public async Task<PlusApiResultCategoryVO?> UpdateCategoryStatusAsync(string categoryId, Dictionary<string, object>? query = null)
        {
            return await _client.PutAsync<PlusApiResultCategoryVO>(ApiPaths.AppPath($"/category/{categoryId}/status"), null, query);
        }

        /// <summary>
        /// 移动分类
        /// </summary>
        public async Task<PlusApiResultCategoryVO?> MoveAsync(string categoryId, CategoryMoveForm body)
        {
            return await _client.PutAsync<PlusApiResultCategoryVO>(ApiPaths.AppPath($"/category/{categoryId}/move"), body);
        }

        /// <summary>
        /// 排序分类
        /// </summary>
        public async Task<PlusApiResultVoid?> SortCategoriesAsync(CategorySortForm body)
        {
            return await _client.PutAsync<PlusApiResultVoid>(ApiPaths.AppPath("/category/sort"), body);
        }

        /// <summary>
        /// 获取分类列表
        /// </summary>
        public async Task<PlusApiResultListCategoryVO?> ListCategoriesAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultListCategoryVO>(ApiPaths.AppPath("/category"), query);
        }

        /// <summary>
        /// 创建分类
        /// </summary>
        public async Task<PlusApiResultCategoryVO?> CreateCategoryAsync(CategoryCreateForm body)
        {
            return await _client.PostAsync<PlusApiResultCategoryVO>(ApiPaths.AppPath("/category"), body);
        }

        /// <summary>
        /// 获取标签列表
        /// </summary>
        public async Task<PlusApiResultListTagVO?> ListTagsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultListTagVO>(ApiPaths.AppPath("/category/tags"), query);
        }

        /// <summary>
        /// 创建标签
        /// </summary>
        public async Task<PlusApiResultTagVO?> CreateTagAsync(TagCreateForm body)
        {
            return await _client.PostAsync<PlusApiResultTagVO>(ApiPaths.AppPath("/category/tags"), body);
        }

        /// <summary>
        /// 获取分类路径
        /// </summary>
        public async Task<PlusApiResultListCategoryVO?> GetCategoryPathAsync(string categoryId)
        {
            return await _client.GetAsync<PlusApiResultListCategoryVO>(ApiPaths.AppPath($"/category/{categoryId}/path"));
        }

        /// <summary>
        /// 获取子分类
        /// </summary>
        public async Task<PlusApiResultListCategoryVO?> GetChildrenAsync(string categoryId)
        {
            return await _client.GetAsync<PlusApiResultListCategoryVO>(ApiPaths.AppPath($"/category/{categoryId}/children"));
        }

        /// <summary>
        /// 获取分类类型
        /// </summary>
        public async Task<PlusApiResultListCategoryTypeVO?> GetCategoryTypesAsync()
        {
            return await _client.GetAsync<PlusApiResultListCategoryTypeVO>(ApiPaths.AppPath("/category/types"));
        }

        /// <summary>
        /// 获取分类树
        /// </summary>
        public async Task<PlusApiResultListCategoryTreeVO?> GetCategoryTreeAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultListCategoryTreeVO>(ApiPaths.AppPath("/category/tree"), query);
        }

        /// <summary>
        /// 删除标签
        /// </summary>
        public async Task<PlusApiResultVoid?> DeleteTagAsync(string tagId)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/category/tags/{tagId}"));
        }
    }
}
