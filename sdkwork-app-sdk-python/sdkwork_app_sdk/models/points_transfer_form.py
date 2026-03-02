from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PointsTransferForm:
    """积分转账请求"""
    to_user_id: str
    points: int
    remarks: str = None
