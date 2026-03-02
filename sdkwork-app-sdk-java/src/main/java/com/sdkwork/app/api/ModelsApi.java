package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class ModelsApi {
    private final HttpClient client;
    
    public ModelsApi(HttpClient client) {
        this.client = client;
    }

    /** 批量获取模型价格 */
    public PlusApiResultListModelPriceVO getModelPrices(GetModelPricesRequest body) throws Exception {
        return (PlusApiResultListModelPriceVO) client.post(ApiPaths.appPath("/models/prices/batch"), body);
    }

    /** 获取模型详情 */
    public PlusApiResultModelInfoDetailVO getModelById(String modelId) throws Exception {
        return (PlusApiResultModelInfoDetailVO) client.get(ApiPaths.appPath("/models/" + modelId + ""));
    }

    /** 获取模型类型列表 */
    public PlusApiResultListModelTypeVO getModelTypes() throws Exception {
        return (PlusApiResultListModelTypeVO) client.get(ApiPaths.appPath("/models/types"));
    }

    /** 获取类型模型列表 */
    public PlusApiResultPageModelInfoVO getModelsByType(String modelType, Map<String, Object> params) throws Exception {
        return (PlusApiResultPageModelInfoVO) client.get(ApiPaths.appPath("/models/type/" + modelType + ""), params);
    }

    /** 获取模型统计 */
    public PlusApiResultModelStatisticsVO getModelStatistics() throws Exception {
        return (PlusApiResultModelStatisticsVO) client.get(ApiPaths.appPath("/models/statistics"));
    }

    /** 搜索模型 */
    public PlusApiResultPageModelInfoVO search(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageModelInfoVO) client.get(ApiPaths.appPath("/models/search"), params);
    }

    /** 获取模型价格 */
    public PlusApiResultModelPriceVO getModelPrice(String model) throws Exception {
        return (PlusApiResultModelPriceVO) client.get(ApiPaths.appPath("/models/price/" + model + ""));
    }

    /** 获取热门模型 */
    public PlusApiResultPageModelInfoVO getPopular(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageModelInfoVO) client.get(ApiPaths.appPath("/models/popular"), params);
    }

    /** 获取系列模型列表 */
    public PlusApiResultPageModelInfoVO getModelsByFamily(String family, Map<String, Object> params) throws Exception {
        return (PlusApiResultPageModelInfoVO) client.get(ApiPaths.appPath("/models/family/" + family + ""), params);
    }

    /** 获取所有模型系列 */
    public PlusApiResultListString getAllFamilies() throws Exception {
        return (PlusApiResultListString) client.get(ApiPaths.appPath("/models/families"));
    }

    /** 获取渠道模型列表 */
    public PlusApiResultPageModelInfoVO getModelsByChannel(String channel, Map<String, Object> params) throws Exception {
        return (PlusApiResultPageModelInfoVO) client.get(ApiPaths.appPath("/models/channel/" + channel + ""), params);
    }

    /** 根据模型标识获取详情 */
    public PlusApiResultModelInfoDetailVO getModelBy(String model) throws Exception {
        return (PlusApiResultModelInfoDetailVO) client.get(ApiPaths.appPath("/models/by-model/" + model + ""));
    }

    /** 获取活跃模型列表 */
    public PlusApiResultPageModelInfoVO getActive(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageModelInfoVO) client.get(ApiPaths.appPath("/models/active"), params);
    }
}
