from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class NoteListQueryRequest:
    """笔记列表查询请求"""
    page_num: int = None
    page_size: int = None
    sort_field: str = None
    sort_order: str = None
    folder_id: str = None
    disk_id: str = None
    keyword: str = None
    include_archived: bool = None
    include_deleted: bool = None
    favorite_only: bool = None
