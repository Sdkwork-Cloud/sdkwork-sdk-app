from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultListShopVO, PlusApiResultPageShopVO, PlusApiResultShopDetailVO, PlusApiResultShopStatisticsVO, PlusApiResultShopVO, PlusApiResultVoid, ShopCreateForm, ShopUpdateForm

class ShopsApi:
    """shops API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def get_shop_detail(self, shopId: str) -> PlusApiResultShopDetailVO:
        """获取店铺详情"""
        return self._client.get(f"/app/v3/api/shops/{shopId}")

    def update_shop(self, shopId: str, body: ShopUpdateForm) -> PlusApiResultShopVO:
        """更新店铺"""
        return self._client.put(f"/app/v3/api/shops/{shopId}", json=body)

    def delete_shop(self, shopId: str) -> PlusApiResultVoid:
        """删除店铺"""
        return self._client.delete(f"/app/v3/api/shops/{shopId}")

    def update_status(self, shopId: str, params: Optional[Dict[str, Any]] = None) -> PlusApiResultVoid:
        """更新店铺状态"""
        return self._client.put(f"/app/v3/api/shops/{shopId}/status", params=params)

    def open_shop(self, shopId: str) -> PlusApiResultVoid:
        """开店营业"""
        return self._client.put(f"/app/v3/api/shops/{shopId}/open")

    def close_shop(self, shopId: str) -> PlusApiResultVoid:
        """关店休息"""
        return self._client.put(f"/app/v3/api/shops/{shopId}/close")

    def list_shops(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageShopVO:
        """获取店铺列表"""
        return self._client.get(f"/app/v3/api/shops", params=params)

    def create_shop(self, body: ShopCreateForm) -> PlusApiResultShopVO:
        """创建店铺"""
        return self._client.post(f"/app/v3/api/shops", json=body)

    def get_statistics(self) -> PlusApiResultShopStatisticsVO:
        """获取店铺统计"""
        return self._client.get(f"/app/v3/api/shops/statistics")

    def list_all_active(self) -> PlusApiResultListShopVO:
        """获取所有激活店铺"""
        return self._client.get(f"/app/v3/api/shops/all")
