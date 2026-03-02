using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class AudioApi
    {
        private readonly HttpClient _client;

        public AudioApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 语音克隆
        /// </summary>
        public async Task<PlusApiResultGenerationTaskVO?> VoiceCloneAsync(VoiceCloneForm body)
        {
            return await _client.PostAsync<PlusApiResultGenerationTaskVO>(ApiPaths.AppPath("/generation/audio/voice-clone"), body);
        }

        /// <summary>
        /// 文本转语音
        /// </summary>
        public async Task<PlusApiResultGenerationTaskVO?> TextToSpeechAsync(AudioGenerationForm body)
        {
            return await _client.PostAsync<PlusApiResultGenerationTaskVO>(ApiPaths.AppPath("/generation/audio/tts"), body);
        }

        /// <summary>
        /// 语音翻译
        /// </summary>
        public async Task<PlusApiResultGenerationTaskVO?> TranslationAsync(AudioTranslationForm body)
        {
            return await _client.PostAsync<PlusApiResultGenerationTaskVO>(ApiPaths.AppPath("/generation/audio/translation"), body);
        }

        /// <summary>
        /// 语音转文本
        /// </summary>
        public async Task<PlusApiResultGenerationTaskVO?> TranscriptionAsync(AudioTranscriptionForm body)
        {
            return await _client.PostAsync<PlusApiResultGenerationTaskVO>(ApiPaths.AppPath("/generation/audio/transcription"), body);
        }

        /// <summary>
        /// 获取语音列表
        /// </summary>
        public async Task<PlusApiResultVoiceListVO?> GetVoiceListAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultVoiceListVO>(ApiPaths.AppPath("/generation/audio/voices"), query);
        }

        /// <summary>
        /// 获取转录结果
        /// </summary>
        public async Task<PlusApiResultGenerationTaskVO?> GetTranscriptionResultAsync(string taskId)
        {
            return await _client.GetAsync<PlusApiResultGenerationTaskVO>(ApiPaths.AppPath($"/generation/audio/transcription/{taskId}"));
        }

        /// <summary>
        /// 获取任务列表
        /// </summary>
        public async Task<PlusApiResultPageGenerationTaskVO?> ListTasksAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageGenerationTaskVO>(ApiPaths.AppPath("/generation/audio/tasks"), query);
        }

        /// <summary>
        /// 获取任务状态
        /// </summary>
        public async Task<PlusApiResultGenerationTaskVO?> GetTaskStatusAsync(string taskId)
        {
            return await _client.GetAsync<PlusApiResultGenerationTaskVO>(ApiPaths.AppPath($"/generation/audio/tasks/{taskId}"));
        }

        /// <summary>
        /// 取消任务
        /// </summary>
        public async Task<PlusApiResultVoid?> CancelTaskAsync(string taskId)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/generation/audio/tasks/{taskId}"));
        }
    }
}
