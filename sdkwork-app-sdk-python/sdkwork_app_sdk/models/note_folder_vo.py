from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class NoteFolderVO:
    """笔记文件夹响应"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    uuid: str = None
    name: str = None
    parent_id: int = None
    parent_name: str = None
    path: str = None
    sub_folder_count: int = None
    note_count: int = None
    children: List[NoteFolderVO] = None
