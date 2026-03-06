from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import CashRechargeForm, CashTransferForm, CashWithdrawForm, PlusApiResultBigDecimal, PlusApiResultCashAccountInfoVO, PlusApiResultCashRechargeVO, PlusApiResultCashTransferVO, PlusApiResultCashWithdrawVO, PlusApiResultPageHistoryVO, PlusApiResultPointsAccountInfoVO, PlusApiResultPointsExchangeVO, PlusApiResultPointsTransferVO, PointsExchangeForm, PointsTransferForm

class AccountApi:
    """account API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def transfer(self, body: PointsTransferForm) -> PlusApiResultPointsTransferVO:
        """积分转账"""
        return self._client.post(f"/app/v3/api/account/points/transfer", json=body)

    def deduct_token(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPointsAccountInfoVO:
        """扣除Token"""
        return self._client.post(f"/app/v3/api/account/points/token/deduct", params=params)

    def exchange(self, body: PointsExchangeForm) -> PlusApiResultPointsExchangeVO:
        """积分兑换"""
        return self._client.post(f"/app/v3/api/account/points/exchange", json=body)

    def withdraw(self, body: CashWithdrawForm) -> PlusApiResultCashWithdrawVO:
        """提现"""
        return self._client.post(f"/app/v3/api/account/cash/withdraw", json=body)

    def create_transfer(self, body: CashTransferForm) -> PlusApiResultCashTransferVO:
        """转账"""
        return self._client.post(f"/app/v3/api/account/cash/transfer", json=body)

    def recharge(self, body: CashRechargeForm) -> PlusApiResultCashRechargeVO:
        """充值"""
        return self._client.post(f"/app/v3/api/account/cash/recharge", json=body)

    def get_points(self) -> PlusApiResultPointsAccountInfoVO:
        """获取积分账户信息"""
        return self._client.get(f"/app/v3/api/account/points")

    def get_token(self) -> PlusApiResultPointsAccountInfoVO:
        """获取Token账户信息"""
        return self._client.get(f"/app/v3/api/account/points/token")

    def get_history(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageHistoryVO:
        """获取交易历史"""
        return self._client.get(f"/app/v3/api/account/points/history", params=params)

    def get_points_to_cash_rate(self) -> PlusApiResultBigDecimal:
        """获取积分兑换现金比例"""
        return self._client.get(f"/app/v3/api/account/points/exchange-rate")

    def get_cash(self) -> PlusApiResultCashAccountInfoVO:
        """获取现金账户信息"""
        return self._client.get(f"/app/v3/api/account/cash")

    def get_history_cash(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageHistoryVO:
        """获取交易历史"""
        return self._client.get(f"/app/v3/api/account/cash/history", params=params)
