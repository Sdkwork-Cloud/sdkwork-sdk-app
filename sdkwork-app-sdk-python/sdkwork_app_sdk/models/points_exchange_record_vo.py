from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PointsExchangeRecordVO:
    """积分兑换记录"""
    created_at: str = None
    updated_at: str = None
    record_id: str = None
    goods_id: str = None
    goods_name: str = None
    goods_image: str = None
    quantity: int = None
    points_cost: int = None
    exchange_time: str = None
    status: str = None
    deliver_time: str = None
    logistics_info: str = None
    remark: str = None
