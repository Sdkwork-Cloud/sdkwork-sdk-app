using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class MusicApi
    {
        private readonly HttpClient _client;

        public MusicApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 获取音乐详情
        /// </summary>
        public async Task<PlusApiResultMusicDetailVO?> GetMusicAsync(string musicId)
        {
            return await _client.GetAsync<PlusApiResultMusicDetailVO>(ApiPaths.AppPath($"/music/{musicId}"));
        }

        /// <summary>
        /// 更新音乐
        /// </summary>
        public async Task<PlusApiResultMusicVO?> UpdateMusicAsync(string musicId, MusicUpdateForm body)
        {
            return await _client.PutAsync<PlusApiResultMusicVO>(ApiPaths.AppPath($"/music/{musicId}"), body);
        }

        /// <summary>
        /// 删除音乐
        /// </summary>
        public async Task<PlusApiResultVoid?> DeleteMusicAsync(string musicId)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/music/{musicId}"));
        }

        /// <summary>
        /// 上传音乐
        /// </summary>
        public async Task<PlusApiResultMusicVO?> CreateMusicAsync(MusicCreateForm body)
        {
            return await _client.PostAsync<PlusApiResultMusicVO>(ApiPaths.AppPath("/music"), body);
        }

        /// <summary>
        /// 发布音乐
        /// </summary>
        public async Task<PlusApiResultVoid?> PublishAsync(string musicId)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/music/{musicId}/publish"), null);
        }

        /// <summary>
        /// 取消发布
        /// </summary>
        public async Task<PlusApiResultVoid?> UnpublishAsync(string musicId)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/music/{musicId}/publish"));
        }

        /// <summary>
        /// 点赞音乐
        /// </summary>
        public async Task<PlusApiResultVoid?> LikeAsync(string musicId)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/music/{musicId}/like"), null);
        }

        /// <summary>
        /// 取消点赞
        /// </summary>
        public async Task<PlusApiResultVoid?> UnlikeAsync(string musicId)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/music/{musicId}/like"));
        }

        /// <summary>
        /// 收藏音乐
        /// </summary>
        public async Task<PlusApiResultVoid?> FavoriteAsync(string musicId)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/music/{musicId}/favorite"), null);
        }

        /// <summary>
        /// 取消收藏
        /// </summary>
        public async Task<PlusApiResultVoid?> UnfavoriteAsync(string musicId)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/music/{musicId}/favorite"));
        }

        /// <summary>
        /// 记录下载
        /// </summary>
        public async Task<PlusApiResultVoid?> RecordDownloadAsync(string musicId)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/music/{musicId}/download"), null);
        }

        /// <summary>
        /// 创建音乐生成任务
        /// </summary>
        public async Task<PlusApiResultGenerationTaskVO?> CreateGenerationAsync(MusicGenerationForm body)
        {
            return await _client.PostAsync<PlusApiResultGenerationTaskVO>(ApiPaths.AppPath("/generation/music"), body);
        }

        /// <summary>
        /// 相似音乐生成
        /// </summary>
        public async Task<PlusApiResultGenerationTaskVO?> GenerateSimilarAsync(MusicSimilarForm body)
        {
            return await _client.PostAsync<PlusApiResultGenerationTaskVO>(ApiPaths.AppPath("/generation/music/similar"), body);
        }

        /// <summary>
        /// 音乐混音
        /// </summary>
        public async Task<PlusApiResultGenerationTaskVO?> RemixAsync(MusicRemixForm body)
        {
            return await _client.PostAsync<PlusApiResultGenerationTaskVO>(ApiPaths.AppPath("/generation/music/remix"), body);
        }

        /// <summary>
        /// 音乐续写
        /// </summary>
        public async Task<PlusApiResultGenerationTaskVO?> ExtendAsync(MusicExtendForm body)
        {
            return await _client.PostAsync<PlusApiResultGenerationTaskVO>(ApiPaths.AppPath("/generation/music/extend"), body);
        }

        /// <summary>
        /// 获取音乐统计
        /// </summary>
        public async Task<PlusApiResultMusicStatisticsVO?> GetMusicStatisticsAsync()
        {
            return await _client.GetAsync<PlusApiResultMusicStatisticsVO>(ApiPaths.AppPath("/music/statistics"));
        }

        /// <summary>
        /// 搜索音乐
        /// </summary>
        public async Task<PlusApiResultPageMusicVO?> SearchAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageMusicVO>(ApiPaths.AppPath("/music/search"), query);
        }

        /// <summary>
        /// 获取公开音乐
        /// </summary>
        public async Task<PlusApiResultPageMusicVO?> GetPublicAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageMusicVO>(ApiPaths.AppPath("/music/public"), query);
        }

        /// <summary>
        /// 获取热门音乐
        /// </summary>
        public async Task<PlusApiResultPageMusicVO?> GetPopularAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageMusicVO>(ApiPaths.AppPath("/music/popular"), query);
        }

        /// <summary>
        /// 获取最受喜爱音乐
        /// </summary>
        public async Task<PlusApiResultPageMusicVO?> GetMostLikedAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageMusicVO>(ApiPaths.AppPath("/music/liked"), query);
        }

        /// <summary>
        /// 获取收藏音乐
        /// </summary>
        public async Task<PlusApiResultPageMusicVO?> GetFavoriteAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageMusicVO>(ApiPaths.AppPath("/music/favorites"), query);
        }

        /// <summary>
        /// 获取任务列表
        /// </summary>
        public async Task<PlusApiResultPageGenerationTaskVO?> ListTasksAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageGenerationTaskVO>(ApiPaths.AppPath("/generation/music/tasks"), query);
        }

        /// <summary>
        /// 获取任务状态
        /// </summary>
        public async Task<PlusApiResultGenerationTaskVO?> GetTaskStatusAsync(string taskId)
        {
            return await _client.GetAsync<PlusApiResultGenerationTaskVO>(ApiPaths.AppPath($"/generation/music/tasks/{taskId}"));
        }

        /// <summary>
        /// 取消任务
        /// </summary>
        public async Task<PlusApiResultVoid?> CancelTaskAsync(string taskId)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/generation/music/tasks/{taskId}"));
        }

        /// <summary>
        /// 获取音乐风格列表
        /// </summary>
        public async Task<PlusApiResultMusicStylesVO?> GetMusicStylesAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultMusicStylesVO>(ApiPaths.AppPath("/generation/music/styles"), query);
        }
    }
}
