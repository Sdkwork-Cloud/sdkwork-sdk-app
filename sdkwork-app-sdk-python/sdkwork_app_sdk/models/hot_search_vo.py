from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class HotSearchVO:
    """热门搜索响应"""
    created_at: str = None
    updated_at: str = None
    keyword: str = None
    count: int = None
    rank: int = None
