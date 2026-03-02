using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class StyleApi
    {
        private readonly HttpClient _client;

        public StyleApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 获取风格详情
        /// </summary>
        public async Task<PlusApiResultGenerationStyleDetailVO?> GetStyleAsync(string styleId)
        {
            return await _client.GetAsync<PlusApiResultGenerationStyleDetailVO>(ApiPaths.AppPath($"/generation/style/{styleId}"));
        }

        /// <summary>
        /// 更新风格
        /// </summary>
        public async Task<PlusApiResultGenerationStyleVO?> UpdateStyleAsync(string styleId, GenerationStyleUpdateForm body)
        {
            return await _client.PutAsync<PlusApiResultGenerationStyleVO>(ApiPaths.AppPath($"/generation/style/{styleId}"), body);
        }

        /// <summary>
        /// 删除风格
        /// </summary>
        public async Task<PlusApiResultVoid?> DeleteStyleAsync(string styleId)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/generation/style/{styleId}"));
        }

        /// <summary>
        /// 创建风格
        /// </summary>
        public async Task<PlusApiResultGenerationStyleVO?> CreateStyleAsync(GenerationStyleCreateForm body)
        {
            return await _client.PostAsync<PlusApiResultGenerationStyleVO>(ApiPaths.AppPath("/generation/style"), body);
        }

        /// <summary>
        /// 发布风格
        /// </summary>
        public async Task<PlusApiResultVoid?> PublishAsync(string styleId)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/generation/style/{styleId}/publish"), null);
        }

        /// <summary>
        /// 取消发布
        /// </summary>
        public async Task<PlusApiResultVoid?> UnpublishAsync(string styleId)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/generation/style/{styleId}/publish"));
        }

        /// <summary>
        /// 停用风格
        /// </summary>
        public async Task<PlusApiResultVoid?> DeactivateAsync(string styleId)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/generation/style/{styleId}/deactivate"), null);
        }

        /// <summary>
        /// 激活风格
        /// </summary>
        public async Task<PlusApiResultVoid?> ActivateAsync(string styleId)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/generation/style/{styleId}/activate"), null);
        }

        /// <summary>
        /// 获取风格类型列表
        /// </summary>
        public async Task<PlusApiResultListStyleTypeVO?> GetStyleTypesAsync()
        {
            return await _client.GetAsync<PlusApiResultListStyleTypeVO>(ApiPaths.AppPath("/generation/style/types"));
        }

        /// <summary>
        /// 获取风格统计
        /// </summary>
        public async Task<PlusApiResultStyleStatisticsVO?> GetStyleStatisticsAsync()
        {
            return await _client.GetAsync<PlusApiResultStyleStatisticsVO>(ApiPaths.AppPath("/generation/style/statistics"));
        }

        /// <summary>
        /// 搜索风格
        /// </summary>
        public async Task<PlusApiResultPageGenerationStyleVO?> SearchStylesAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageGenerationStyleVO>(ApiPaths.AppPath("/generation/style/search"), query);
        }

        /// <summary>
        /// 获取公开风格
        /// </summary>
        public async Task<PlusApiResultPageGenerationStyleVO?> GetPublicStylesAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageGenerationStyleVO>(ApiPaths.AppPath("/generation/style/public"), query);
        }

        /// <summary>
        /// 获取热门风格
        /// </summary>
        public async Task<PlusApiResultPageGenerationStyleVO?> GetPopularStylesAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageGenerationStyleVO>(ApiPaths.AppPath("/generation/style/popular"), query);
        }

        /// <summary>
        /// 获取我的风格
        /// </summary>
        public async Task<PlusApiResultPageGenerationStyleVO?> GetMyStylesAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageGenerationStyleVO>(ApiPaths.AppPath("/generation/style/my"), query);
        }
    }
}
