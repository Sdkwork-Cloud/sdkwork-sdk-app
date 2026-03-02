from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class FavoriteFolderCreateForm:
    """创建收藏文件夹请求"""
    folder_name: str = None
    name: str = None
    parent_folder_id: str = None
    folder_description: str = None
