from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class FavoriteBatchMoveForm:
    """批量移动收藏请求"""
    favorite_ids: List[str] = None
    target_folder_id: str = None
    folder_id: str = None
