from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class VipPointsHistoryVO:
    """VIP积分历史响应"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    change_type: str = None
    change_amount: int = None
    before_balance: int = None
    after_balance: int = None
    source_type: str = None
    remark: str = None
