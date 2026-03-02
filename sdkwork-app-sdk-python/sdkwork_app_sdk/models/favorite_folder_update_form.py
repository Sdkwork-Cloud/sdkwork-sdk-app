from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class FavoriteFolderUpdateForm:
    """更新收藏文件夹请求"""
    folder_id: str = None
    folder_name: str = None
    parent_folder_id: str = None
    folder_description: str = None
