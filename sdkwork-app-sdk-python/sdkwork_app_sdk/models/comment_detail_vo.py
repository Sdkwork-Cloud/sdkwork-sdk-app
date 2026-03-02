from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CommentDetailVO:
    """评论详情响应"""
    created_at: str = None
    updated_at: str = None
    comment_id: str = None
    content: str = None
    content_type: str = None
    content_id: int = None
    user_id: int = None
    status: str = None
    likes: int = None
    reply_count: int = None
    is_top: bool = None
    parent_id: int = None
    ip_address: str = None
    device_info: str = None
    replies: List[CommentVO] = None
