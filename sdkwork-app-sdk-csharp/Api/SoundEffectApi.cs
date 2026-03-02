using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class SoundEffectApi
    {
        private readonly HttpClient _client;

        public SoundEffectApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 创建音效生成任务
        /// </summary>
        public async Task<PlusApiResultGenerationTaskVO?> CreateGenerationAsync(SoundEffectGenerationForm body)
        {
            return await _client.PostAsync<PlusApiResultGenerationTaskVO>(ApiPaths.AppPath("/generation/sound-effect"), body);
        }

        /// <summary>
        /// 获取音效详情
        /// </summary>
        public async Task<PlusApiResultSoundEffectGenerationVO?> GetEffectDetailAsync(string effectId)
        {
            return await _client.GetAsync<PlusApiResultSoundEffectGenerationVO>(ApiPaths.AppPath($"/generation/sound-effect/{effectId}"));
        }

        /// <summary>
        /// 获取任务列表
        /// </summary>
        public async Task<PlusApiResultPageGenerationTaskVO?> ListTasksAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageGenerationTaskVO>(ApiPaths.AppPath("/generation/sound-effect/tasks"), query);
        }

        /// <summary>
        /// 获取任务状态
        /// </summary>
        public async Task<PlusApiResultGenerationTaskVO?> GetTaskStatusAsync(string taskId)
        {
            return await _client.GetAsync<PlusApiResultGenerationTaskVO>(ApiPaths.AppPath($"/generation/sound-effect/tasks/{taskId}"));
        }

        /// <summary>
        /// 取消任务
        /// </summary>
        public async Task<PlusApiResultVoid?> CancelTaskAsync(string taskId)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/generation/sound-effect/tasks/{taskId}"));
        }

        /// <summary>
        /// 获取音效类别
        /// </summary>
        public async Task<PlusApiResultSoundEffectCategoriesVO?> GetCategoriesAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultSoundEffectCategoriesVO>(ApiPaths.AppPath("/generation/sound-effect/categories"), query);
        }
    }
}
