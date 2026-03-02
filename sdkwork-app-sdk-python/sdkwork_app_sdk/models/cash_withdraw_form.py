from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CashWithdrawForm:
    """现金提现请求"""
    amount: float
    withdraw_method: str
    account_no: str = None
    account_name: str = None
    bank_name: str = None
    remarks: str = None
