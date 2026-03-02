from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import CategoryCreateForm, CategoryMoveForm, CategorySortForm, CategoryUpdateForm, PlusApiResultCategoryDetailVO, PlusApiResultCategoryVO, PlusApiResultListCategoryTreeVO, PlusApiResultListCategoryTypeVO, PlusApiResultListCategoryVO, PlusApiResultListTagVO, PlusApiResultTagVO, PlusApiResultVoid, TagCreateForm

class CategoryApi:
    """category API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def get_category_detail(self, categoryId: str) -> PlusApiResultCategoryDetailVO:
        """获取分类详情"""
        return self._client.get(f"/app/v3/api/category/{categoryId}")

    def update_category(self, categoryId: str, body: CategoryUpdateForm) -> PlusApiResultCategoryVO:
        """更新分类"""
        return self._client.put(f"/app/v3/api/category/{categoryId}", json=body)

    def delete_category(self, categoryId: str) -> PlusApiResultVoid:
        """删除分类"""
        return self._client.delete(f"/app/v3/api/category/{categoryId}")

    def update_category_status(self, categoryId: str, params: Optional[Dict[str, Any]] = None) -> PlusApiResultCategoryVO:
        """更新分类状态"""
        return self._client.put(f"/app/v3/api/category/{categoryId}/status", params=params)

    def move(self, categoryId: str, body: CategoryMoveForm) -> PlusApiResultCategoryVO:
        """移动分类"""
        return self._client.put(f"/app/v3/api/category/{categoryId}/move", json=body)

    def sort_categories(self, body: CategorySortForm) -> PlusApiResultVoid:
        """排序分类"""
        return self._client.put(f"/app/v3/api/category/sort", json=body)

    def list_categories(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultListCategoryVO:
        """获取分类列表"""
        return self._client.get(f"/app/v3/api/category", params=params)

    def create_category(self, body: CategoryCreateForm) -> PlusApiResultCategoryVO:
        """创建分类"""
        return self._client.post(f"/app/v3/api/category", json=body)

    def list_tags(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultListTagVO:
        """获取标签列表"""
        return self._client.get(f"/app/v3/api/category/tags", params=params)

    def create_tag(self, body: TagCreateForm) -> PlusApiResultTagVO:
        """创建标签"""
        return self._client.post(f"/app/v3/api/category/tags", json=body)

    def get_category_path(self, categoryId: str) -> PlusApiResultListCategoryVO:
        """获取分类路径"""
        return self._client.get(f"/app/v3/api/category/{categoryId}/path")

    def get_children(self, categoryId: str) -> PlusApiResultListCategoryVO:
        """获取子分类"""
        return self._client.get(f"/app/v3/api/category/{categoryId}/children")

    def get_category_types(self) -> PlusApiResultListCategoryTypeVO:
        """获取分类类型"""
        return self._client.get(f"/app/v3/api/category/types")

    def get_category_tree(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultListCategoryTreeVO:
        """获取分类树"""
        return self._client.get(f"/app/v3/api/category/tree", params=params)

    def delete_tag(self, tagId: str) -> PlusApiResultVoid:
        """删除标签"""
        return self._client.delete(f"/app/v3/api/category/tags/{tagId}")
