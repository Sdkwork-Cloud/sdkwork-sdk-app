from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class NoteCreateRequest:
    """创建笔记请求"""
    title: str = None
    content: str = None
    folder_id: str = None
    disk_id: str = None
    tags: List[str] = None
