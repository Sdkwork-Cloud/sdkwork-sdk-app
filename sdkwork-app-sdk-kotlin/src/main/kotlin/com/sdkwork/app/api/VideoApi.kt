package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class VideoApi(private val client: HttpClient) {

    /** 获取视频详情 */
    suspend fun getVideo(videoId: String): PlusApiResultVideoDetailVO? {
        return client.get(ApiPaths.appPath("/video/$videoId")) as? PlusApiResultVideoDetailVO
    }

    /** 更新视频 */
    suspend fun updateVideo(videoId: String, body: VideoUpdateForm): PlusApiResultVideoVO? {
        return client.put(ApiPaths.appPath("/video/$videoId"), body) as? PlusApiResultVideoVO
    }

    /** 删除视频 */
    suspend fun deleteVideo(videoId: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/video/$videoId")) as? PlusApiResultVoid
    }

    /** 上传视频 */
    suspend fun createVideo(body: VideoCreateForm): PlusApiResultVideoVO? {
        return client.post(ApiPaths.appPath("/video"), body) as? PlusApiResultVideoVO
    }

    /** 发布视频 */
    suspend fun publish(videoId: String): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/video/$videoId/publish"), null) as? PlusApiResultVoid
    }

    /** 取消发布 */
    suspend fun unpublish(videoId: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/video/$videoId/publish")) as? PlusApiResultVoid
    }

    /** 点赞视频 */
    suspend fun like(videoId: String): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/video/$videoId/like"), null) as? PlusApiResultVoid
    }

    /** 取消点赞 */
    suspend fun unlike(videoId: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/video/$videoId/like")) as? PlusApiResultVoid
    }

    /** 收藏视频 */
    suspend fun favorite(videoId: String): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/video/$videoId/favorite"), null) as? PlusApiResultVoid
    }

    /** 取消收藏 */
    suspend fun unfavorite(videoId: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/video/$videoId/favorite")) as? PlusApiResultVoid
    }

    /** 记录下载 */
    suspend fun recordDownload(videoId: String): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/video/$videoId/download"), null) as? PlusApiResultVoid
    }

    /** 创建视频生成任务 */
    suspend fun createGeneration(body: VideoGenerationForm): PlusApiResultGenerationTaskVO? {
        return client.post(ApiPaths.appPath("/generation/video"), body) as? PlusApiResultGenerationTaskVO
    }

    /** 视频风格转换 */
    suspend fun styleTransfer(body: VideoStyleTransferForm): PlusApiResultGenerationTaskVO? {
        return client.post(ApiPaths.appPath("/generation/video/style-transfer"), body) as? PlusApiResultGenerationTaskVO
    }

    /** 图生视频 */
    suspend fun imageTo(body: ImageToVideoForm): PlusApiResultGenerationTaskVO? {
        return client.post(ApiPaths.appPath("/generation/video/image-to-video"), body) as? PlusApiResultGenerationTaskVO
    }

    /** 视频延长 */
    suspend fun extend(body: VideoExtendForm): PlusApiResultGenerationTaskVO? {
        return client.post(ApiPaths.appPath("/generation/video/extend"), body) as? PlusApiResultGenerationTaskVO
    }

    /** 获取视频统计 */
    suspend fun getVideoStatistics(): PlusApiResultVideoStatisticsVO? {
        return client.get(ApiPaths.appPath("/video/statistics")) as? PlusApiResultVideoStatisticsVO
    }

    /** 搜索视频 */
    suspend fun searchVideos(params: Map<String, Any>? = null): PlusApiResultPageVideoVO? {
        return client.get(ApiPaths.appPath("/video/search"), params) as? PlusApiResultPageVideoVO
    }

    /** 获取公开视频 */
    suspend fun getPublicVideos(params: Map<String, Any>? = null): PlusApiResultPageVideoVO? {
        return client.get(ApiPaths.appPath("/video/public"), params) as? PlusApiResultPageVideoVO
    }

    /** 获取热门视频 */
    suspend fun getPopularVideos(params: Map<String, Any>? = null): PlusApiResultPageVideoVO? {
        return client.get(ApiPaths.appPath("/video/popular"), params) as? PlusApiResultPageVideoVO
    }

    /** 获取最受喜爱视频 */
    suspend fun getMostLikedVideos(params: Map<String, Any>? = null): PlusApiResultPageVideoVO? {
        return client.get(ApiPaths.appPath("/video/liked"), params) as? PlusApiResultPageVideoVO
    }

    /** 获取收藏视频 */
    suspend fun getFavoriteVideos(params: Map<String, Any>? = null): PlusApiResultPageVideoVO? {
        return client.get(ApiPaths.appPath("/video/favorites"), params) as? PlusApiResultPageVideoVO
    }

    /** 获取任务列表 */
    suspend fun listTasks(params: Map<String, Any>? = null): PlusApiResultPageGenerationTaskVO? {
        return client.get(ApiPaths.appPath("/generation/video/tasks"), params) as? PlusApiResultPageGenerationTaskVO
    }

    /** 获取任务状态 */
    suspend fun getTaskStatus(taskId: String): PlusApiResultGenerationTaskVO? {
        return client.get(ApiPaths.appPath("/generation/video/tasks/$taskId")) as? PlusApiResultGenerationTaskVO
    }

    /** 取消任务 */
    suspend fun cancelTask(taskId: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/generation/video/tasks/$taskId")) as? PlusApiResultVoid
    }
}
