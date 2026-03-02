from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class VipPackGroupQueryForm:
    """VIP套餐分组查询请求"""
    vip_level_id: int = None
    recommended_only: bool = None
