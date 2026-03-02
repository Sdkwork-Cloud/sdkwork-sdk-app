using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class ImageApi
    {
        private readonly HttpClient _client;

        public ImageApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 获取图片详情
        /// </summary>
        public async Task<PlusApiResultImageDetailVO?> GetImageAsync(string imageId)
        {
            return await _client.GetAsync<PlusApiResultImageDetailVO>(ApiPaths.AppPath($"/image/{imageId}"));
        }

        /// <summary>
        /// 更新图片
        /// </summary>
        public async Task<PlusApiResultImageVO?> UpdateImageAsync(string imageId, ImageUpdateForm body)
        {
            return await _client.PutAsync<PlusApiResultImageVO>(ApiPaths.AppPath($"/image/{imageId}"), body);
        }

        /// <summary>
        /// 删除图片
        /// </summary>
        public async Task<PlusApiResultVoid?> DeleteImageAsync(string imageId)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/image/{imageId}"));
        }

        /// <summary>
        /// 上传图片
        /// </summary>
        public async Task<PlusApiResultImageVO?> CreateImageAsync(ImageCreateForm body)
        {
            return await _client.PostAsync<PlusApiResultImageVO>(ApiPaths.AppPath("/image"), body);
        }

        /// <summary>
        /// 点赞图片
        /// </summary>
        public async Task<PlusApiResultVoid?> LikeAsync(string imageId)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/image/{imageId}/like"), null);
        }

        /// <summary>
        /// 取消点赞
        /// </summary>
        public async Task<PlusApiResultVoid?> UnlikeAsync(string imageId)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/image/{imageId}/like"));
        }

        /// <summary>
        /// 收藏图片
        /// </summary>
        public async Task<PlusApiResultVoid?> FavoriteAsync(string imageId)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/image/{imageId}/favorite"), null);
        }

        /// <summary>
        /// 取消收藏
        /// </summary>
        public async Task<PlusApiResultVoid?> UnfavoriteAsync(string imageId)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/image/{imageId}/favorite"));
        }

        /// <summary>
        /// 记录下载
        /// </summary>
        public async Task<PlusApiResultVoid?> RecordDownloadAsync(string imageId)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/image/{imageId}/download"), null);
        }

        /// <summary>
        /// 创建图片生成任务
        /// </summary>
        public async Task<PlusApiResultGenerationTaskVO?> CreateGenerationAsync(ImageGenerationForm body)
        {
            return await _client.PostAsync<PlusApiResultGenerationTaskVO>(ApiPaths.AppPath("/generation/image"), body);
        }

        /// <summary>
        /// 生成变体
        /// </summary>
        public async Task<PlusApiResultGenerationTaskVO?> CreateVariationAsync(ImageVariationForm body)
        {
            return await _client.PostAsync<PlusApiResultGenerationTaskVO>(ApiPaths.AppPath("/generation/image/variations"), body);
        }

        /// <summary>
        /// 图片放大
        /// </summary>
        public async Task<PlusApiResultGenerationTaskVO?> UpscaleAsync(ImageUpscaleForm body)
        {
            return await _client.PostAsync<PlusApiResultGenerationTaskVO>(ApiPaths.AppPath("/generation/image/upscale"), body);
        }

        /// <summary>
        /// 图片编辑
        /// </summary>
        public async Task<PlusApiResultGenerationTaskVO?> EditAsync(ImageEditForm body)
        {
            return await _client.PostAsync<PlusApiResultGenerationTaskVO>(ApiPaths.AppPath("/generation/image/edits"), body);
        }

        /// <summary>
        /// 获取图片统计
        /// </summary>
        public async Task<PlusApiResultImageStatisticsVO?> GetImageStatisticsAsync()
        {
            return await _client.GetAsync<PlusApiResultImageStatisticsVO>(ApiPaths.AppPath("/image/statistics"));
        }

        /// <summary>
        /// 搜索图片
        /// </summary>
        public async Task<PlusApiResultPageImageVO?> SearchImagesAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageImageVO>(ApiPaths.AppPath("/image/search"), query);
        }

        /// <summary>
        /// 获取公开图片
        /// </summary>
        public async Task<PlusApiResultPageImageVO?> GetPublicImagesAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageImageVO>(ApiPaths.AppPath("/image/public"), query);
        }

        /// <summary>
        /// 获取热门图片
        /// </summary>
        public async Task<PlusApiResultPageImageVO?> GetPopularImagesAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageImageVO>(ApiPaths.AppPath("/image/popular"), query);
        }

        /// <summary>
        /// 获取最受喜爱图片
        /// </summary>
        public async Task<PlusApiResultPageImageVO?> GetMostLikedImagesAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageImageVO>(ApiPaths.AppPath("/image/liked"), query);
        }

        /// <summary>
        /// 获取收藏图片
        /// </summary>
        public async Task<PlusApiResultPageImageVO?> GetFavoriteImagesAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageImageVO>(ApiPaths.AppPath("/image/favorites"), query);
        }

        /// <summary>
        /// 获取任务列表
        /// </summary>
        public async Task<PlusApiResultPageGenerationTaskVO?> ListTasksAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageGenerationTaskVO>(ApiPaths.AppPath("/generation/image/tasks"), query);
        }

        /// <summary>
        /// 获取任务状态
        /// </summary>
        public async Task<PlusApiResultGenerationTaskVO?> GetTaskStatusAsync(string taskId)
        {
            return await _client.GetAsync<PlusApiResultGenerationTaskVO>(ApiPaths.AppPath($"/generation/image/tasks/{taskId}"));
        }

        /// <summary>
        /// 取消任务
        /// </summary>
        public async Task<PlusApiResultVoid?> CancelTaskAsync(string taskId)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/generation/image/tasks/{taskId}"));
        }
    }
}
