package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class CategoryApi {
    private final HttpClient client;
    
    public CategoryApi(HttpClient client) {
        this.client = client;
    }

    /** 获取分类详情 */
    public PlusApiResultCategoryDetailVO getCategoryDetail(String categoryId) throws Exception {
        return (PlusApiResultCategoryDetailVO) client.get(ApiPaths.appPath("/category/" + categoryId + ""));
    }

    /** 更新分类 */
    public PlusApiResultCategoryVO updateCategory(String categoryId, CategoryUpdateForm body) throws Exception {
        return (PlusApiResultCategoryVO) client.put(ApiPaths.appPath("/category/" + categoryId + ""), body);
    }

    /** 删除分类 */
    public PlusApiResultVoid deleteCategory(String categoryId) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/category/" + categoryId + ""));
    }

    /** 更新分类状态 */
    public PlusApiResultCategoryVO updateCategoryStatus(String categoryId, Map<String, Object> params) throws Exception {
        return (PlusApiResultCategoryVO) client.put(ApiPaths.appPath("/category/" + categoryId + "/status"), null, params);
    }

    /** 移动分类 */
    public PlusApiResultCategoryVO move(String categoryId, CategoryMoveForm body) throws Exception {
        return (PlusApiResultCategoryVO) client.put(ApiPaths.appPath("/category/" + categoryId + "/move"), body);
    }

    /** 排序分类 */
    public PlusApiResultVoid sortCategories(CategorySortForm body) throws Exception {
        return (PlusApiResultVoid) client.put(ApiPaths.appPath("/category/sort"), body);
    }

    /** 获取分类列表 */
    public PlusApiResultListCategoryVO listCategories(Map<String, Object> params) throws Exception {
        return (PlusApiResultListCategoryVO) client.get(ApiPaths.appPath("/category"), params);
    }

    /** 创建分类 */
    public PlusApiResultCategoryVO createCategory(CategoryCreateForm body) throws Exception {
        return (PlusApiResultCategoryVO) client.post(ApiPaths.appPath("/category"), body);
    }

    /** 获取标签列表 */
    public PlusApiResultListTagVO listTags(Map<String, Object> params) throws Exception {
        return (PlusApiResultListTagVO) client.get(ApiPaths.appPath("/category/tags"), params);
    }

    /** 创建标签 */
    public PlusApiResultTagVO createTag(TagCreateForm body) throws Exception {
        return (PlusApiResultTagVO) client.post(ApiPaths.appPath("/category/tags"), body);
    }

    /** 获取分类路径 */
    public PlusApiResultListCategoryVO getCategoryPath(String categoryId) throws Exception {
        return (PlusApiResultListCategoryVO) client.get(ApiPaths.appPath("/category/" + categoryId + "/path"));
    }

    /** 获取子分类 */
    public PlusApiResultListCategoryVO getChildren(String categoryId) throws Exception {
        return (PlusApiResultListCategoryVO) client.get(ApiPaths.appPath("/category/" + categoryId + "/children"));
    }

    /** 获取分类类型 */
    public PlusApiResultListCategoryTypeVO getCategoryTypes() throws Exception {
        return (PlusApiResultListCategoryTypeVO) client.get(ApiPaths.appPath("/category/types"));
    }

    /** 获取分类树 */
    public PlusApiResultListCategoryTreeVO getCategoryTree(Map<String, Object> params) throws Exception {
        return (PlusApiResultListCategoryTreeVO) client.get(ApiPaths.appPath("/category/tree"), params);
    }

    /** 删除标签 */
    public PlusApiResultVoid deleteTag(String tagId) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/category/tags/" + tagId + ""));
    }
}
