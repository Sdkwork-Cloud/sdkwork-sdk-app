import Foundation

public class ProductsApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 更新商品属性
    public func updateProductAttribute(productId: String, attributeId: String, body: ProductAttributeUpdateRequest) async throws -> PlusApiResultProductAttributeVO? {
        let response = try await client.put(ApiPaths.appPath("/products/\(productId)/attributes/\(attributeId)"), body: body)
        return response as? PlusApiResultProductAttributeVO
    }

    /// 删除商品属性
    public func deleteProductAttribute(productId: String, attributeId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/products/\(productId)/attributes/\(attributeId)"))
        return response as? PlusApiResultVoid
    }

    /// 更新商品分类
    public func updateProductCategory(categoryId: String, body: ProductCategoryUpdateRequest) async throws -> PlusApiResultProductCategoryVO? {
        let response = try await client.put(ApiPaths.appPath("/products/categories/\(categoryId)"), body: body)
        return response as? PlusApiResultProductCategoryVO
    }

    /// 删除商品分类
    public func deleteProductCategory(categoryId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/products/categories/\(categoryId)"))
        return response as? PlusApiResultVoid
    }

    /// 获取商品属性
    public func listProductAttributes(productId: String) async throws -> PlusApiResultListProductAttributeVO? {
        let response = try await client.get(ApiPaths.appPath("/products/\(productId)/attributes"))
        return response as? PlusApiResultListProductAttributeVO
    }

    /// 创建商品属性
    public func createProductAttribute(productId: String, body: ProductAttributeCreateRequest) async throws -> PlusApiResultProductAttributeVO? {
        let response = try await client.post(ApiPaths.appPath("/products/\(productId)/attributes"), body: body)
        return response as? PlusApiResultProductAttributeVO
    }

    /// 获取商品分类列表
    public func listProductCategories(params: [String: Any]? = nil) async throws -> PlusApiResultListProductCategoryVO? {
        let response = try await client.get(ApiPaths.appPath("/products/categories"), params: params)
        return response as? PlusApiResultListProductCategoryVO
    }

    /// 创建商品分类
    public func createProductCategory(body: ProductCategoryCreateRequest) async throws -> PlusApiResultProductCategoryVO? {
        let response = try await client.post(ApiPaths.appPath("/products/categories"), body: body)
        return response as? PlusApiResultProductCategoryVO
    }

    /// 获取商品列表
    public func getProducts(params: [String: Any]? = nil) async throws -> PlusApiResultPageProductVO? {
        let response = try await client.get(ApiPaths.appPath("/products"), params: params)
        return response as? PlusApiResultPageProductVO
    }

    /// 获取商品详情
    public func getProductDetail(productId: String) async throws -> PlusApiResultProductDetailVO? {
        let response = try await client.get(ApiPaths.appPath("/products/\(productId)"))
        return response as? PlusApiResultProductDetailVO
    }

    /// 获取商品库存
    public func getProductStock(productId: String) async throws -> PlusApiResultInteger? {
        let response = try await client.get(ApiPaths.appPath("/products/\(productId)/stock"))
        return response as? PlusApiResultInteger
    }

    /// 获取商品统计
    public func getProductStatistics(productId: String) async throws -> PlusApiResultProductStatisticsVO? {
        let response = try await client.get(ApiPaths.appPath("/products/\(productId)/statistics"))
        return response as? PlusApiResultProductStatisticsVO
    }

    /// 获取SPU详情
    public func getSpuDetail(productId: String) async throws -> PlusApiResultProductDetailVO? {
        let response = try await client.get(ApiPaths.appPath("/products/\(productId)/spu"))
        return response as? PlusApiResultProductDetailVO
    }

    /// 获取商品SKU列表
    public func getProductSkus(productId: String, params: [String: Any]? = nil) async throws -> PlusApiResultListSkuVO? {
        let response = try await client.get(ApiPaths.appPath("/products/\(productId)/skus"), params: params)
        return response as? PlusApiResultListSkuVO
    }

    /// 检查商品库存
    public func checkProductStock(productId: String, params: [String: Any]? = nil) async throws -> PlusApiResultBoolean? {
        let response = try await client.get(ApiPaths.appPath("/products/\(productId)/check-stock"), params: params)
        return response as? PlusApiResultBoolean
    }

    /// 搜索商品
    public func search(params: [String: Any]? = nil) async throws -> PlusApiResultPageProductVO? {
        let response = try await client.get(ApiPaths.appPath("/products/search"), params: params)
        return response as? PlusApiResultPageProductVO
    }

    /// 获取最新商品
    public func getLatest(params: [String: Any]? = nil) async throws -> PlusApiResultListProductVO? {
        let response = try await client.get(ApiPaths.appPath("/products/latest"), params: params)
        return response as? PlusApiResultListProductVO
    }

    /// 获取热门商品
    public func getHot(params: [String: Any]? = nil) async throws -> PlusApiResultListProductVO? {
        let response = try await client.get(ApiPaths.appPath("/products/hot"), params: params)
        return response as? PlusApiResultListProductVO
    }

    /// 按编码获取商品
    public func getProductByCode(code: String) async throws -> PlusApiResultProductVO? {
        let response = try await client.get(ApiPaths.appPath("/products/code/\(code)"))
        return response as? PlusApiResultProductVO
    }

    /// 按分类获取商品
    public func getProductsByCategory(categoryId: String, params: [String: Any]? = nil) async throws -> PlusApiResultPageProductVO? {
        let response = try await client.get(ApiPaths.appPath("/products/category/\(categoryId)"), params: params)
        return response as? PlusApiResultPageProductVO
    }

    /// 获取分类属性
    public func listCategoryAttributes(categoryId: String) async throws -> PlusApiResultListProductAttributeVO? {
        let response = try await client.get(ApiPaths.appPath("/products/categories/\(categoryId)/attributes"))
        return response as? PlusApiResultListProductAttributeVO
    }

    /// 获取商品分类树
    public func getProductCategoryTree() async throws -> PlusApiResultListProductCategoryVO? {
        let response = try await client.get(ApiPaths.appPath("/products/categories/tree"))
        return response as? PlusApiResultListProductCategoryVO
    }
}
