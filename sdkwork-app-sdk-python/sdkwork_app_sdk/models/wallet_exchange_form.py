from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class WalletExchangeForm:
    """钱包兑换请求(积分兑换现金或Token)"""
    points: int
    target: str
    request_no: str = None
    remarks: str = None
