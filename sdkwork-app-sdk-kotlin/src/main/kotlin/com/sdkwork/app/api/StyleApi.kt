package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class StyleApi(private val client: HttpClient) {

    /** 获取风格详情 */
    suspend fun getStyle(styleId: String): PlusApiResultGenerationStyleDetailVO? {
        return client.get(ApiPaths.appPath("/generation/style/$styleId")) as? PlusApiResultGenerationStyleDetailVO
    }

    /** 更新风格 */
    suspend fun updateStyle(styleId: String, body: GenerationStyleUpdateForm): PlusApiResultGenerationStyleVO? {
        return client.put(ApiPaths.appPath("/generation/style/$styleId"), body) as? PlusApiResultGenerationStyleVO
    }

    /** 删除风格 */
    suspend fun deleteStyle(styleId: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/generation/style/$styleId")) as? PlusApiResultVoid
    }

    /** 创建风格 */
    suspend fun createStyle(body: GenerationStyleCreateForm): PlusApiResultGenerationStyleVO? {
        return client.post(ApiPaths.appPath("/generation/style"), body) as? PlusApiResultGenerationStyleVO
    }

    /** 发布风格 */
    suspend fun publish(styleId: String): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/generation/style/$styleId/publish"), null) as? PlusApiResultVoid
    }

    /** 取消发布 */
    suspend fun unpublish(styleId: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/generation/style/$styleId/publish")) as? PlusApiResultVoid
    }

    /** 停用风格 */
    suspend fun deactivate(styleId: String): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/generation/style/$styleId/deactivate"), null) as? PlusApiResultVoid
    }

    /** 激活风格 */
    suspend fun activate(styleId: String): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/generation/style/$styleId/activate"), null) as? PlusApiResultVoid
    }

    /** 获取风格类型列表 */
    suspend fun getStyleTypes(): PlusApiResultListStyleTypeVO? {
        return client.get(ApiPaths.appPath("/generation/style/types")) as? PlusApiResultListStyleTypeVO
    }

    /** 获取风格统计 */
    suspend fun getStyleStatistics(): PlusApiResultStyleStatisticsVO? {
        return client.get(ApiPaths.appPath("/generation/style/statistics")) as? PlusApiResultStyleStatisticsVO
    }

    /** 搜索风格 */
    suspend fun searchStyles(params: Map<String, Any>? = null): PlusApiResultPageGenerationStyleVO? {
        return client.get(ApiPaths.appPath("/generation/style/search"), params) as? PlusApiResultPageGenerationStyleVO
    }

    /** 获取公开风格 */
    suspend fun getPublicStyles(params: Map<String, Any>? = null): PlusApiResultPageGenerationStyleVO? {
        return client.get(ApiPaths.appPath("/generation/style/public"), params) as? PlusApiResultPageGenerationStyleVO
    }

    /** 获取热门风格 */
    suspend fun getPopularStyles(params: Map<String, Any>? = null): PlusApiResultPageGenerationStyleVO? {
        return client.get(ApiPaths.appPath("/generation/style/popular"), params) as? PlusApiResultPageGenerationStyleVO
    }

    /** 获取我的风格 */
    suspend fun getMyStyles(params: Map<String, Any>? = null): PlusApiResultPageGenerationStyleVO? {
        return client.get(ApiPaths.appPath("/generation/style/my"), params) as? PlusApiResultPageGenerationStyleVO
    }
}
