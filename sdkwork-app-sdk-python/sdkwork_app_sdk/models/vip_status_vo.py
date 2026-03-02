from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class VipStatusVO:
    is_vip: bool = None
    vip_level: int = None
    expire_time: str = None
    point_balance: int = None
