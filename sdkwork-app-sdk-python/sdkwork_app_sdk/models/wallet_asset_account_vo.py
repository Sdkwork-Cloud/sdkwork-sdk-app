from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class WalletAssetAccountVO:
    """钱包资产账户信息"""
    created_at: str = None
    updated_at: str = None
    account_id: str = None
    account_type: str = None
    account_type_name: str = None
    status: str = None
    status_name: str = None
    available_balance: float = None
    frozen_balance: float = None
    available_points: int = None
    frozen_points: int = None
    available_token: int = None
    frozen_token: int = None
