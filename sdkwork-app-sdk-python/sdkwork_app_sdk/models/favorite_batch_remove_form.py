from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class FavoriteBatchRemoveForm:
    """批量删除收藏请求"""
    favorite_ids: List[str] = None
