from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PointsTransferVO:
    """积分转账响应"""
    created_at: str = None
    updated_at: str = None
    transaction_id: str = None
    from_account_id: str = None
    to_account_id: str = None
    points: int = None
    status: str = None
    from_points_after: int = None
    to_points_after: int = None
