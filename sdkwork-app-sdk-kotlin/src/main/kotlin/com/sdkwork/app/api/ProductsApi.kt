package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class ProductsApi(private val client: HttpClient) {

    /** 更新商品属性 */
    suspend fun updateProductAttribute(productId: String, attributeId: String, body: ProductAttributeUpdateRequest): PlusApiResultProductAttributeVO? {
        return client.put(ApiPaths.appPath("/products/$productId/attributes/$attributeId"), body) as? PlusApiResultProductAttributeVO
    }

    /** 删除商品属性 */
    suspend fun deleteProductAttribute(productId: String, attributeId: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/products/$productId/attributes/$attributeId")) as? PlusApiResultVoid
    }

    /** 更新商品分类 */
    suspend fun updateProductCategory(categoryId: String, body: ProductCategoryUpdateRequest): PlusApiResultProductCategoryVO? {
        return client.put(ApiPaths.appPath("/products/categories/$categoryId"), body) as? PlusApiResultProductCategoryVO
    }

    /** 删除商品分类 */
    suspend fun deleteProductCategory(categoryId: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/products/categories/$categoryId")) as? PlusApiResultVoid
    }

    /** 获取商品属性 */
    suspend fun listProductAttributes(productId: String): PlusApiResultListProductAttributeVO? {
        return client.get(ApiPaths.appPath("/products/$productId/attributes")) as? PlusApiResultListProductAttributeVO
    }

    /** 创建商品属性 */
    suspend fun createProductAttribute(productId: String, body: ProductAttributeCreateRequest): PlusApiResultProductAttributeVO? {
        return client.post(ApiPaths.appPath("/products/$productId/attributes"), body) as? PlusApiResultProductAttributeVO
    }

    /** 获取商品分类列表 */
    suspend fun listProductCategories(params: Map<String, Any>? = null): PlusApiResultListProductCategoryVO? {
        return client.get(ApiPaths.appPath("/products/categories"), params) as? PlusApiResultListProductCategoryVO
    }

    /** 创建商品分类 */
    suspend fun createProductCategory(body: ProductCategoryCreateRequest): PlusApiResultProductCategoryVO? {
        return client.post(ApiPaths.appPath("/products/categories"), body) as? PlusApiResultProductCategoryVO
    }

    /** 获取商品列表 */
    suspend fun getProducts(params: Map<String, Any>? = null): PlusApiResultPageProductVO? {
        return client.get(ApiPaths.appPath("/products"), params) as? PlusApiResultPageProductVO
    }

    /** 获取商品详情 */
    suspend fun getProductDetail(productId: String): PlusApiResultProductDetailVO? {
        return client.get(ApiPaths.appPath("/products/$productId")) as? PlusApiResultProductDetailVO
    }

    /** 获取商品库存 */
    suspend fun getProductStock(productId: String): PlusApiResultInteger? {
        return client.get(ApiPaths.appPath("/products/$productId/stock")) as? PlusApiResultInteger
    }

    /** 获取商品统计 */
    suspend fun getProductStatistics(productId: String): PlusApiResultProductStatisticsVO? {
        return client.get(ApiPaths.appPath("/products/$productId/statistics")) as? PlusApiResultProductStatisticsVO
    }

    /** 获取SPU详情 */
    suspend fun getSpuDetail(productId: String): PlusApiResultProductDetailVO? {
        return client.get(ApiPaths.appPath("/products/$productId/spu")) as? PlusApiResultProductDetailVO
    }

    /** 获取商品SKU列表 */
    suspend fun getProductSkus(productId: String, params: Map<String, Any>? = null): PlusApiResultListSkuVO? {
        return client.get(ApiPaths.appPath("/products/$productId/skus"), params) as? PlusApiResultListSkuVO
    }

    /** 检查商品库存 */
    suspend fun checkProductStock(productId: String, params: Map<String, Any>? = null): PlusApiResultBoolean? {
        return client.get(ApiPaths.appPath("/products/$productId/check-stock"), params) as? PlusApiResultBoolean
    }

    /** 搜索商品 */
    suspend fun search(params: Map<String, Any>? = null): PlusApiResultPageProductVO? {
        return client.get(ApiPaths.appPath("/products/search"), params) as? PlusApiResultPageProductVO
    }

    /** 获取最新商品 */
    suspend fun getLatest(params: Map<String, Any>? = null): PlusApiResultListProductVO? {
        return client.get(ApiPaths.appPath("/products/latest"), params) as? PlusApiResultListProductVO
    }

    /** 获取热门商品 */
    suspend fun getHot(params: Map<String, Any>? = null): PlusApiResultListProductVO? {
        return client.get(ApiPaths.appPath("/products/hot"), params) as? PlusApiResultListProductVO
    }

    /** 按编码获取商品 */
    suspend fun getProductByCode(code: String): PlusApiResultProductVO? {
        return client.get(ApiPaths.appPath("/products/code/$code")) as? PlusApiResultProductVO
    }

    /** 按分类获取商品 */
    suspend fun getProductsByCategory(categoryId: String, params: Map<String, Any>? = null): PlusApiResultPageProductVO? {
        return client.get(ApiPaths.appPath("/products/category/$categoryId"), params) as? PlusApiResultPageProductVO
    }

    /** 获取分类属性 */
    suspend fun listCategoryAttributes(categoryId: String): PlusApiResultListProductAttributeVO? {
        return client.get(ApiPaths.appPath("/products/categories/$categoryId/attributes")) as? PlusApiResultListProductAttributeVO
    }

    /** 获取商品分类树 */
    suspend fun getProductCategoryTree(): PlusApiResultListProductCategoryVO? {
        return client.get(ApiPaths.appPath("/products/categories/tree")) as? PlusApiResultListProductCategoryVO
    }
}
