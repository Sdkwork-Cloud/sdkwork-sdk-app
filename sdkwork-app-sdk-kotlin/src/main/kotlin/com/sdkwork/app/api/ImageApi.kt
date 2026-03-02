package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class ImageApi(private val client: HttpClient) {

    /** 获取图片详情 */
    suspend fun getImage(imageId: String): PlusApiResultImageDetailVO? {
        return client.get(ApiPaths.appPath("/image/$imageId")) as? PlusApiResultImageDetailVO
    }

    /** 更新图片 */
    suspend fun updateImage(imageId: String, body: ImageUpdateForm): PlusApiResultImageVO? {
        return client.put(ApiPaths.appPath("/image/$imageId"), body) as? PlusApiResultImageVO
    }

    /** 删除图片 */
    suspend fun deleteImage(imageId: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/image/$imageId")) as? PlusApiResultVoid
    }

    /** 上传图片 */
    suspend fun createImage(body: ImageCreateForm): PlusApiResultImageVO? {
        return client.post(ApiPaths.appPath("/image"), body) as? PlusApiResultImageVO
    }

    /** 点赞图片 */
    suspend fun like(imageId: String): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/image/$imageId/like"), null) as? PlusApiResultVoid
    }

    /** 取消点赞 */
    suspend fun unlike(imageId: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/image/$imageId/like")) as? PlusApiResultVoid
    }

    /** 收藏图片 */
    suspend fun favorite(imageId: String): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/image/$imageId/favorite"), null) as? PlusApiResultVoid
    }

    /** 取消收藏 */
    suspend fun unfavorite(imageId: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/image/$imageId/favorite")) as? PlusApiResultVoid
    }

    /** 记录下载 */
    suspend fun recordDownload(imageId: String): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/image/$imageId/download"), null) as? PlusApiResultVoid
    }

    /** 创建图片生成任务 */
    suspend fun createGeneration(body: ImageGenerationForm): PlusApiResultGenerationTaskVO? {
        return client.post(ApiPaths.appPath("/generation/image"), body) as? PlusApiResultGenerationTaskVO
    }

    /** 生成变体 */
    suspend fun createVariation(body: ImageVariationForm): PlusApiResultGenerationTaskVO? {
        return client.post(ApiPaths.appPath("/generation/image/variations"), body) as? PlusApiResultGenerationTaskVO
    }

    /** 图片放大 */
    suspend fun upscale(body: ImageUpscaleForm): PlusApiResultGenerationTaskVO? {
        return client.post(ApiPaths.appPath("/generation/image/upscale"), body) as? PlusApiResultGenerationTaskVO
    }

    /** 图片编辑 */
    suspend fun edit(body: ImageEditForm): PlusApiResultGenerationTaskVO? {
        return client.post(ApiPaths.appPath("/generation/image/edits"), body) as? PlusApiResultGenerationTaskVO
    }

    /** 获取图片统计 */
    suspend fun getImageStatistics(): PlusApiResultImageStatisticsVO? {
        return client.get(ApiPaths.appPath("/image/statistics")) as? PlusApiResultImageStatisticsVO
    }

    /** 搜索图片 */
    suspend fun searchImages(params: Map<String, Any>? = null): PlusApiResultPageImageVO? {
        return client.get(ApiPaths.appPath("/image/search"), params) as? PlusApiResultPageImageVO
    }

    /** 获取公开图片 */
    suspend fun getPublicImages(params: Map<String, Any>? = null): PlusApiResultPageImageVO? {
        return client.get(ApiPaths.appPath("/image/public"), params) as? PlusApiResultPageImageVO
    }

    /** 获取热门图片 */
    suspend fun getPopularImages(params: Map<String, Any>? = null): PlusApiResultPageImageVO? {
        return client.get(ApiPaths.appPath("/image/popular"), params) as? PlusApiResultPageImageVO
    }

    /** 获取最受喜爱图片 */
    suspend fun getMostLikedImages(params: Map<String, Any>? = null): PlusApiResultPageImageVO? {
        return client.get(ApiPaths.appPath("/image/liked"), params) as? PlusApiResultPageImageVO
    }

    /** 获取收藏图片 */
    suspend fun getFavoriteImages(params: Map<String, Any>? = null): PlusApiResultPageImageVO? {
        return client.get(ApiPaths.appPath("/image/favorites"), params) as? PlusApiResultPageImageVO
    }

    /** 获取任务列表 */
    suspend fun listTasks(params: Map<String, Any>? = null): PlusApiResultPageGenerationTaskVO? {
        return client.get(ApiPaths.appPath("/generation/image/tasks"), params) as? PlusApiResultPageGenerationTaskVO
    }

    /** 获取任务状态 */
    suspend fun getTaskStatus(taskId: String): PlusApiResultGenerationTaskVO? {
        return client.get(ApiPaths.appPath("/generation/image/tasks/$taskId")) as? PlusApiResultGenerationTaskVO
    }

    /** 取消任务 */
    suspend fun cancelTask(taskId: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/generation/image/tasks/$taskId")) as? PlusApiResultVoid
    }
}
