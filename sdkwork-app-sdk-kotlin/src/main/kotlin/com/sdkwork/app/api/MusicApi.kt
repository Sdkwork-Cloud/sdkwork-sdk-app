package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class MusicApi(private val client: HttpClient) {

    /** 获取音乐详情 */
    suspend fun getMusic(musicId: String): PlusApiResultMusicDetailVO? {
        return client.get(ApiPaths.appPath("/music/$musicId")) as? PlusApiResultMusicDetailVO
    }

    /** 更新音乐 */
    suspend fun updateMusic(musicId: String, body: MusicUpdateForm): PlusApiResultMusicVO? {
        return client.put(ApiPaths.appPath("/music/$musicId"), body) as? PlusApiResultMusicVO
    }

    /** 删除音乐 */
    suspend fun deleteMusic(musicId: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/music/$musicId")) as? PlusApiResultVoid
    }

    /** 上传音乐 */
    suspend fun createMusic(body: MusicCreateForm): PlusApiResultMusicVO? {
        return client.post(ApiPaths.appPath("/music"), body) as? PlusApiResultMusicVO
    }

    /** 发布音乐 */
    suspend fun publish(musicId: String): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/music/$musicId/publish"), null) as? PlusApiResultVoid
    }

    /** 取消发布 */
    suspend fun unpublish(musicId: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/music/$musicId/publish")) as? PlusApiResultVoid
    }

    /** 点赞音乐 */
    suspend fun like(musicId: String): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/music/$musicId/like"), null) as? PlusApiResultVoid
    }

    /** 取消点赞 */
    suspend fun unlike(musicId: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/music/$musicId/like")) as? PlusApiResultVoid
    }

    /** 收藏音乐 */
    suspend fun favorite(musicId: String): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/music/$musicId/favorite"), null) as? PlusApiResultVoid
    }

    /** 取消收藏 */
    suspend fun unfavorite(musicId: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/music/$musicId/favorite")) as? PlusApiResultVoid
    }

    /** 记录下载 */
    suspend fun recordDownload(musicId: String): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/music/$musicId/download"), null) as? PlusApiResultVoid
    }

    /** 创建音乐生成任务 */
    suspend fun createGeneration(body: MusicGenerationForm): PlusApiResultGenerationTaskVO? {
        return client.post(ApiPaths.appPath("/generation/music"), body) as? PlusApiResultGenerationTaskVO
    }

    /** 相似音乐生成 */
    suspend fun generateSimilar(body: MusicSimilarForm): PlusApiResultGenerationTaskVO? {
        return client.post(ApiPaths.appPath("/generation/music/similar"), body) as? PlusApiResultGenerationTaskVO
    }

    /** 音乐混音 */
    suspend fun remix(body: MusicRemixForm): PlusApiResultGenerationTaskVO? {
        return client.post(ApiPaths.appPath("/generation/music/remix"), body) as? PlusApiResultGenerationTaskVO
    }

    /** 音乐续写 */
    suspend fun extend(body: MusicExtendForm): PlusApiResultGenerationTaskVO? {
        return client.post(ApiPaths.appPath("/generation/music/extend"), body) as? PlusApiResultGenerationTaskVO
    }

    /** 获取音乐统计 */
    suspend fun getMusicStatistics(): PlusApiResultMusicStatisticsVO? {
        return client.get(ApiPaths.appPath("/music/statistics")) as? PlusApiResultMusicStatisticsVO
    }

    /** 搜索音乐 */
    suspend fun search(params: Map<String, Any>? = null): PlusApiResultPageMusicVO? {
        return client.get(ApiPaths.appPath("/music/search"), params) as? PlusApiResultPageMusicVO
    }

    /** 获取公开音乐 */
    suspend fun getPublic(params: Map<String, Any>? = null): PlusApiResultPageMusicVO? {
        return client.get(ApiPaths.appPath("/music/public"), params) as? PlusApiResultPageMusicVO
    }

    /** 获取热门音乐 */
    suspend fun getPopular(params: Map<String, Any>? = null): PlusApiResultPageMusicVO? {
        return client.get(ApiPaths.appPath("/music/popular"), params) as? PlusApiResultPageMusicVO
    }

    /** 获取最受喜爱音乐 */
    suspend fun getMostLiked(params: Map<String, Any>? = null): PlusApiResultPageMusicVO? {
        return client.get(ApiPaths.appPath("/music/liked"), params) as? PlusApiResultPageMusicVO
    }

    /** 获取收藏音乐 */
    suspend fun getFavorite(params: Map<String, Any>? = null): PlusApiResultPageMusicVO? {
        return client.get(ApiPaths.appPath("/music/favorites"), params) as? PlusApiResultPageMusicVO
    }

    /** 获取任务列表 */
    suspend fun listTasks(params: Map<String, Any>? = null): PlusApiResultPageGenerationTaskVO? {
        return client.get(ApiPaths.appPath("/generation/music/tasks"), params) as? PlusApiResultPageGenerationTaskVO
    }

    /** 获取任务状态 */
    suspend fun getTaskStatus(taskId: String): PlusApiResultGenerationTaskVO? {
        return client.get(ApiPaths.appPath("/generation/music/tasks/$taskId")) as? PlusApiResultGenerationTaskVO
    }

    /** 取消任务 */
    suspend fun cancelTask(taskId: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/generation/music/tasks/$taskId")) as? PlusApiResultVoid
    }

    /** 获取音乐风格列表 */
    suspend fun getMusicStyles(params: Map<String, Any>? = null): PlusApiResultMusicStylesVO? {
        return client.get(ApiPaths.appPath("/generation/music/styles"), params) as? PlusApiResultMusicStylesVO
    }
}
