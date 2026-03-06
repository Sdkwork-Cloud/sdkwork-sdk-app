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

    /** 更新商品属性 */
    public PlusApiResultProductAttributeVO updateProductAttribute(String productId, String attributeId, ProductAttributeUpdateRequest body) throws Exception {
        return (PlusApiResultProductAttributeVO) client.put(ApiPaths.appPath("/products/" + productId + "/attributes/" + attributeId + ""), body);
    }

    /** 删除商品属性 */
    public PlusApiResultVoid deleteProductAttribute(String productId, String attributeId) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/products/" + productId + "/attributes/" + attributeId + ""));
    }

    /** 更新商品分类 */
    public PlusApiResultProductCategoryVO updateProductCategory(String categoryId, ProductCategoryUpdateRequest body) throws Exception {
        return (PlusApiResultProductCategoryVO) client.put(ApiPaths.appPath("/products/categories/" + categoryId + ""), body);
    }

    /** 删除商品分类 */
    public PlusApiResultVoid deleteProductCategory(String categoryId) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/products/categories/" + categoryId + ""));
    }

    /** 获取商品属性 */
    public PlusApiResultListProductAttributeVO listProductAttributes(String productId) throws Exception {
        return (PlusApiResultListProductAttributeVO) client.get(ApiPaths.appPath("/products/" + productId + "/attributes"));
    }

    /** 创建商品属性 */
    public PlusApiResultProductAttributeVO createProductAttribute(String productId, ProductAttributeCreateRequest body) throws Exception {
        return (PlusApiResultProductAttributeVO) client.post(ApiPaths.appPath("/products/" + productId + "/attributes"), body);
    }

    /** 获取商品分类列表 */
    public PlusApiResultListProductCategoryVO listProductCategories(Map<String, Object> params) throws Exception {
        return (PlusApiResultListProductCategoryVO) client.get(ApiPaths.appPath("/products/categories"), params);
    }

    /** 创建商品分类 */
    public PlusApiResultProductCategoryVO createProductCategory(ProductCategoryCreateRequest body) throws Exception {
        return (PlusApiResultProductCategoryVO) client.post(ApiPaths.appPath("/products/categories"), body);
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

    /** 获取SPU详情 */
    public PlusApiResultProductDetailVO getSpuDetail(String productId) throws Exception {
        return (PlusApiResultProductDetailVO) client.get(ApiPaths.appPath("/products/" + productId + "/spu"));
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

    /** 获取分类属性 */
    public PlusApiResultListProductAttributeVO listCategoryAttributes(String categoryId) throws Exception {
        return (PlusApiResultListProductAttributeVO) client.get(ApiPaths.appPath("/products/categories/" + categoryId + "/attributes"));
    }

    /** 获取商品分类树 */
    public PlusApiResultListProductCategoryVO getProductCategoryTree() throws Exception {
        return (PlusApiResultListProductCategoryVO) client.get(ApiPaths.appPath("/products/categories/tree"));
    }
}
