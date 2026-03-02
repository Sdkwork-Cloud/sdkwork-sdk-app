from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultInteger, PlusApiResultListProductVO, PlusApiResultListSkuVO, PlusApiResultPageProductVO, PlusApiResultProductDetailVO, PlusApiResultProductStatisticsVO, PlusApiResultProductVO

class ProductsApi:
    """products API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

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
