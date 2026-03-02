from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class FavoriteBatchCheckForm:
    """批量检查收藏请求"""
    favorite_type: str = None
    target_ids: List[str] = None
    items: List[CheckItem] = None
