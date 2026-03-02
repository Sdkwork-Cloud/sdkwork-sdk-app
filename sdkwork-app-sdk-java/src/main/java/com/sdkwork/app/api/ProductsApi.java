package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class ProductsApi {
    private final HttpClient client;
    
    public ProductsApi(HttpClient client) {
        this.client = client;
    }

    /** 获取商品列表 */
    public PlusApiResultPageProductVO getProducts(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageProductVO) client.get(ApiPaths.appPath("/products"), params);
    }

    /** 获取商品详情 */
    public PlusApiResultProductDetailVO getProductDetail(String productId) throws Exception {
        return (PlusApiResultProductDetailVO) client.get(ApiPaths.appPath("/products/" + productId + ""));
    }

    /** 获取商品库存 */
    public PlusApiResultInteger getProductStock(String productId) throws Exception {
        return (PlusApiResultInteger) client.get(ApiPaths.appPath("/products/" + productId + "/stock"));
    }

    /** 获取商品统计 */
    public PlusApiResultProductStatisticsVO getProductStatistics(String productId) throws Exception {
        return (PlusApiResultProductStatisticsVO) client.get(ApiPaths.appPath("/products/" + productId + "/statistics"));
    }

    /** 获取商品SKU列表 */
    public PlusApiResultListSkuVO getProductSkus(String productId, Map<String, Object> params) throws Exception {
        return (PlusApiResultListSkuVO) client.get(ApiPaths.appPath("/products/" + productId + "/skus"), params);
    }

    /** 检查商品库存 */
    public PlusApiResultBoolean checkProductStock(String productId, Map<String, Object> params) throws Exception {
        return (PlusApiResultBoolean) client.get(ApiPaths.appPath("/products/" + productId + "/check-stock"), params);
    }

    /** 搜索商品 */
    public PlusApiResultPageProductVO search(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageProductVO) client.get(ApiPaths.appPath("/products/search"), params);
    }

    /** 获取最新商品 */
    public PlusApiResultListProductVO getLatest(Map<String, Object> params) throws Exception {
        return (PlusApiResultListProductVO) client.get(ApiPaths.appPath("/products/latest"), params);
    }

    /** 获取热门商品 */
    public PlusApiResultListProductVO getHot(Map<String, Object> params) throws Exception {
        return (PlusApiResultListProductVO) client.get(ApiPaths.appPath("/products/hot"), params);
    }

    /** 按编码获取商品 */
    public PlusApiResultProductVO getProductByCode(String code) throws Exception {
        return (PlusApiResultProductVO) client.get(ApiPaths.appPath("/products/code/" + code + ""));
    }

    /** 按分类获取商品 */
    public PlusApiResultPageProductVO getProductsByCategory(String categoryId, Map<String, Object> params) throws Exception {
        return (PlusApiResultPageProductVO) client.get(ApiPaths.appPath("/products/category/" + categoryId + ""), params);
    }
}
