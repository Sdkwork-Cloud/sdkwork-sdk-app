package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class ModelApi {
    private final HttpClient client;
    
    public ModelApi(HttpClient client) {
        this.client = client;
    }

    /** Batch get model prices */
    public PlusApiResultListModelPriceVO getModelPrices(GetModelPricesRequest body) throws Exception {
        return (PlusApiResultListModelPriceVO) client.post(ApiPaths.appPath("/models/prices/batch"), body);
    }

    /** Get model detail */
    public PlusApiResultModelInfoDetailVO getModelById(String modelId) throws Exception {
        return (PlusApiResultModelInfoDetailVO) client.get(ApiPaths.appPath("/models/" + modelId + ""));
    }

    /** Get model types */
    public PlusApiResultListModelTypeVO getModelTypes() throws Exception {
        return (PlusApiResultListModelTypeVO) client.get(ApiPaths.appPath("/models/types"));
    }

    /** Get models by type */
    public PlusApiResultPageModelInfoVO getModelsByType(String modelType, Map<String, Object> params) throws Exception {
        return (PlusApiResultPageModelInfoVO) client.get(ApiPaths.appPath("/models/type/" + modelType + ""), params);
    }

    /** Get model statistics */
    public PlusApiResultModelStatisticsVO getModelStatistics() throws Exception {
        return (PlusApiResultModelStatisticsVO) client.get(ApiPaths.appPath("/models/statistics"));
    }

    /** Search models */
    public PlusApiResultPageModelInfoVO searchModels(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageModelInfoVO) client.get(ApiPaths.appPath("/models/search"), params);
    }

    /** Get model default price */
    public PlusApiResultModelPriceVO getModelPrice(String model) throws Exception {
        return (PlusApiResultModelPriceVO) client.get(ApiPaths.appPath("/models/price/" + model + ""));
    }

    /** Get model pricing rules */
    public PlusApiResultListModelPriceVO getModelPriceRules(String model, Map<String, Object> params) throws Exception {
        return (PlusApiResultListModelPriceVO) client.get(ApiPaths.appPath("/models/price-rules/" + model + ""), params);
    }

    /** Get popular models */
    public PlusApiResultPageModelInfoVO getPopularModels(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageModelInfoVO) client.get(ApiPaths.appPath("/models/popular"), params);
    }

    /** Get models by family */
    public PlusApiResultPageModelInfoVO getModelsByFamily(String family, Map<String, Object> params) throws Exception {
        return (PlusApiResultPageModelInfoVO) client.get(ApiPaths.appPath("/models/family/" + family + ""), params);
    }

    /** Get all families */
    public PlusApiResultListString getAllFamilies() throws Exception {
        return (PlusApiResultListString) client.get(ApiPaths.appPath("/models/families"));
    }

    /** Get models by channel */
    public PlusApiResultPageModelInfoVO getModelsByChannel(String channel, Map<String, Object> params) throws Exception {
        return (PlusApiResultPageModelInfoVO) client.get(ApiPaths.appPath("/models/channel/" + channel + ""), params);
    }

    /** Get model detail by alias */
    public PlusApiResultModelInfoDetailVO getModelBy(String model) throws Exception {
        return (PlusApiResultModelInfoDetailVO) client.get(ApiPaths.appPath("/models/by-model/" + model + ""));
    }

    /** Get active models */
    public PlusApiResultPageModelInfoVO getActiveModels(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageModelInfoVO) client.get(ApiPaths.appPath("/models/active"), params);
    }
}
