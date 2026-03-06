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
        /// 获取发音人详情
        /// </summary>
        public async Task<PlusApiResultVoiceSpeakerDetailVO?> GetSpeakerDetailAsync(string speakerId)
        {
            return await _client.GetAsync<PlusApiResultVoiceSpeakerDetailVO>(ApiPaths.AppPath($"/voice-speakers/{speakerId}"));
        }

        /// <summary>
        /// 更新发音人
        /// </summary>
        public async Task<PlusApiResultVoiceSpeakerVO?> UpdateSpeakerAsync(string speakerId, VoiceSpeakerCreateForm body)
        {
            return await _client.PutAsync<PlusApiResultVoiceSpeakerVO>(ApiPaths.AppPath($"/voice-speakers/{speakerId}"), body);
        }

        /// <summary>
        /// 删除发音人
        /// </summary>
        public async Task<PlusApiResultVoid?> DeleteSpeakerAsync(string speakerId)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/voice-speakers/{speakerId}"));
        }

        /// <summary>
        /// 获取发音人列表
        /// </summary>
        public async Task<PlusApiResultPageVoiceSpeakerVO?> ListSpeakersAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageVoiceSpeakerVO>(ApiPaths.AppPath("/voice-speakers"), query);
        }

        /// <summary>
        /// 创建发音人
        /// </summary>
        public async Task<PlusApiResultVoiceSpeakerVO?> CreateSpeakerAsync(VoiceSpeakerCreateForm body)
        {
            return await _client.PostAsync<PlusApiResultVoiceSpeakerVO>(ApiPaths.AppPath("/voice-speakers"), body);
        }

        /// <summary>
        /// 更新发音人状态
        /// </summary>
        public async Task<PlusApiResultVoid?> UpdateStatusAsync(string speakerId, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/voice-speakers/{speakerId}/status"), null, query);
        }

        /// <summary>
        /// 设为默认发音人
        /// </summary>
        public async Task<PlusApiResultVoiceSpeakerVO?> SetAsDefaultAsync(string speakerId)
        {
            return await _client.PostAsync<PlusApiResultVoiceSpeakerVO>(ApiPaths.AppPath($"/voice-speakers/{speakerId}/set-default"), null);
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
        /// 获取发音人统计
        /// </summary>
        public async Task<PlusApiResultSpeakerStatisticsVO?> GetStatisticsAsync()
        {
            return await _client.GetAsync<PlusApiResultSpeakerStatisticsVO>(ApiPaths.AppPath("/voice-speakers/statistics"));
        }

        /// <summary>
        /// 获取默认发音人
        /// </summary>
        public async Task<PlusApiResultVoiceSpeakerVO?> GetDefaultSpeakerAsync()
        {
            return await _client.GetAsync<PlusApiResultVoiceSpeakerVO>(ApiPaths.AppPath("/voice-speakers/default"));
        }

        /// <summary>
        /// 根据代码获取发音人
        /// </summary>
        public async Task<PlusApiResultVoiceSpeakerVO?> GetSpeakerByCodeAsync(string code)
        {
            return await _client.GetAsync<PlusApiResultVoiceSpeakerVO>(ApiPaths.AppPath($"/voice-speakers/code/{code}"));
        }

        /// <summary>
        /// 获取渠道发音人
        /// </summary>
        public async Task<PlusApiResultListVoiceSpeakerVO?> ListSpeakersByChannelAsync(string channel)
        {
            return await _client.GetAsync<PlusApiResultListVoiceSpeakerVO>(ApiPaths.AppPath($"/voice-speakers/channel/{channel}"));
        }

        /// <summary>
        /// 获取说话人详情
        /// </summary>
        public async Task<PlusApiResultVoiceSpeakerGenerationVO?> GetSpeakerDetailVoiceAsync(string speakerId)
        {
            return await _client.GetAsync<PlusApiResultVoiceSpeakerGenerationVO>(ApiPaths.AppPath($"/generation/voice-speaker/{speakerId}"));
        }

        /// <summary>
        /// 删除说话人
        /// </summary>
        public async Task<PlusApiResultVoid?> DeleteSpeakerVoiceAsync(string speakerId)
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
        public async Task<PlusApiResultPageVoiceSpeakerListVO?> GetListSpeakersAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageVoiceSpeakerListVO>(ApiPaths.AppPath("/generation/voice-speaker/list"), query);
        }
    }
}
