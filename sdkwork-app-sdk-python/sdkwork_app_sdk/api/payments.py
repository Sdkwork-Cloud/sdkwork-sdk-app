from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PaymentCallbackRequest, PaymentCallbackResponse, PaymentCreateForm, PlusApiResultListPaymentMethodVO, PlusApiResultListPaymentStatusVO, PlusApiResultPagePaymentStatusVO, PlusApiResultPaymentStatisticsVO, PlusApiResultPaymentStatusVO, PlusApiResultPaymentVO, PlusApiResultVoid

class PaymentsApi:
    """payments API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def create_payment(self, body: PaymentCreateForm) -> PlusApiResultPaymentVO:
        """创建支付"""
        return self._client.post(f"/app/v3/api/payments", json=body)

    def close_payment(self, paymentId: str) -> PlusApiResultVoid:
        """关闭支付"""
        return self._client.post(f"/app/v3/api/payments/{paymentId}/close")

    def payment_callback(self, provider: str, body: PaymentCallbackRequest) -> PaymentCallbackResponse:
        """通用支付回调"""
        return self._client.post(f"/app/v3/api/payments/callback/{provider}", json=body)

    def wechat_pay_callback(self, body: str) -> str:
        """微信支付回调"""
        return self._client.post(f"/app/v3/api/payments/callback/wechat", json=body)

    def alipay_callback(self, params: Optional[Dict[str, Any]] = None) -> str:
        """支付宝回调"""
        return self._client.post(f"/app/v3/api/payments/callback/alipay", params=params)

    def get_payment_detail(self, paymentId: str) -> PlusApiResultPaymentStatusVO:
        """查询支付详情"""
        return self._client.get(f"/app/v3/api/payments/{paymentId}")

    def get_payment_status(self, paymentId: str) -> PlusApiResultPaymentStatusVO:
        """查询支付状态"""
        return self._client.get(f"/app/v3/api/payments/{paymentId}/status")

    def get_payment_statistics(self) -> PlusApiResultPaymentStatisticsVO:
        """获取支付统计"""
        return self._client.get(f"/app/v3/api/payments/statistics")

    def list_payment_records(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePaymentStatusVO:
        """获取支付记录"""
        return self._client.get(f"/app/v3/api/payments/records", params=params)

    def get_payment_status_by_out_trade_no(self, outTradeNo: str) -> PlusApiResultPaymentStatusVO:
        """根据商户订单号查询支付状态"""
        return self._client.get(f"/app/v3/api/payments/outTradeNo/{outTradeNo}/status")

    def list_order(self, orderId: str) -> PlusApiResultListPaymentStatusVO:
        """获取订单的支付记录"""
        return self._client.get(f"/app/v3/api/payments/order/{orderId}")

    def list_payment_methods(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultListPaymentMethodVO:
        """获取支付方式"""
        return self._client.get(f"/app/v3/api/payments/methods", params=params)
