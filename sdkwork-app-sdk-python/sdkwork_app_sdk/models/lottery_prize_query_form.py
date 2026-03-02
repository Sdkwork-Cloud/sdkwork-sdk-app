from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class LotteryPrizeQueryForm:
    """中奖记录查询请求"""
    page_num: int = None
    page_size: int = None
    sort_field: str = None
    sort_direction: str = None
    claim_status: str = None
    size: int = None
    page: int = None
