from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class WalletOverviewVO:
    """钱包总览"""
    created_at: str = None
    updated_at: str = None
    user_id: str = None
    snapshot_at: str = None
    cash_available: float = None
    cash_frozen: float = None
    points_available: int = None
    points_frozen: int = None
    token_available: int = None
    token_frozen: int = None
    accounts: List[WalletAssetAccountVO] = None
