from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class RecentProjectVO:
    """最近项目响应"""
    created_at: str = None
    updated_at: str = None
    id: str = None
    name: str = None
    description: str = None
    icon: str = None
    cover: str = None
    type: str = None
    status: str = None
    url: str = None
    create_time: str = None
    update_time: str = None
    member_count: int = None
    file_count: int = None
    size: int = None
    tags: List[str] = None
    is_public: bool = None
    is_favorite: bool = None
