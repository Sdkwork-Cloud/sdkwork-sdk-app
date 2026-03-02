from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class NoteUpdateRequest:
    """更新笔记请求"""
    title: str = None
    content: str = None
    tags: List[str] = None
