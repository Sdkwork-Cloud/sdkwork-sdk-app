from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class OrderListQueryForm:
    """查询订单列表请求"""
    page: int = None
    size: int = None
    status: str = None
    order_type: str = None
    keyword: str = None
    start_time: str = None
    end_time: str = None
