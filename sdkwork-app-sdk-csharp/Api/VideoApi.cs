using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class VideoApi
    {
        private readonly HttpClient _client;

        public VideoApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 获取视频详情
        /// </summary>
        public async Task<PlusApiResultVideoDetailVO?> GetVideoAsync(string videoId)
        {
            return await _client.GetAsync<PlusApiResultVideoDetailVO>(ApiPaths.AppPath($"/video/{videoId}"));
        }

        /// <summary>
        /// 更新视频
        /// </summary>
        public async Task<PlusApiResultVideoVO?> UpdateVideoAsync(string videoId, VideoUpdateForm body)
        {
            return await _client.PutAsync<PlusApiResultVideoVO>(ApiPaths.AppPath($"/video/{videoId}"), body);
        }

        /// <summary>
        /// 删除视频
        /// </summary>
        public async Task<PlusApiResultVoid?> DeleteVideoAsync(string videoId)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/video/{videoId}"));
        }

        /// <summary>
        /// 上传视频
        /// </summary>
        public async Task<PlusApiResultVideoVO?> CreateVideoAsync(VideoCreateForm body)
        {
            return await _client.PostAsync<PlusApiResultVideoVO>(ApiPaths.AppPath("/video"), body);
        }

        /// <summary>
        /// 发布视频
        /// </summary>
        public async Task<PlusApiResultVoid?> PublishAsync(string videoId)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/video/{videoId}/publish"), null);
        }

        /// <summary>
        /// 取消发布
        /// </summary>
        public async Task<PlusApiResultVoid?> UnpublishAsync(string videoId)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/video/{videoId}/publish"));
        }

        /// <summary>
        /// 点赞视频
        /// </summary>
        public async Task<PlusApiResultVoid?> LikeAsync(string videoId)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/video/{videoId}/like"), null);
        }

        /// <summary>
        /// 取消点赞
        /// </summary>
        public async Task<PlusApiResultVoid?> UnlikeAsync(string videoId)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/video/{videoId}/like"));
        }

        /// <summary>
        /// 收藏视频
        /// </summary>
        public async Task<PlusApiResultVoid?> FavoriteAsync(string videoId)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/video/{videoId}/favorite"), null);
        }

        /// <summary>
        /// 取消收藏
        /// </summary>
        public async Task<PlusApiResultVoid?> UnfavoriteAsync(string videoId)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/video/{videoId}/favorite"));
        }

        /// <summary>
        /// 记录下载
        /// </summary>
        public async Task<PlusApiResultVoid?> RecordDownloadAsync(string videoId)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/video/{videoId}/download"), null);
        }

        /// <summary>
        /// 创建视频生成任务
        /// </summary>
        public async Task<PlusApiResultGenerationTaskVO?> CreateGenerationAsync(VideoGenerationForm body)
        {
            return await _client.PostAsync<PlusApiResultGenerationTaskVO>(ApiPaths.AppPath("/generation/video"), body);
        }

        /// <summary>
        /// 视频风格转换
        /// </summary>
        public async Task<PlusApiResultGenerationTaskVO?> StyleTransferAsync(VideoStyleTransferForm body)
        {
            return await _client.PostAsync<PlusApiResultGenerationTaskVO>(ApiPaths.AppPath("/generation/video/style-transfer"), body);
        }

        /// <summary>
        /// 图生视频
        /// </summary>
        public async Task<PlusApiResultGenerationTaskVO?> ImageToAsync(ImageToVideoForm body)
        {
            return await _client.PostAsync<PlusApiResultGenerationTaskVO>(ApiPaths.AppPath("/generation/video/image-to-video"), body);
        }

        /// <summary>
        /// 视频延长
        /// </summary>
        public async Task<PlusApiResultGenerationTaskVO?> ExtendAsync(VideoExtendForm body)
        {
            return await _client.PostAsync<PlusApiResultGenerationTaskVO>(ApiPaths.AppPath("/generation/video/extend"), body);
        }

        /// <summary>
        /// 获取视频统计
        /// </summary>
        public async Task<PlusApiResultVideoStatisticsVO?> GetVideoStatisticsAsync()
        {
            return await _client.GetAsync<PlusApiResultVideoStatisticsVO>(ApiPaths.AppPath("/video/statistics"));
        }

        /// <summary>
        /// 搜索视频
        /// </summary>
        public async Task<PlusApiResultPageVideoVO?> SearchVideosAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageVideoVO>(ApiPaths.AppPath("/video/search"), query);
        }

        /// <summary>
        /// 获取公开视频
        /// </summary>
        public async Task<PlusApiResultPageVideoVO?> GetPublicVideosAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageVideoVO>(ApiPaths.AppPath("/video/public"), query);
        }

        /// <summary>
        /// 获取热门视频
        /// </summary>
        public async Task<PlusApiResultPageVideoVO?> GetPopularVideosAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageVideoVO>(ApiPaths.AppPath("/video/popular"), query);
        }

        /// <summary>
        /// 获取最受喜爱视频
        /// </summary>
        public async Task<PlusApiResultPageVideoVO?> GetMostLikedVideosAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageVideoVO>(ApiPaths.AppPath("/video/liked"), query);
        }

        /// <summary>
        /// 获取收藏视频
        /// </summary>
        public async Task<PlusApiResultPageVideoVO?> GetFavoriteVideosAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageVideoVO>(ApiPaths.AppPath("/video/favorites"), query);
        }

        /// <summary>
        /// 获取任务列表
        /// </summary>
        public async Task<PlusApiResultPageGenerationTaskVO?> ListTasksAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageGenerationTaskVO>(ApiPaths.AppPath("/generation/video/tasks"), query);
        }

        /// <summary>
        /// 获取任务状态
        /// </summary>
        public async Task<PlusApiResultGenerationTaskVO?> GetTaskStatusAsync(string taskId)
        {
            return await _client.GetAsync<PlusApiResultGenerationTaskVO>(ApiPaths.AppPath($"/generation/video/tasks/{taskId}"));
        }

        /// <summary>
        /// 取消任务
        /// </summary>
        public async Task<PlusApiResultVoid?> CancelTaskAsync(string taskId)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/generation/video/tasks/{taskId}"));
        }
    }
}
