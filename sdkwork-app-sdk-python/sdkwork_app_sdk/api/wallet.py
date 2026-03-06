from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultHistoryVO, PlusApiResultListWalletAssetAccountVO, PlusApiResultPageHistoryVO, PlusApiResultWalletOperationResultVO, PlusApiResultWalletOperationStatusVO, PlusApiResultWalletOverviewVO, WalletExchangeForm, WalletTopupForm, WalletTransferForm, WalletWithdrawalForm

class WalletApi:
    """wallet API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def withdraw(self, body: WalletWithdrawalForm) -> PlusApiResultWalletOperationResultVO:
        """钱包提现"""
        return self._client.post(f"/app/v3/api/wallet/withdrawals", json=body)

    def transfer(self, body: WalletTransferForm) -> PlusApiResultWalletOperationResultVO:
        """钱包转账"""
        return self._client.post(f"/app/v3/api/wallet/transfers", json=body)

    def topup(self, body: WalletTopupForm) -> PlusApiResultWalletOperationResultVO:
        """钱包充值"""
        return self._client.post(f"/app/v3/api/wallet/topups", json=body)

    def exchange(self, body: WalletExchangeForm) -> PlusApiResultWalletOperationResultVO:
        """钱包兑换"""
        return self._client.post(f"/app/v3/api/wallet/exchanges", json=body)

    def get_overview(self) -> PlusApiResultWalletOverviewVO:
        """钱包总览"""
        return self._client.get(f"/app/v3/api/wallet")

    def list_transactions(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageHistoryVO:
        """钱包流水分页"""
        return self._client.get(f"/app/v3/api/wallet/transactions", params=params)

    def get_transaction(self, transactionId: str) -> PlusApiResultHistoryVO:
        """交易详情"""
        return self._client.get(f"/app/v3/api/wallet/transactions/{transactionId}")

    def get_operation_status(self, requestNo: str, params: Optional[Dict[str, Any]] = None) -> PlusApiResultWalletOperationStatusVO:
        """按请求号查询操作状态"""
        return self._client.get(f"/app/v3/api/wallet/operations/{requestNo}", params=params)

    def list_accounts(self) -> PlusApiResultListWalletAssetAccountVO:
        """资产账户列表"""
        return self._client.get(f"/app/v3/api/wallet/accounts")
