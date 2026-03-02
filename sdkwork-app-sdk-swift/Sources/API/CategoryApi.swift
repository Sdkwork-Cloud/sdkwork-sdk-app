import Foundation

public class CategoryApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 获取分类详情
    public func getCategoryDetail(categoryId: String) async throws -> PlusApiResultCategoryDetailVO? {
        let response = try await client.get(ApiPaths.appPath("/category/\(categoryId)"))
        return response as? PlusApiResultCategoryDetailVO
    }

    /// 更新分类
    public func updateCategory(categoryId: String, body: CategoryUpdateForm) async throws -> PlusApiResultCategoryVO? {
        let response = try await client.put(ApiPaths.appPath("/category/\(categoryId)"), body: body)
        return response as? PlusApiResultCategoryVO
    }

    /// 删除分类
    public func deleteCategory(categoryId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/category/\(categoryId)"))
        return response as? PlusApiResultVoid
    }

    /// 更新分类状态
    public func updateCategoryStatus(categoryId: String, params: [String: Any]? = nil) async throws -> PlusApiResultCategoryVO? {
        let response = try await client.put(ApiPaths.appPath("/category/\(categoryId)/status"), body: nil, params: params)
        return response as? PlusApiResultCategoryVO
    }

    /// 移动分类
    public func move(categoryId: String, body: CategoryMoveForm) async throws -> PlusApiResultCategoryVO? {
        let response = try await client.put(ApiPaths.appPath("/category/\(categoryId)/move"), body: body)
        return response as? PlusApiResultCategoryVO
    }

    /// 排序分类
    public func sortCategories(body: CategorySortForm) async throws -> PlusApiResultVoid? {
        let response = try await client.put(ApiPaths.appPath("/category/sort"), body: body)
        return response as? PlusApiResultVoid
    }

    /// 获取分类列表
    public func listCategories(params: [String: Any]? = nil) async throws -> PlusApiResultListCategoryVO? {
        let response = try await client.get(ApiPaths.appPath("/category"), params: params)
        return response as? PlusApiResultListCategoryVO
    }

    /// 创建分类
    public func createCategory(body: CategoryCreateForm) async throws -> PlusApiResultCategoryVO? {
        let response = try await client.post(ApiPaths.appPath("/category"), body: body)
        return response as? PlusApiResultCategoryVO
    }

    /// 获取标签列表
    public func listTags(params: [String: Any]? = nil) async throws -> PlusApiResultListTagVO? {
        let response = try await client.get(ApiPaths.appPath("/category/tags"), params: params)
        return response as? PlusApiResultListTagVO
    }

    /// 创建标签
    public func createTag(body: TagCreateForm) async throws -> PlusApiResultTagVO? {
        let response = try await client.post(ApiPaths.appPath("/category/tags"), body: body)
        return response as? PlusApiResultTagVO
    }

    /// 获取分类路径
    public func getCategoryPath(categoryId: String) async throws -> PlusApiResultListCategoryVO? {
        let response = try await client.get(ApiPaths.appPath("/category/\(categoryId)/path"))
        return response as? PlusApiResultListCategoryVO
    }

    /// 获取子分类
    public func getChildren(categoryId: String) async throws -> PlusApiResultListCategoryVO? {
        let response = try await client.get(ApiPaths.appPath("/category/\(categoryId)/children"))
        return response as? PlusApiResultListCategoryVO
    }

    /// 获取分类类型
    public func getCategoryTypes() async throws -> PlusApiResultListCategoryTypeVO? {
        let response = try await client.get(ApiPaths.appPath("/category/types"))
        return response as? PlusApiResultListCategoryTypeVO
    }

    /// 获取分类树
    public func getCategoryTree(params: [String: Any]? = nil) async throws -> PlusApiResultListCategoryTreeVO? {
        let response = try await client.get(ApiPaths.appPath("/category/tree"), params: params)
        return response as? PlusApiResultListCategoryTreeVO
    }

    /// 删除标签
    public func deleteTag(tagId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/category/tags/\(tagId)"))
        return response as? PlusApiResultVoid
    }
}
