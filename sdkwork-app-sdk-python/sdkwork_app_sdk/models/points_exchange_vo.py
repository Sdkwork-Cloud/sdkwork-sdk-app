from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PointsExchangeVO:
    """积分兑换结果"""
    created_at: str = None
    updated_at: str = None
    record_id: str = None
    success: bool = None
    goods_name: str = None
    points_cost: int = None
    remaining_points: int = None
    quantity: int = None
    exchange_time: str = None
    status: str = None
    reward_content: str = None
    message: str = None
