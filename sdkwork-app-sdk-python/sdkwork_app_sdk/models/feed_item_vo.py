from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class FeedItemVO:
    """Feed项响应"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    title: str = None
    content: str = None
    summary: str = None
    cover_image: str = None
    content_type: str = None
    tags: List[str] = None
    author: AuthorInfo = None
    view_count: int = None
    like_count: int = None
    comment_count: int = None
    share_count: int = None
    is_liked: bool = None
    is_collected: bool = None
