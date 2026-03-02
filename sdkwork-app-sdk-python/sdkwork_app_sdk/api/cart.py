from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import AddCartItemForm, BatchSelectForm, PlusApiResultBoolean, PlusApiResultCartItemVO, PlusApiResultCartStatisticsVO, PlusApiResultListCartItemVO, PlusApiResultShoppingCartVO, PlusApiResultVoid, UpdateCartItemForm

class CartApi:
    """cart API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update_item_quantity(self, itemId: str, body: UpdateCartItemForm) -> PlusApiResultCartItemVO:
        """更新购物车商品数量"""
        return self._client.put(f"/app/v3/api/cart/items/{itemId}", json=body)

    def remove_item(self, itemId: str) -> PlusApiResultVoid:
        """删除购物车商品"""
        return self._client.delete(f"/app/v3/api/cart/items/{itemId}")

    def update_item_selection(self, itemId: str, params: Optional[Dict[str, Any]] = None) -> PlusApiResultVoid:
        """更新商品选中状态"""
        return self._client.put(f"/app/v3/api/cart/items/{itemId}/select", params=params)

    def batch_update_selection(self, body: BatchSelectForm) -> PlusApiResultVoid:
        """批量更新选中状态"""
        return self._client.put(f"/app/v3/api/cart/items/select", json=body)

    def get_cart_items(self) -> PlusApiResultListCartItemVO:
        """获取购物车商品列表"""
        return self._client.get(f"/app/v3/api/cart/items")

    def add_item(self, body: AddCartItemForm) -> PlusApiResultCartItemVO:
        """添加商品到购物车"""
        return self._client.post(f"/app/v3/api/cart/items", json=body)

    def remove_items(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultVoid:
        """批量删除购物车商品"""
        return self._client.delete(f"/app/v3/api/cart/items", params=params)

    def get_my(self) -> PlusApiResultShoppingCartVO:
        """获取当前用户购物车"""
        return self._client.get(f"/app/v3/api/cart")

    def clear(self) -> PlusApiResultVoid:
        """清空购物车"""
        return self._client.delete(f"/app/v3/api/cart")

    def get_cart_statistics(self) -> PlusApiResultCartStatisticsVO:
        """获取购物车统计"""
        return self._client.get(f"/app/v3/api/cart/statistics")

    def get_selected_items(self) -> PlusApiResultListCartItemVO:
        """获取选中的商品列表"""
        return self._client.get(f"/app/v3/api/cart/items/selected")

    def check_item_in(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultBoolean:
        """检查商品是否在购物车中"""
        return self._client.get(f"/app/v3/api/cart/check", params=params)
