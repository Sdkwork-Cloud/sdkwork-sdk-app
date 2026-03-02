from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import CurrencyConvertForm, CurrencyCreateForm, ExchangeRateCreateForm, PlusApiResultCurrencyConvertVO, PlusApiResultCurrencyVO, PlusApiResultExchangeRateVO, PlusApiResultListCurrencyTypeVO, PlusApiResultListCurrencyVO, PlusApiResultListExchangeRateVO, PlusApiResultPageCurrencyVO

class CurrencyApi:
    """currency API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def create_currency(self, body: CurrencyCreateForm) -> PlusApiResultCurrencyVO:
        """创建货币"""
        return self._client.post(f"/app/v3/api/currency", json=body)

    def deactivate(self, currencyId: str) -> PlusApiResultCurrencyVO:
        """禁用货币"""
        return self._client.post(f"/app/v3/api/currency/{currencyId}/deactivate")

    def activate(self, currencyId: str) -> PlusApiResultCurrencyVO:
        """启用货币"""
        return self._client.post(f"/app/v3/api/currency/{currencyId}/activate")

    def create_exchange_rate(self, body: ExchangeRateCreateForm) -> PlusApiResultExchangeRateVO:
        """创建汇率"""
        return self._client.post(f"/app/v3/api/currency/rate", json=body)

    def convert(self, body: CurrencyConvertForm) -> PlusApiResultCurrencyConvertVO:
        """货币兑换计算"""
        return self._client.post(f"/app/v3/api/currency/convert", json=body)

    def get_currency(self, currencyId: str) -> PlusApiResultCurrencyVO:
        """获取货币详情"""
        return self._client.get(f"/app/v3/api/currency/{currencyId}")

    def get_currency_types(self) -> PlusApiResultListCurrencyTypeVO:
        """获取货币类型列表"""
        return self._client.get(f"/app/v3/api/currency/types")

    def get_latest_rate(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultExchangeRateVO:
        """获取最新汇率"""
        return self._client.get(f"/app/v3/api/currency/rate/latest", params=params)

    def get_rate_history(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultListExchangeRateVO:
        """获取汇率历史"""
        return self._client.get(f"/app/v3/api/currency/rate/history", params=params)

    def get_currency_list(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageCurrencyVO:
        """获取货币列表"""
        return self._client.get(f"/app/v3/api/currency/list", params=params)

    def get_currency_by_code(self, code: str) -> PlusApiResultCurrencyVO:
        """根据代码获取货币"""
        return self._client.get(f"/app/v3/api/currency/code/{code}")

    def get_active_currencies(self) -> PlusApiResultListCurrencyVO:
        """获取启用的货币"""
        return self._client.get(f"/app/v3/api/currency/active")
