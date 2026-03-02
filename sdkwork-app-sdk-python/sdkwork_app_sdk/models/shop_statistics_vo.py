from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ShopStatisticsVO:
    total_shops: int = None
    active_shops: int = None
    inactive_shops: int = None
