from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class FavoriteFolderVO:
    """收藏文件夹响应"""
    created_at: str = None
    updated_at: str = None
    folder_id: str = None
    folder_name: str = None
    parent_folder_id: str = None
    folder_description: str = None
    sub_folders: List[FavoriteFolderVO] = None
    favorite_items: List[FavoriteItemVO] = None
    create_time: str = None
    update_time: str = None
    favorite_count: int = None
