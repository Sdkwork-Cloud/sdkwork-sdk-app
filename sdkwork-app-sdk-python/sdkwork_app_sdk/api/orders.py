from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import OrderCancelForm, OrderCreateForm, OrderPayForm, PlusApiResultOrderDetailVO, PlusApiResultOrderStatisticsVO, PlusApiResultOrderStatusVO, PlusApiResultOrderVO, PlusApiResultPageOrderVO, PlusApiResultPaymentParamsVO, PlusApiResultVoid, RefundApplyForm

class OrdersApi:
    """orders API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def list_orders(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageOrderVO:
        """获取订单列表"""
        return self._client.get(f"/app/v3/api/orders", params=params)

    def create_order(self, body: OrderCreateForm) -> PlusApiResultOrderVO:
        """创建订单"""
        return self._client.post(f"/app/v3/api/orders", json=body)

    def apply_refund(self, orderId: str, body: RefundApplyForm) -> PlusApiResultVoid:
        """申请退款"""
        return self._client.post(f"/app/v3/api/orders/{orderId}/refund", json=body)

    def pay_order(self, orderId: str, body: OrderPayForm) -> PlusApiResultPaymentParamsVO:
        """订单支付"""
        return self._client.post(f"/app/v3/api/orders/{orderId}/pay", json=body)

    def confirm_receipt(self, orderId: str) -> PlusApiResultVoid:
        """确认收货"""
        return self._client.post(f"/app/v3/api/orders/{orderId}/confirm")

    def cancel_order(self, orderId: str, body: OrderCancelForm) -> PlusApiResultVoid:
        """取消订单"""
        return self._client.post(f"/app/v3/api/orders/{orderId}/cancel", json=body)

    def get_order_detail(self, orderId: str) -> PlusApiResultOrderDetailVO:
        """获取订单详情"""
        return self._client.get(f"/app/v3/api/orders/{orderId}")

    def delete_order(self, orderId: str) -> PlusApiResultVoid:
        """删除订单"""
        return self._client.delete(f"/app/v3/api/orders/{orderId}")

    def get_order_status(self, orderId: str) -> PlusApiResultOrderStatusVO:
        """获取订单状态"""
        return self._client.get(f"/app/v3/api/orders/{orderId}/status")

    def get_order_statistics(self) -> PlusApiResultOrderStatisticsVO:
        """获取订单统计"""
        return self._client.get(f"/app/v3/api/orders/statistics")
