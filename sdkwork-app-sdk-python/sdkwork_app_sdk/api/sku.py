from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListSkuVO, PlusApiResultPageSkuVO, PlusApiResultSkuDetailVO, PlusApiResultSkuStatisticsVO, PlusApiResultSkuStockVO, PlusApiResultSkuVO

class SkuApi:
    """sku API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def get_sku_detail(self, skuId: str) -> PlusApiResultSkuDetailVO:
        """获取SKU详情"""
        return self._client.get(f"/app/v3/api/skus/{skuId}")

    def get_sku_stock(self, skuId: str) -> PlusApiResultSkuStockVO:
        """获取SKU库存"""
        return self._client.get(f"/app/v3/api/skus/{skuId}/stock")

    def check_sku_stock(self, skuId: str, params: Optional[Dict[str, Any]] = None) -> PlusApiResultBoolean:
        """检查SKU库存"""
        return self._client.get(f"/app/v3/api/skus/{skuId}/check-stock", params=params)

    def get_sku_by_product(self, productId: str, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageSkuVO:
        """获取产品的SKU列表"""
        return self._client.get(f"/app/v3/api/skus/product/{productId}", params=params)

    def get_sku_statistics(self, productId: str) -> PlusApiResultSkuStatisticsVO:
        """获取产品SKU统计"""
        return self._client.get(f"/app/v3/api/skus/product/{productId}/statistics")

    def check_sku_code_exists(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultBoolean:
        """检查SKU编码是否存在"""
        return self._client.get(f"/app/v3/api/skus/exists", params=params)

    def get_sku_by_code(self, skuCode: str) -> PlusApiResultSkuVO:
        """按编码获取SKU"""
        return self._client.get(f"/app/v3/api/skus/code/{skuCode}")

    def batch_get_skus(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultListSkuVO:
        """批量获取SKU"""
        return self._client.get(f"/app/v3/api/skus/batch", params=params)
