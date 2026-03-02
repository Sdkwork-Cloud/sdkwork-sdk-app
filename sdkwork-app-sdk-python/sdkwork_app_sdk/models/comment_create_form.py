from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CommentCreateForm:
    """创建评论表单"""
    content_type: str
    content_id: int
    content: str
    device_info: str = None
