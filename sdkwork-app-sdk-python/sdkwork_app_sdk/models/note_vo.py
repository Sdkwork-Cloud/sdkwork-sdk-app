from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class NoteVO:
    """笔记响应"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    uuid: str = None
    title: str = None
    content: str = None
    user_id: int = None
    folder_id: str = None
    folder_path: str = None
    tags: List[str] = None
    access_scope: str = None
    has_password: bool = None
    cover_image_url: str = None
    status: str = None
    summary: str = None
    favorited: bool = None
    word_count: int = None
