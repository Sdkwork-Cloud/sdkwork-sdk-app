from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultInteger, PlusApiResultListProductAttributeVO, PlusApiResultListProductCategoryVO, PlusApiResultListProductVO, PlusApiResultListSkuVO, PlusApiResultPageProductVO, PlusApiResultProductAttributeVO, PlusApiResultProductCategoryVO, PlusApiResultProductDetailVO, PlusApiResultProductStatisticsVO, PlusApiResultProductVO, PlusApiResultVoid, ProductAttributeCreateRequest, ProductAttributeUpdateRequest, ProductCategoryCreateRequest, ProductCategoryUpdateRequest

class ProductsApi:
    """products API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update_product_attribute(self, productId: str, attributeId: str, body: ProductAttributeUpdateRequest) -> PlusApiResultProductAttributeVO:
        """更新商品属性"""
        return self._client.put(f"/app/v3/api/products/{productId}/attributes/{attributeId}", json=body)

    def delete_product_attribute(self, productId: str, attributeId: str) -> PlusApiResultVoid:
        """删除商品属性"""
        return self._client.delete(f"/app/v3/api/products/{productId}/attributes/{attributeId}")

    def update_product_category(self, categoryId: str, body: ProductCategoryUpdateRequest) -> PlusApiResultProductCategoryVO:
        """更新商品分类"""
        return self._client.put(f"/app/v3/api/products/categories/{categoryId}", json=body)

    def delete_product_category(self, categoryId: str) -> PlusApiResultVoid:
        """删除商品分类"""
        return self._client.delete(f"/app/v3/api/products/categories/{categoryId}")

    def list_product_attributes(self, productId: str) -> PlusApiResultListProductAttributeVO:
        """获取商品属性"""
        return self._client.get(f"/app/v3/api/products/{productId}/attributes")

    def create_product_attribute(self, productId: str, body: ProductAttributeCreateRequest) -> PlusApiResultProductAttributeVO:
        """创建商品属性"""
        return self._client.post(f"/app/v3/api/products/{productId}/attributes", json=body)

    def list_product_categories(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultListProductCategoryVO:
        """获取商品分类列表"""
        return self._client.get(f"/app/v3/api/products/categories", params=params)

    def create_product_category(self, body: ProductCategoryCreateRequest) -> PlusApiResultProductCategoryVO:
        """创建商品分类"""
        return self._client.post(f"/app/v3/api/products/categories", json=body)

    def get_products(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageProductVO:
        """获取商品列表"""
        return self._client.get(f"/app/v3/api/products", params=params)

    def get_product_detail(self, productId: str) -> PlusApiResultProductDetailVO:
        """获取商品详情"""
        return self._client.get(f"/app/v3/api/products/{productId}")

    def get_product_stock(self, productId: str) -> PlusApiResultInteger:
        """获取商品库存"""
        return self._client.get(f"/app/v3/api/products/{productId}/stock")

    def get_product_statistics(self, productId: str) -> PlusApiResultProductStatisticsVO:
        """获取商品统计"""
        return self._client.get(f"/app/v3/api/products/{productId}/statistics")

    def get_spu_detail(self, productId: str) -> PlusApiResultProductDetailVO:
        """获取SPU详情"""
        return self._client.get(f"/app/v3/api/products/{productId}/spu")

    def get_product_skus(self, productId: str, params: Optional[Dict[str, Any]] = None) -> PlusApiResultListSkuVO:
        """获取商品SKU列表"""
        return self._client.get(f"/app/v3/api/products/{productId}/skus", params=params)

    def check_product_stock(self, productId: str, params: Optional[Dict[str, Any]] = None) -> PlusApiResultBoolean:
        """检查商品库存"""
        return self._client.get(f"/app/v3/api/products/{productId}/check-stock", params=params)

    def search(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageProductVO:
        """搜索商品"""
        return self._client.get(f"/app/v3/api/products/search", params=params)

    def get_latest(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultListProductVO:
        """获取最新商品"""
        return self._client.get(f"/app/v3/api/products/latest", params=params)

    def get_hot(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultListProductVO:
        """获取热门商品"""
        return self._client.get(f"/app/v3/api/products/hot", params=params)

    def get_product_by_code(self, code: str) -> PlusApiResultProductVO:
        """按编码获取商品"""
        return self._client.get(f"/app/v3/api/products/code/{code}")

    def get_products_by_category(self, categoryId: str, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageProductVO:
        """按分类获取商品"""
        return self._client.get(f"/app/v3/api/products/category/{categoryId}", params=params)

    def list_category_attributes(self, categoryId: str) -> PlusApiResultListProductAttributeVO:
        """获取分类属性"""
        return self._client.get(f"/app/v3/api/products/categories/{categoryId}/attributes")

    def get_product_category_tree(self) -> PlusApiResultListProductCategoryVO:
        """获取商品分类树"""
        return self._client.get(f"/app/v3/api/products/categories/tree")
