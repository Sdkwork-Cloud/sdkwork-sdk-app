from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import InvoiceCancelForm, InvoiceCreateForm, InvoiceUpdateForm, PlusApiResultInvoiceDetailVO, PlusApiResultInvoiceStatisticsVO, PlusApiResultInvoiceVO, PlusApiResultListInvoiceItemVO, PlusApiResultPageInvoiceVO, PlusApiResultVoid

class InvoiceApi:
    """invoice API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def get_invoice(self, invoiceId: str) -> PlusApiResultInvoiceDetailVO:
        """获取发票详情"""
        return self._client.get(f"/app/v3/api/invoice/{invoiceId}")

    def update_invoice(self, invoiceId: str, body: InvoiceUpdateForm) -> PlusApiResultInvoiceVO:
        """更新发票"""
        return self._client.put(f"/app/v3/api/invoice/{invoiceId}", json=body)

    def create_invoice(self, body: InvoiceCreateForm) -> PlusApiResultInvoiceVO:
        """创建发票"""
        return self._client.post(f"/app/v3/api/invoice", json=body)

    def submit(self, invoiceId: str) -> PlusApiResultInvoiceVO:
        """提交发票"""
        return self._client.post(f"/app/v3/api/invoice/{invoiceId}/submit")

    def cancel(self, invoiceId: str, body: InvoiceCancelForm) -> PlusApiResultVoid:
        """作废发票"""
        return self._client.post(f"/app/v3/api/invoice/{invoiceId}/cancel", json=body)

    def get_invoice_items(self, invoiceId: str) -> PlusApiResultListInvoiceItemVO:
        """获取发票明细"""
        return self._client.get(f"/app/v3/api/invoice/{invoiceId}/items")

    def get_invoice_statistics(self) -> PlusApiResultInvoiceStatisticsVO:
        """获取发票统计"""
        return self._client.get(f"/app/v3/api/invoice/statistics")

    def search_invoices(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageInvoiceVO:
        """搜索发票"""
        return self._client.get(f"/app/v3/api/invoice/search", params=params)

    def get_my_invoices(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageInvoiceVO:
        """获取我的发票"""
        return self._client.get(f"/app/v3/api/invoice/my", params=params)
