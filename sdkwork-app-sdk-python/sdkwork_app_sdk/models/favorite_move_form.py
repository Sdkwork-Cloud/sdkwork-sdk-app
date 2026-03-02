from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class FavoriteMoveForm:
    """移动收藏请求"""
    favorite_id: str = None
    target_folder_id: str = None
    folder_id: str = None
