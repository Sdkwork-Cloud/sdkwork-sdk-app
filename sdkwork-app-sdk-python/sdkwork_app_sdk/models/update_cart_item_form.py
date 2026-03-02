from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class UpdateCartItemForm:
    """更新购物车项数量请求"""
    quantity: int
