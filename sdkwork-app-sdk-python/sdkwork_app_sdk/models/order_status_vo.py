from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class OrderStatusVO:
    order_id: str = None
    status: str = None
    status_name: str = None
    expire_time: int = None
