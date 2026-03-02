using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class CharacterApi
    {
        private readonly HttpClient _client;

        public CharacterApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 获取角色详情
        /// </summary>
        public async Task<PlusApiResultCharacterDetailVO?> GetCharacterAsync(string characterId)
        {
            return await _client.GetAsync<PlusApiResultCharacterDetailVO>(ApiPaths.AppPath($"/character/{characterId}"));
        }

        /// <summary>
        /// 更新角色
        /// </summary>
        public async Task<PlusApiResultCharacterVO?> UpdateCharacterAsync(string characterId, CharacterUpdateForm body)
        {
            return await _client.PutAsync<PlusApiResultCharacterVO>(ApiPaths.AppPath($"/character/{characterId}"), body);
        }

        /// <summary>
        /// 删除角色
        /// </summary>
        public async Task<PlusApiResultVoid?> DeleteCharacterAsync(string characterId)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/character/{characterId}"));
        }

        /// <summary>
        /// 创建角色生成任务
        /// </summary>
        public async Task<PlusApiResultGenerationTaskVO?> CreateGenerationAsync(CharacterGenerationForm body)
        {
            return await _client.PostAsync<PlusApiResultGenerationTaskVO>(ApiPaths.AppPath("/generation/character"), body);
        }

        /// <summary>
        /// 批量创建角色生成任务
        /// </summary>
        public async Task<PlusApiResultListGenerationTaskVO?> BatchCreateGenerationAsync(CharacterBatchGenerationForm body)
        {
            return await _client.PostAsync<PlusApiResultListGenerationTaskVO>(ApiPaths.AppPath("/generation/character/batch"), body);
        }

        /// <summary>
        /// 创建角色
        /// </summary>
        public async Task<PlusApiResultCharacterVO?> CreateCharacterAsync(CharacterCreateForm body)
        {
            return await _client.PostAsync<PlusApiResultCharacterVO>(ApiPaths.AppPath("/character"), body);
        }

        /// <summary>
        /// 使用角色
        /// </summary>
        public async Task<PlusApiResultVoid?> UseAsync(string characterId)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/character/{characterId}/use"), null);
        }

        /// <summary>
        /// 点赞角色
        /// </summary>
        public async Task<PlusApiResultVoid?> LikeAsync(string characterId)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/character/{characterId}/like"), null);
        }

        /// <summary>
        /// 取消点赞
        /// </summary>
        public async Task<PlusApiResultVoid?> UnlikeAsync(string characterId)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/character/{characterId}/like"));
        }

        /// <summary>
        /// 获取角色详情
        /// </summary>
        public async Task<PlusApiResultCharacterGenerationVO?> GetCharacterDetailAsync(string characterId)
        {
            return await _client.GetAsync<PlusApiResultCharacterGenerationVO>(ApiPaths.AppPath($"/generation/character/{characterId}"));
        }

        /// <summary>
        /// 获取任务列表
        /// </summary>
        public async Task<PlusApiResultPageGenerationTaskVO?> ListTasksAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageGenerationTaskVO>(ApiPaths.AppPath("/generation/character/tasks"), query);
        }

        /// <summary>
        /// 获取任务状态
        /// </summary>
        public async Task<PlusApiResultGenerationTaskVO?> GetTaskStatusAsync(string taskId)
        {
            return await _client.GetAsync<PlusApiResultGenerationTaskVO>(ApiPaths.AppPath($"/generation/character/tasks/{taskId}"));
        }

        /// <summary>
        /// 取消任务
        /// </summary>
        public async Task<PlusApiResultVoid?> CancelTaskAsync(string taskId)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/generation/character/tasks/{taskId}"));
        }

        /// <summary>
        /// 获取角色列表
        /// </summary>
        public async Task<PlusApiResultPageCharacterListVO?> ListCharactersAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageCharacterListVO>(ApiPaths.AppPath("/generation/character/list"), query);
        }

        /// <summary>
        /// 搜索角色
        /// </summary>
        public async Task<PlusApiResultPageCharacterVO?> SearchCharactersAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageCharacterVO>(ApiPaths.AppPath("/character/search"), query);
        }

        /// <summary>
        /// 获取热门角色
        /// </summary>
        public async Task<PlusApiResultPageCharacterVO?> GetPopularCharactersAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageCharacterVO>(ApiPaths.AppPath("/character/popular"), query);
        }

        /// <summary>
        /// 获取我的角色
        /// </summary>
        public async Task<PlusApiResultPageCharacterVO?> GetMyCharactersAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageCharacterVO>(ApiPaths.AppPath("/character/my"), query);
        }

        /// <summary>
        /// 获取最受喜爱角色
        /// </summary>
        public async Task<PlusApiResultPageCharacterVO?> GetMostLikedCharactersAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageCharacterVO>(ApiPaths.AppPath("/character/liked"), query);
        }

        /// <summary>
        /// 获取智能体关联角色
        /// </summary>
        public async Task<PlusApiResultCharacterVO?> GetCharacterByAgentAsync(string agentId)
        {
            return await _client.GetAsync<PlusApiResultCharacterVO>(ApiPaths.AppPath($"/character/agent/{agentId}"));
        }
    }
}
