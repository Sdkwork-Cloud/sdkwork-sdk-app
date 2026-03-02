package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class ModelsApi(private val client: HttpClient) {

    /** 批量获取模型价格 */
    suspend fun getModelPrices(body: GetModelPricesRequest): PlusApiResultListModelPriceVO? {
        return client.post(ApiPaths.appPath("/models/prices/batch"), body) as? PlusApiResultListModelPriceVO
    }

    /** 获取模型详情 */
    suspend fun getModelById(modelId: String): PlusApiResultModelInfoDetailVO? {
        return client.get(ApiPaths.appPath("/models/$modelId")) as? PlusApiResultModelInfoDetailVO
    }

    /** 获取模型类型列表 */
    suspend fun getModelTypes(): PlusApiResultListModelTypeVO? {
        return client.get(ApiPaths.appPath("/models/types")) as? PlusApiResultListModelTypeVO
    }

    /** 获取类型模型列表 */
    suspend fun getModelsByType(modelType: String, params: Map<String, Any>? = null): PlusApiResultPageModelInfoVO? {
        return client.get(ApiPaths.appPath("/models/type/$modelType"), params) as? PlusApiResultPageModelInfoVO
    }

    /** 获取模型统计 */
    suspend fun getModelStatistics(): PlusApiResultModelStatisticsVO? {
        return client.get(ApiPaths.appPath("/models/statistics")) as? PlusApiResultModelStatisticsVO
    }

    /** 搜索模型 */
    suspend fun search(params: Map<String, Any>? = null): PlusApiResultPageModelInfoVO? {
        return client.get(ApiPaths.appPath("/models/search"), params) as? PlusApiResultPageModelInfoVO
    }

    /** 获取模型价格 */
    suspend fun getModelPrice(model: String): PlusApiResultModelPriceVO? {
        return client.get(ApiPaths.appPath("/models/price/$model")) as? PlusApiResultModelPriceVO
    }

    /** 获取热门模型 */
    suspend fun getPopular(params: Map<String, Any>? = null): PlusApiResultPageModelInfoVO? {
        return client.get(ApiPaths.appPath("/models/popular"), params) as? PlusApiResultPageModelInfoVO
    }

    /** 获取系列模型列表 */
    suspend fun getModelsByFamily(family: String, params: Map<String, Any>? = null): PlusApiResultPageModelInfoVO? {
        return client.get(ApiPaths.appPath("/models/family/$family"), params) as? PlusApiResultPageModelInfoVO
    }

    /** 获取所有模型系列 */
    suspend fun getAllFamilies(): PlusApiResultListString? {
        return client.get(ApiPaths.appPath("/models/families")) as? PlusApiResultListString
    }

    /** 获取渠道模型列表 */
    suspend fun getModelsByChannel(channel: String, params: Map<String, Any>? = null): PlusApiResultPageModelInfoVO? {
        return client.get(ApiPaths.appPath("/models/channel/$channel"), params) as? PlusApiResultPageModelInfoVO
    }

    /** 根据模型标识获取详情 */
    suspend fun getModelBy(model: String): PlusApiResultModelInfoDetailVO? {
        return client.get(ApiPaths.appPath("/models/by-model/$model")) as? PlusApiResultModelInfoDetailVO
    }

    /** 获取活跃模型列表 */
    suspend fun getActive(params: Map<String, Any>? = null): PlusApiResultPageModelInfoVO? {
        return client.get(ApiPaths.appPath("/models/active"), params) as? PlusApiResultPageModelInfoVO
    }
}
