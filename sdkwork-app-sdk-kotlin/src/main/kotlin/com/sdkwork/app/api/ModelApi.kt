package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class ModelApi(private val client: HttpClient) {

    /** Batch get model prices */
    suspend fun getModelPrices(body: GetModelPricesRequest): PlusApiResultListModelPriceVO? {
        return client.post(ApiPaths.appPath("/models/prices/batch"), body) as? PlusApiResultListModelPriceVO
    }

    /** Get model detail */
    suspend fun getModelById(modelId: String): PlusApiResultModelInfoDetailVO? {
        return client.get(ApiPaths.appPath("/models/$modelId")) as? PlusApiResultModelInfoDetailVO
    }

    /** Get model types */
    suspend fun getModelTypes(): PlusApiResultListModelTypeVO? {
        return client.get(ApiPaths.appPath("/models/types")) as? PlusApiResultListModelTypeVO
    }

    /** Get models by type */
    suspend fun getModelsByType(modelType: String, params: Map<String, Any>? = null): PlusApiResultPageModelInfoVO? {
        return client.get(ApiPaths.appPath("/models/type/$modelType"), params) as? PlusApiResultPageModelInfoVO
    }

    /** Get model statistics */
    suspend fun getModelStatistics(): PlusApiResultModelStatisticsVO? {
        return client.get(ApiPaths.appPath("/models/statistics")) as? PlusApiResultModelStatisticsVO
    }

    /** Search models */
    suspend fun searchModels(params: Map<String, Any>? = null): PlusApiResultPageModelInfoVO? {
        return client.get(ApiPaths.appPath("/models/search"), params) as? PlusApiResultPageModelInfoVO
    }

    /** Get model default price */
    suspend fun getModelPrice(model: String): PlusApiResultModelPriceVO? {
        return client.get(ApiPaths.appPath("/models/price/$model")) as? PlusApiResultModelPriceVO
    }

    /** Get model pricing rules */
    suspend fun getModelPriceRules(model: String, params: Map<String, Any>? = null): PlusApiResultListModelPriceVO? {
        return client.get(ApiPaths.appPath("/models/price-rules/$model"), params) as? PlusApiResultListModelPriceVO
    }

    /** Get popular models */
    suspend fun getPopularModels(params: Map<String, Any>? = null): PlusApiResultPageModelInfoVO? {
        return client.get(ApiPaths.appPath("/models/popular"), params) as? PlusApiResultPageModelInfoVO
    }

    /** Get models by family */
    suspend fun getModelsByFamily(family: String, params: Map<String, Any>? = null): PlusApiResultPageModelInfoVO? {
        return client.get(ApiPaths.appPath("/models/family/$family"), params) as? PlusApiResultPageModelInfoVO
    }

    /** Get all families */
    suspend fun getAllFamilies(): PlusApiResultListString? {
        return client.get(ApiPaths.appPath("/models/families")) as? PlusApiResultListString
    }

    /** Get models by channel */
    suspend fun getModelsByChannel(channel: String, params: Map<String, Any>? = null): PlusApiResultPageModelInfoVO? {
        return client.get(ApiPaths.appPath("/models/channel/$channel"), params) as? PlusApiResultPageModelInfoVO
    }

    /** Get model detail by alias */
    suspend fun getModelBy(model: String): PlusApiResultModelInfoDetailVO? {
        return client.get(ApiPaths.appPath("/models/by-model/$model")) as? PlusApiResultModelInfoDetailVO
    }

    /** Get active models */
    suspend fun getActiveModels(params: Map<String, Any>? = null): PlusApiResultPageModelInfoVO? {
        return client.get(ApiPaths.appPath("/models/active"), params) as? PlusApiResultPageModelInfoVO
    }
}
