using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class VoiceSpeakerApi
    {
        private readonly HttpClient _client;

        public VoiceSpeakerApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 创建语音生成任务
        /// </summary>
        public async Task<PlusApiResultGenerationTaskVO?> CreateGenerationAsync(VoiceSpeakerGenerationForm body)
        {
            return await _client.PostAsync<PlusApiResultGenerationTaskVO>(ApiPaths.AppPath("/generation/voice-speaker"), body);
        }

        /// <summary>
        /// 克隆说话人
        /// </summary>
        public async Task<PlusApiResultGenerationTaskVO?> CloneSpeakerAsync(VoiceSpeakerCloneForm body)
        {
            return await _client.PostAsync<PlusApiResultGenerationTaskVO>(ApiPaths.AppPath("/generation/voice-speaker/clone"), body);
        }

        /// <summary>
        /// 获取说话人详情
        /// </summary>
        public async Task<PlusApiResultVoiceSpeakerGenerationVO?> GetSpeakerDetailAsync(string speakerId)
        {
            return await _client.GetAsync<PlusApiResultVoiceSpeakerGenerationVO>(ApiPaths.AppPath($"/generation/voice-speaker/{speakerId}"));
        }

        /// <summary>
        /// 删除说话人
        /// </summary>
        public async Task<PlusApiResultVoid?> DeleteSpeakerAsync(string speakerId)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/generation/voice-speaker/{speakerId}"));
        }

        /// <summary>
        /// 获取任务列表
        /// </summary>
        public async Task<PlusApiResultPageGenerationTaskVO?> ListTasksAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageGenerationTaskVO>(ApiPaths.AppPath("/generation/voice-speaker/tasks"), query);
        }

        /// <summary>
        /// 获取任务状态
        /// </summary>
        public async Task<PlusApiResultGenerationTaskVO?> GetTaskStatusAsync(string taskId)
        {
            return await _client.GetAsync<PlusApiResultGenerationTaskVO>(ApiPaths.AppPath($"/generation/voice-speaker/tasks/{taskId}"));
        }

        /// <summary>
        /// 取消任务
        /// </summary>
        public async Task<PlusApiResultVoid?> CancelTaskAsync(string taskId)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/generation/voice-speaker/tasks/{taskId}"));
        }

        /// <summary>
        /// 获取说话人列表
        /// </summary>
        public async Task<PlusApiResultPageVoiceSpeakerListVO?> ListSpeakersAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageVoiceSpeakerListVO>(ApiPaths.AppPath("/generation/voice-speaker/list"), query);
        }
    }
}
