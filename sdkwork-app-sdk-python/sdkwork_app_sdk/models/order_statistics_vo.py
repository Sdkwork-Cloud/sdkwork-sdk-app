from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class OrderStatisticsVO:
    """订单统计响应"""
    created_at: str = None
    updated_at: str = None
    total_orders: int = None
    pending_payment: int = None
    pending_shipment: int = None
    pending_receipt: int = None
    completed: int = None
    total_amount: str = None
