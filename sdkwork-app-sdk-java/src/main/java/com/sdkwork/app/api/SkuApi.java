package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class SkuApi {
    private final HttpClient client;
    
    public SkuApi(HttpClient client) {
        this.client = client;
    }

    /** 获取SKU详情 */
    public PlusApiResultSkuDetailVO getSkuDetail(String skuId) throws Exception {
        return (PlusApiResultSkuDetailVO) client.get(ApiPaths.appPath("/skus/" + skuId + ""));
    }

    /** 获取SKU库存 */
    public PlusApiResultSkuStockVO getSkuStock(String skuId) throws Exception {
        return (PlusApiResultSkuStockVO) client.get(ApiPaths.appPath("/skus/" + skuId + "/stock"));
    }

    /** 检查SKU库存 */
    public PlusApiResultBoolean checkSkuStock(String skuId, Map<String, Object> params) throws Exception {
        return (PlusApiResultBoolean) client.get(ApiPaths.appPath("/skus/" + skuId + "/check-stock"), params);
    }

    /** 获取产品的SKU列表 */
    public PlusApiResultPageSkuVO getSkuByProduct(String productId, Map<String, Object> params) throws Exception {
        return (PlusApiResultPageSkuVO) client.get(ApiPaths.appPath("/skus/product/" + productId + ""), params);
    }

    /** 获取产品SKU统计 */
    public PlusApiResultSkuStatisticsVO getSkuStatistics(String productId) throws Exception {
        return (PlusApiResultSkuStatisticsVO) client.get(ApiPaths.appPath("/skus/product/" + productId + "/statistics"));
    }

    /** 检查SKU编码是否存在 */
    public PlusApiResultBoolean checkSkuCodeExists(Map<String, Object> params) throws Exception {
        return (PlusApiResultBoolean) client.get(ApiPaths.appPath("/skus/exists"), params);
    }

    /** 按编码获取SKU */
    public PlusApiResultSkuVO getSkuByCode(String skuCode) throws Exception {
        return (PlusApiResultSkuVO) client.get(ApiPaths.appPath("/skus/code/" + skuCode + ""));
    }

    /** 批量获取SKU */
    public PlusApiResultListSkuVO batchGetSkus(Map<String, Object> params) throws Exception {
        return (PlusApiResultListSkuVO) client.get(ApiPaths.appPath("/skus/batch"), params);
    }
}
