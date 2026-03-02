package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class CategoryApi(private val client: HttpClient) {

    /** 获取分类详情 */
    suspend fun getCategoryDetail(categoryId: String): PlusApiResultCategoryDetailVO? {
        return client.get(ApiPaths.appPath("/category/$categoryId")) as? PlusApiResultCategoryDetailVO
    }

    /** 更新分类 */
    suspend fun updateCategory(categoryId: String, body: CategoryUpdateForm): PlusApiResultCategoryVO? {
        return client.put(ApiPaths.appPath("/category/$categoryId"), body) as? PlusApiResultCategoryVO
    }

    /** 删除分类 */
    suspend fun deleteCategory(categoryId: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/category/$categoryId")) as? PlusApiResultVoid
    }

    /** 更新分类状态 */
    suspend fun updateCategoryStatus(categoryId: String, params: Map<String, Any>? = null): PlusApiResultCategoryVO? {
        return client.put(ApiPaths.appPath("/category/$categoryId/status"), null, params) as? PlusApiResultCategoryVO
    }

    /** 移动分类 */
    suspend fun move(categoryId: String, body: CategoryMoveForm): PlusApiResultCategoryVO? {
        return client.put(ApiPaths.appPath("/category/$categoryId/move"), body) as? PlusApiResultCategoryVO
    }

    /** 排序分类 */
    suspend fun sortCategories(body: CategorySortForm): PlusApiResultVoid? {
        return client.put(ApiPaths.appPath("/category/sort"), body) as? PlusApiResultVoid
    }

    /** 获取分类列表 */
    suspend fun listCategories(params: Map<String, Any>? = null): PlusApiResultListCategoryVO? {
        return client.get(ApiPaths.appPath("/category"), params) as? PlusApiResultListCategoryVO
    }

    /** 创建分类 */
    suspend fun createCategory(body: CategoryCreateForm): PlusApiResultCategoryVO? {
        return client.post(ApiPaths.appPath("/category"), body) as? PlusApiResultCategoryVO
    }

    /** 获取标签列表 */
    suspend fun listTags(params: Map<String, Any>? = null): PlusApiResultListTagVO? {
        return client.get(ApiPaths.appPath("/category/tags"), params) as? PlusApiResultListTagVO
    }

    /** 创建标签 */
    suspend fun createTag(body: TagCreateForm): PlusApiResultTagVO? {
        return client.post(ApiPaths.appPath("/category/tags"), body) as? PlusApiResultTagVO
    }

    /** 获取分类路径 */
    suspend fun getCategoryPath(categoryId: String): PlusApiResultListCategoryVO? {
        return client.get(ApiPaths.appPath("/category/$categoryId/path")) as? PlusApiResultListCategoryVO
    }

    /** 获取子分类 */
    suspend fun getChildren(categoryId: String): PlusApiResultListCategoryVO? {
        return client.get(ApiPaths.appPath("/category/$categoryId/children")) as? PlusApiResultListCategoryVO
    }

    /** 获取分类类型 */
    suspend fun getCategoryTypes(): PlusApiResultListCategoryTypeVO? {
        return client.get(ApiPaths.appPath("/category/types")) as? PlusApiResultListCategoryTypeVO
    }

    /** 获取分类树 */
    suspend fun getCategoryTree(params: Map<String, Any>? = null): PlusApiResultListCategoryTreeVO? {
        return client.get(ApiPaths.appPath("/category/tree"), params) as? PlusApiResultListCategoryTreeVO
    }

    /** 删除标签 */
    suspend fun deleteTag(tagId: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/category/tags/$tagId")) as? PlusApiResultVoid
    }
}
